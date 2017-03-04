
/**
 * Write a description of class Ojek here.
 * Kelas Ojek merupakan kelas dimana berisi detail tentang pelayan (Ojek)
 * yang akan melayani pelanggan OjeKampus berupa nama,ID Ojek, serta
 * posisi sekarang ojek berada.
 * @author (Yudha Dwi Putra) 
 * @version (04/03/2017)
 */
public class Ojek
{
    private String status = "Idle";
    private Lokasi posisi_sekarang;
    private Pesanan pesanan_sekarang = null;
    private int id;
    private String nama;
   
    public Ojek(int id, String nama, Lokasi posisi_sekarang)
    {
        this.id = id;
        this.nama = nama;
        this.posisi_sekarang = posisi_sekarang;
    }
    
    public void printData()
    {
        System.out.println("Ojek");
        System.out.println("Id = " + id);
        System.out.println("Nama = " + nama);
        System.out.println("Status Ojek = " + status);
        System.out.println("Posisi Sekarang = " + posisi_sekarang);
    }

    public void setID(int id)
    {
        this.id = id;
    }
    
    public void setNama(String nama)
    {
        this.nama = nama;
    }
    
    public void setPesanan(Pesanan pesan)
    {
        pesanan_sekarang = pesan;
    }
    
    public void setPosisi(Lokasi sekarang)
    {
        posisi_sekarang = sekarang;
    }
    
    public void setStatus(String status)
    {
        this.status = status;
    }
    
    public int getID()
    {
       return id;
    }
    
    public String getNama()
    {
       return nama;
    }
    
    public Pesanan getPesanan()
    {
       return pesanan_sekarang;
    }
    
    public Lokasi getPosisi()
    {
       return posisi_sekarang;
    }
    
    public String getStatus()
    {
       return status;
    }
    
}
