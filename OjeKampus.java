
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
   public void main(String[] args) //Fungsi utama Program OjeKampus
   {
       databaseUser = new DatabaseUser(); //objek
       databasePesanan = new DatabasePesanan();
       administrasi = new Administrasi();
       lokasi_ojek = new Lokasi("UI",14,06,"Depok");
       ojek_yudha = new Ojek(databaseUser.getIDOjekTerakhir(), "yudha", lokasi_ojek);
       pelanggan_putra = new Pelanggan(databaseUser.getIDPelangganTerakhir(), "putra");
       lokasi_putra_awal = new Lokasi("FT",5,3,"Depok");
       lokasi_putra_akhir = new Lokasi("Ciputat",1,9,"Tangerang Selatan");
       pesanan_putra = new Pesanan(pelanggan_putra,TipeLayanan.AntarOrang, lokasi_putra_awal, lokasi_putra_akhir, "Jeffry", "Izzan", 10000);
       databaseUser.addOjek(ojek_yudha);
       databaseUser.addPelanggan(pelanggan_putra);
       databasePesanan.addPesanan(pesanan_putra);
       
       
       System.out.println("\n=== Pesanan Ditugaskan ===");
       administrasi.pesananDitugaskan(pesanan_putra,ojek_yudha);
       databaseUser.getUserOjek().printData();
       databaseUser.getUserPelanggan().printData();
       pesanan_putra.printData();

       System.out.println("\n=== Pesanan Dibatalkan (OJEK) ===");
       administrasi.pesananDitugaskan(pesanan_putra,ojek_yudha);
       administrasi.pesananDibatalkan(ojek_yudha);
       databaseUser.getUserOjek().printData();
       databaseUser.getUserPelanggan().printData();
       databasePesanan.getPesanan().printData();
       
       System.out.println("\n=== Pesanan Selesai (OJEK) ===");
       administrasi.pesananDitugaskan(pesanan_putra,ojek_yudha);
       administrasi.pesananSelesai(ojek_yudha);
       databaseUser.getUserOjek().printData();
       databaseUser.getUserPelanggan().printData();
       databasePesanan.getPesanan().printData();
       
       System.out.println("\n=== Pesanan Dibatalkan (PESANAN) ===");
       administrasi.pesananDitugaskan(pesanan_putra,ojek_yudha);
       administrasi.pesananDibatalkan(pesanan_putra);
       databaseUser.getUserOjek().printData();
       databaseUser.getUserPelanggan().printData();
       databasePesanan.getPesanan().printData();
       
       System.out.println("\n=== Pesanan Selesai (PESANAN) ===");
       administrasi.pesananDitugaskan(pesanan_putra,ojek_yudha);
       administrasi.pesananSelesai(pesanan_putra);
       databaseUser.getUserOjek().printData();
       databaseUser.getUserPelanggan().printData();
       databasePesanan.getPesanan().printData();
       
       System.out.println(ojek_yudha.getNama());
       System.out.println(pelanggan_putra.getNama());
       ojek_yudha.setNoPlat("B124UA");
       System.out.println(ojek_yudha.getNoPlat());
       ojek_yudha.setTelefon("085697041234");
       System.out.println(ojek_yudha.getTelefon());
       ojek_yudha.setEmail("yudha@gmail.com");
       System.out.println(ojek_yudha.getEmail());
       ojek_yudha.setDOB(04,11,1996);
       System.out.println("Tanggal Lahir "+ojek_yudha.getDOB().toString());
    }
}