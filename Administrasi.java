import java.util.*;
import static java.lang.Math.*;
/**
 * Write a description of class Administrasi here.
 * Kelas Administrasi merupakan kelas yang berisi metode pemberian tugas dan pembatalan tugas
 * oleh ojek ataupun oleh pesanan
 * @author (Yudha Dwi Putra) 
 * @version (25 Mar 2017)
 */
public class Administrasi
{
    // instance variables - replace the example below with your own
    public static void pesananDitugaskan(Pesanan pesan, Ojek pelayan){
        pesan.setStatusSelesai(false);
        pesan.setStatusDiproses(true);
        pesan.setPelayan(pelayan);
        ojekAmbilPesanan(pesan,pelayan);
    }
    
    public static void ojekAmbilPesanan(Pesanan pesan, Ojek pelayan){
        pelayan.setStatus(StatusOjek.Jemput);
        pelayan.setPesanan(pesan);
    }   
    
    public static void ojekLepasPesanan(Ojek pelayan){
        pelayan.setStatus(StatusOjek.Idle);
        pelayan.setPesanan(null);
    }
    
    public static void pesananDibatalkan(Ojek pelayan){
        Pesanan pesan = pelayan.getPesanan();
        pesan.setStatusDiproses(false);
        pesan.setStatusSelesai(false);
        pesan.setPelayan(null);
        ojekLepasPesanan(pelayan);
    }
    
    public static void pesananSelesai(Ojek pelayan){
        Pesanan pesan = pelayan.getPesanan();
        pesan.setStatusDiproses(false);
        pesan.setStatusSelesai(true);
        pesan.setPelayan(null);
        ojekLepasPesanan(pelayan);
    }
    
    public static void pesananDibatalkan(Pesanan pesan){
        pesan.setStatusDiproses(false);
        pesan.setStatusSelesai(false);
        ojekLepasPesanan(pesan.getPelayan());
        pesan.setPelayan(null);
    }
    
    public static void pesananSelesai(Pesanan pesan){
        pesan.setStatusDiproses(false);
        pesan.setStatusSelesai(true);
        ojekLepasPesanan(pesan.getPelayan());
        pesan.setPelayan(null);
    }
    
    public static void pesananDibatalkan(Pelanggan pengguna){
        Pesanan pesan = DatabasePesanan.getPesanan(pengguna);
        pesan.setStatusDiproses(false);
        pesan.setStatusSelesai(false);
        ojekLepasPesanan(pesan.getPelayan());
        pesan.setPelayan(null);
    }
    
    public static void pesananSelesai(Pelanggan pengguna){
        Pesanan pesan = DatabasePesanan.getPesanan(pengguna);
        pesan.setStatusDiproses(false);
        pesan.setStatusSelesai(true);
        ojekLepasPesanan(pesan.getPelayan());
        pesan.setPelayan(null);
    }
    
    private static Pesanan cariPesananIdle(){
        ArrayList<Pesanan>  pesanan_db = new ArrayList<>();
        pesanan_db.addAll(DatabasePesanan.getDatabase());
        
        for(Pesanan pesan : pesanan_db){
            if(pesan.getStatusDiproses() == false){
                if(pesan.getStatusSelesai() == false){
                 return pesan;
                }
            }
        }
        return null;
    }
    
    private static Ojek temukanOjekTerdekat(Pesanan pesan){
        ArrayList<Ojek>  Ojek_db = new ArrayList<>();
        Lokasi lokasi_pengguna = pesan.getLokasiAwal();
        Ojek_db.addAll(DatabaseUser.getOjekDatabase());
        Ojek ojek_terdekat = null;
        Lokasi lokasi_ojek = null;
        double x =0;
        double jarak =0;
        double y =0;
        int count=0;
        double jarak_terdekat=0;
        for(Ojek ojek_temp : Ojek_db){
            if(ojek_temp.getStatus().equals(StatusOjek.Idle)){
                lokasi_ojek = ojek_temp.getPosisi();
                x = Math.abs(lokasi_ojek.getX() - lokasi_pengguna.getX());
                y = Math.abs(lokasi_ojek.getY() - lokasi_pengguna.getY());
                jarak  = Math.sqrt((x*x)+(y*y));
                if(count == 0){
                    jarak_terdekat = jarak;
                    ojek_terdekat = ojek_temp;
                    count++;
                }
                else{
                    if(jarak<jarak_terdekat){
                        ojek_terdekat = ojek_temp;
                    }
                }
            }
        }
        return ojek_terdekat;
    }
    
    public static void jalankanSistemPenugas(){
        Pesanan pesanan_idle = cariPesananIdle();
        Ojek ojek_terdekat = temukanOjekTerdekat(pesanan_idle);
        pesananDitugaskan(pesanan_idle,ojek_terdekat);
    }
    
    public static void printOjekDatabase(){
        System.out.println("Database Ojek : " + DatabaseUser.getOjekDatabase());
    }
    
    public static void printPelangganDatabase(){
        System.out.println("Database Pelanggan : " + DatabaseUser.getPelangganDatabase());
    }
    
    public static void printPesananDatabase(){
        System.out.println("Database Pesanan : " + DatabasePesanan.getDatabase());
    }
    
    public static void printAllDatabase(){
        printPesananDatabase();
        printPelangganDatabase();
        printOjekDatabase();
    }
    
    
}
