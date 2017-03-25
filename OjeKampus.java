
/**
 * Write a description of class OjeKampus here.
 * Kelas OjeKampus ini merupakan main class dari project yang terdiri dari 
 * constructornya sendiri dan method main. Pada kelas ini program utama 
 * dijalankan.
 * @author Yudha Dwi Putra
 * @version 04/03/2017
 */
public class OjeKampus

{
   //instance variable
   public static Ojek ojek_yudha;
   public static DatabaseUser databaseUser;
   public static DatabasePesanan databasePesanan;
   public static Administrasi administrasi;
   public static Lokasi lokasi_ojek;
   public static Pelanggan pelanggan_putra;
   public static Lokasi lokasi_putra_awal;
   public static Lokasi lokasi_putra_akhir;
   public static Pesanan pesanan_putra;
   private TipeLayanan layanan;
   
     /* Multi line comment
     * Constructor Ojekampus
     * Constructor ini tidak perlu diberikan apapun, karena class ini tidak memerlukan apapun ketika
     * dieksekusi
     */
   public OjeKampus() //construktor
   {
   
   }
   
      /**
     * Method Main. 
     * Metode utama pada project ojekampus yang akan dialankan ketika project di compile dan di run.
     * @param  String args[]    argumen yang diberikan untuk metode main.
     */
    public static void main(String args[])
    {
        //Modul 5 Tugas 4
        System.out.println("\n");
        Lokasi lokasi_ojek1 = new Lokasi("Ciputat",04,12,"Tangerang");
        Ojek ojek1 = new Ojek(1,"Yudha", lokasi_ojek1);
        DatabaseUser.addOjek(ojek1);
        Lokasi lokasi_ojek2 = new Lokasi("Pasar Minggu",56,78,"Jakarta Selatan");
        Ojek ojek2 = new Ojek(2,"Irfan", lokasi_ojek2);
        DatabaseUser.addOjek(ojek2);
        Lokasi lokasi_ojek3 = new Lokasi("Cijantung",67,89,"Jakarta Timur");
        Ojek ojek3 = new Ojek(3,"Yunus", lokasi_ojek3);
        DatabaseUser.addOjek(ojek3);
        Pelanggan pelanggan1 = new Pelanggan(1, "Destian","081234567890");
        DatabaseUser.addPelanggan(pelanggan1);
        Pelanggan pelanggan2 = new Pelanggan(2, "Yuda","089876543210");
        DatabaseUser.addPelanggan(pelanggan2);
        Pelanggan pelanggan3 = new Pelanggan(3, "Aulya","082345678901");
        DatabaseUser.addPelanggan(pelanggan3);
        
        Lokasi lokasi_awal_pesanan1 = new Lokasi("Margonda",12,34,"Depok");
        Lokasi lokasi_akhir_pesanan1 = new Lokasi("Juanda",12,45,"Depok");
        Pesanan pesanan1 = new Pesanan(pelanggan1,TipeLayanan.BeliBarang,lokasi_awal_pesanan1,lokasi_akhir_pesanan1,pelanggan1.getNama());
        DatabasePesanan.addPesanan(pesanan1);
        
        Lokasi lokasi_awal_pesanan2 = new Lokasi("Fatmawati",23,45,"Jakarta Selatan");
        Lokasi lokasi_akhir_pesanan2 = new Lokasi("Pancoran",23,67,"Jakarta Selatan");
        Pesanan pesanan2 = new Pesanan(pelanggan2,TipeLayanan.AntarBarang,lokasi_awal_pesanan2,lokasi_akhir_pesanan2,pelanggan2.getNama(), "Irfan");
        DatabasePesanan.addPesanan(pesanan2);
        
        Lokasi lokasi_awal_pesanan3 = new Lokasi("Tanjung Priok",34,56,"Jakarta Utara");
        Lokasi lokasi_akhir_pesanan3 = new Lokasi("Mangga dua",34,78,"Jakarta Barat");
        Pesanan pesanan3 = new Pesanan(pelanggan3,TipeLayanan.AntarOrang,lokasi_awal_pesanan3,lokasi_akhir_pesanan3,pelanggan3.getNama());
        DatabasePesanan.addPesanan(pesanan3);
        
        Administrasi.printAllDatabase();
        Administrasi.jalankanSistemPenugas();
        Administrasi.jalankanSistemPenugas();
        Administrasi.jalankanSistemPenugas();
        System.out.println("\n");
        Administrasi.printAllDatabase();
        
        Administrasi.pesananDibatalkan(pesanan1.getPelanggan());
        Administrasi.pesananDibatalkan(pesanan2.getPelayan());
        pesanan3.getPelayan().setStatus(StatusOjek.Antar);
        System.out.println("\n");
        Administrasi.printAllDatabase();
        
        Administrasi.pesananSelesai(pesanan3.getPelanggan());
        DatabasePesanan.hapusPesanan(pesanan3.getPelanggan());
        System.out.println("\n");
        Administrasi.printAllDatabase();
        
        
    }
}