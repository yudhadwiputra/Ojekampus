
/**
 * Write a description of class Lokasi here.
 * Kelas Lokasi merupakan kelas dimana berisi detail tentang lokasi Ojek
 * yang akan melayani pelanggan OjeKampus berupa kordinat ojek berada, 
 * nama lokasi serta keterangan lokasi tersebut
 * @author (Yudha Dwi Putra) 
 * @version (04/03/2017)
 */
public class Lokasi
{
    private double x;
    private double y;
    private String nama_lokasi;
    private String keterangan_lokasi;

    public Lokasi(String nama_lokasi, double x, double y, String keterangan_lokasi)
    {
        this.nama_lokasi = nama_lokasi;
        this.x = x;
        this.y = y;
        this.keterangan_lokasi = keterangan_lokasi;
    }
    
    public String toString()
    {
        return  "Nama Lokasi = " + this.nama_lokasi + "," +
                "X = " + this.x + "," +
                "Y = " + this.y + "," +
                "Keterangan = " + this.keterangan_lokasi;
    }

    public double getX()
    {
       return x;
    }
 
     public double getY()
    {
       return y;
    }
    
     public String getNama()
    {
       return nama_lokasi;
    }
    
    public String getKeteranganLokasi()
    {
       return keterangan_lokasi;
    }
    
    public void setX(double x)
    {
       this.x = x;
    }
    
     public void setY(double y)
    {
       this.y = y;
    }
    
    public void setNama(String nama_lokasi)
    {
       this.nama_lokasi = nama_lokasi;
    }
    
    public void setKeteranganLokasi(String keterangan_lokasi)
    {
       this.keterangan_lokasi = keterangan_lokasi;
    }
}
