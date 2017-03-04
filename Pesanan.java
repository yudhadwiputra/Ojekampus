/**
 * Write a description of class Pesanan here.
 * Kelas Pesanan merupakan kelas dimana berisi detail tentang pesanan 
 * yang dilakukan pelanggan OjeKampus berupa detail ojek/pelanggan, 
 * lokasi jemput/antar, jenis layanan, dan biaya
 * posisi sekarang ojek berada.
 * @author Yudha Dwi Putra 
 * @version 04/03/2017
 */
public class Pesanan
{
    private Ojek pelayan = null;
    private Pelanggan pengguna;
    private String pelanggan_awal;
    private String pelanggan_akhir;
    private double biaya;
    private String layanan;
    private Lokasi lokasi_awal;
    private Lokasi lokasi_akhir;
    private boolean diproses = false;
    private boolean dibatalkan = false;
    
    public Pesanan(Pelanggan pengguna, String layanan, Lokasi lokasi_awal, 
    Lokasi lokasi_akhir, String pelanggan_awal, String pelanggan_akhir, double biaya)
    {
        this.pengguna = pengguna;
        this.layanan = layanan;
        this.lokasi_awal = lokasi_awal;
        this.lokasi_akhir = lokasi_akhir;
        this.pelanggan_awal = pelanggan_awal;
        this.pelanggan_akhir = pelanggan_akhir;
        this.biaya = biaya;
    }
    
     public void printData()
    {
        System.out.println("Lokasi Pelanggan Awal = " + lokasi_awal);
        System.out.println("Lokasi Pengguna Akhir = " + lokasi_akhir);
        System.out.println("Layanan = " + layanan);
    }
    
    public boolean getStatusPesanan()
    {
        return false;
    }
    
    public Pelanggan getPelanggan() 
    {
        return pengguna;
    }
    
    public Ojek getOjek() 
    {
        return pelayan;
    }
    
    public Lokasi getLokasiAwal() 
    {
        return lokasi_awal;
    }
    
    public Lokasi getLokasiAkhir() 
    {
        return lokasi_akhir;
    }
    
    public String getTipeLayanan() 
    {
        return null;
    }
    
    public String getPenggunaAwal() 
    {
        return null;
    }
    
    public String getPenggunaAkhir() 
    {
        return null;
    }
    
    public double getBiaya()
    {
        return 0;
    }
    
   
}