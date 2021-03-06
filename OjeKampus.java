
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
   public static Lokasi ojek_lokasi;
   public static Pelanggan pelanggan_putra;
   public static Lokasi lokasi_putra_awal;
   public static Lokasi lokasi_putra_akhir;
   public static Pesanan pesanan_putra;
   private TipeLayanan layanan;
   
   public static SistemPengawas sistem;
    
   public static void StartSistemPengawas(int waktu_cek){
        SistemPengawas cek = new SistemPengawas("Thread1", waktu_cek);
        cek.start();
   }
    
   public static void MenungguSistem(int a){
        try{
            Thread.sleep(a);
        }catch(InterruptedException error1){
            System.out.println("Sistem tidak dapat menunggu !");
        }
   }
   
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
        Ojek ojek1 = new Ojek(DatabaseUser.getIDOjekTerakhir(),"Yudha", lokasi_ojek1);
        DatabaseUser.addOjek(ojek1);
        Lokasi lokasi_ojek2 = new Lokasi("Pasar Minggu",56,78,"Jakarta Selatan");
        Ojek ojek2 = new Ojek(DatabaseUser.getIDOjekTerakhir(),"Irfan", lokasi_ojek2);
        DatabaseUser.addOjek(ojek2);
        Lokasi lokasi_ojek3 = new Lokasi("Cijantung",67,89,"Jakarta Timur");
        Ojek ojek3 = new Ojek(DatabaseUser.getIDOjekTerakhir(),"Yunus", lokasi_ojek3);
        DatabaseUser.addOjek(ojek3);
        Pelanggan pelanggan1 = new Pelanggan(DatabaseUser.getIDPelangganTerakhir(), "Destian","081234567890");
        DatabaseUser.addPelanggan(pelanggan1);
        Pelanggan pelanggan2 = new Pelanggan(DatabaseUser.getIDPelangganTerakhir(), "Yuda","089876543210");
        DatabaseUser.addPelanggan(pelanggan2);
        Pelanggan pelanggan3 = new Pelanggan(DatabaseUser.getIDPelangganTerakhir(), "Aulya","082345678901");
        DatabaseUser.addPelanggan(pelanggan3);
        
        Lokasi lokasi_awal_pesanan1 = new Lokasi("Margonda",12,34,"Depok");
        Lokasi lokasi_akhir_pesanan1 = new Lokasi("Juanda",12,45,"Depok");
        Pesanan pesanan1 = new Pesanan(pelanggan1,TipeLayanan.BeliBarang,lokasi_awal_pesanan1,lokasi_akhir_pesanan1,pelanggan1.getNama());
        try{
            DatabasePesanan.addPesanan(pesanan1);
        }
        catch(PesananSudahAdaException error){
            System.out.println(error.getMessage());
        }
        
        Lokasi lokasi_awal_pesanan2 = new Lokasi("Fatmawati",23,45,"Jakarta Selatan");
        Lokasi lokasi_akhir_pesanan2 = new Lokasi("Pancoran",23,67,"Jakarta Selatan");
        Pesanan pesanan2 = new Pesanan(pelanggan2,TipeLayanan.AntarBarang,lokasi_awal_pesanan2,lokasi_akhir_pesanan2,pelanggan2.getNama(), "Irfan");
        try{
            DatabasePesanan.addPesanan(pesanan2);
        }
        catch(PesananSudahAdaException error){
            System.out.println(error.getMessage());
        }

        Lokasi lokasi_awal_pesanan3 = new Lokasi("Tanjung Priok",34,56,"Jakarta Utara");
        Lokasi lokasi_akhir_pesanan3 = new Lokasi("Mangga dua",34,78,"Jakarta Barat");
        Pesanan pesanan3 = new Pesanan(pelanggan3,TipeLayanan.AntarOrang,lokasi_awal_pesanan3,lokasi_akhir_pesanan3,pelanggan3.getNama());
        try{
            DatabasePesanan.addPesanan(pesanan3);
        }
        catch(PesananSudahAdaException error){
            System.out.println(error.getMessage());
        }
        
        StartSistemPengawas(100);
        
        Administrasi.printAllDatabase();

        MenungguSistem(300);

        System.out.println("\n");
        Administrasi.printAllDatabase();
        
        Administrasi.pesananDibatalkan(pesanan1.getPelanggan());
        Administrasi.pesananDibatalkan(pesanan2.getPelayan());
        pesanan3.getPelayan().setStatus(StatusOjek.Antar);
        System.out.println("\n");
        try{
            DatabasePesanan.hapusPesanan(pelanggan1);
        }
        catch(PesananOlehPelangganDitemukanException error){
            System.out.println(error.getMessage());
        }
        
        try{
            DatabasePesanan.hapusPesanan(pelanggan2);
        }
        catch(PesananOlehPelangganDitemukanException error){
            System.out.println(error.getMessage());
        }
        Administrasi.printAllDatabase();
        
        Administrasi.pesananSelesai(pesanan3.getPelanggan());
        System.out.println("\n");
        Administrasi.printAllDatabase();
        try{
            DatabasePesanan.hapusPesanan(pelanggan3);
        }
        catch(PesananOlehPelangganDitemukanException error){
            System.out.println(error.getMessage());
        }
        
        System.out.println("\n");
        Administrasi.printAllDatabase();
    }
    
    public static void antarBarang(){
        
    }
    public static void antarOrang(){
        
    }
    public static void ojekMembatalkan(){
        
    }
    public static void ojekMengubahStatus(){
        
    }
    public static void pembelianBarang(){
        
    }
    public static void penggunaMembatalkan(){
        
    }
    public static void penggunaMenghapusPesanan(){
        
    }
    public static void penggunaMenyelesaikanPesanan(){
        
    }
    public static void registrasiOjek(){
        
    }
    public static void registrasiPengguna(){
        
    }
}