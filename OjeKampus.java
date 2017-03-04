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
   public static Ojek ojek_yudha;
   public static Pelanggan pelanggan1;
   public static DatabaseUser database;
   public static DatabasePesanan databasePesanan;
   public static Lokasi lokasi_ojek;
   public static Pelanggan p_putra;
   public static Lokasi per_putra_awal;
   public static Lokasi per_putra_akhir;
   public static Pesanan pes_putra;
   
    
   public OjeKampus()
   {
   
   }
   
   public void main(String[] args) //Fungsi utama Program OjeKampus
   {
       database = new DatabaseUser();
       databasePesanan = new DatabasePesanan();
       lokasi_ojek = new Lokasi("UI",14,06,"Depok");
       ojek_yudha = new Ojek(database.getIDOjekTerakhir(), "yudha", lokasi_ojek);
       p_putra = new Pelanggan(database.getIDPelangganTerakhir(), "putra");
       per_putra_awal = new Lokasi("FT",5,3,"Depok");
       per_putra_akhir = new Lokasi("Ciputat",1,9,"Tangerang Selatan");
       pes_putra = new Pesanan(p_putra,"Antar", per_putra_awal, per_putra_akhir, "Jeffry", "Izzan", 10000);
       database.addOjek(ojek_yudha);
       database.addPelanggan(p_putra);
       databasePesanan.addPesanan(pes_putra);
       ojek_yudha.printData();
       p_putra.printData();
       pes_putra.printData();
    }
  
   
}