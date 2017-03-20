<<<<<<< HEAD

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

        /**
     * Constructor Lokasi. 
     * Metode yang pertama kali dipanggil ketika sebuah object lokasi ojek diciptakan.
     * @param String nama_lokasi   nama lokasi untuk object lokasi baru.
     * @param double x   koordinat x object lokasi baru.
     * @param double y   koordinat y object lokasi baru.
     * @param String keterangan_lokasi  keterangan dari object lokasi baru.
     */
    public Lokasi(String nama_lokasi, double x, double y, String keterangan_lokasi)
    {
        this.nama_lokasi = nama_lokasi;
        this.x = x;
        this.y = y;
        this.keterangan_lokasi = keterangan_lokasi;
    }
    
        /**
     * toString. 
     * Metode yang akan dipanggil ketika kelas lokasi di print yang akan mengembalikan string dari seluruh variable.
     * @return String "Nama Lokasi: " + nama_lokasi + "," + "X: " + x + "," + "Y: " + y + "," + "Keterangan: " + keterangan_lokasi + "."; 
     * seluruh variable yang yerdapat pada kelas lokasi.
     */
    public String toString()
    {
        return  "" + this.nama_lokasi + "," +
                "X = " + this.x + "," +
                "Y = " + this.y + "," +
                "" + this.keterangan_lokasi;
    }

        /**
     * getX. 
     * Metode yang akan mengembalikan nilai koordinat x dari lokasi ketika dipanggil.
     * @return double x nilai koordinat x dari lokasi
     */  
    public double getX()
    {
       return x;
    }
 
        /**
     * getY. 
     * Metode yang akan mengembalikan nilai koordinat y dari lokasi ketika dipanggil.
     * @return double y nilai koordinat y dari lokasi
     */
     public double getY()
    {
       return y;
    }
    
        /**
     * getNama. 
     * Metode yang akan mengembalikan nama lokasi ketika dipanggil.
     * @return String nama   nama lokasi.
     */ 
     public String getNama()
    {
       return nama_lokasi;
    }
    
        /**
     * getKeteranganLokasi. 
     * Metode yang akan mengembalikan keterangan lokasi ketika dipanggil.
     * @return String nama   keterangan lokasi.
     */ 
    public String getKeteranganLokasi()
    {
       return keterangan_lokasi;
    }
    
        /**
     * setX. 
     * Metode untuk merubah nilai x dari lokasi.
     * @param double x   nilai x baru dari lokasi.
     */
    public void setX(double x)
    {
       this.x = x;
    }
    
        /**
     * setY. 
     * Metode untuk merubah nilai y dari lokasi.
     * @param double y   nilai y baru dari lokasi.
     */
     public void setY(double y)
    {
       this.y = y;
    }
    
        /**
     * setNama. 
     * Metode untuk merubah nama lokasi.
     * @param String nama_Lokasi   nama baru lokasi.
     */
    public void setNama(String nama_lokasi)
    {
       this.nama_lokasi = nama_lokasi;
    }
    
        /**
     * setKeteranganLokasi. 
     * Metode untuk merubah keterangan lokasi.
     * @param String keterangan_lokasi   keterangan baru lokasi.
     */
    public void setKeteranganLokasi(String keterangan_lokasi)
    {
       this.keterangan_lokasi = keterangan_lokasi;
    }
}
=======

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

        /**
     * Constructor Lokasi. 
     * Metode yang pertama kali dipanggil ketika sebuah object lokasi ojek diciptakan.
     * @param String nama_lokasi   nama lokasi untuk object lokasi baru.
     * @param double x   koordinat x object lokasi baru.
     * @param double y   koordinat y object lokasi baru.
     * @param String keterangan_lokasi  keterangan dari object lokasi baru.
     */
    public Lokasi(String nama_lokasi, double x, double y, String keterangan_lokasi)
    {
        this.nama_lokasi = nama_lokasi;
        this.x = x;
        this.y = y;
        this.keterangan_lokasi = keterangan_lokasi;
    }
    
        /**
     * toString. 
     * Metode yang akan dipanggil ketika kelas lokasi di print yang akan mengembalikan string dari seluruh variable.
     * @return String "Nama Lokasi: " + nama_lokasi + "," + "X: " + x + "," + "Y: " + y + "," + "Keterangan: " + keterangan_lokasi + "."; 
     * seluruh variable yang yerdapat pada kelas lokasi.
     */
    public String toString()
    {
        return  "" + this.nama_lokasi + "," +
                "X = " + this.x + "," +
                "Y = " + this.y + "," +
                "" + this.keterangan_lokasi;
    }

        /**
     * getX. 
     * Metode yang akan mengembalikan nilai koordinat x dari lokasi ketika dipanggil.
     * @return double x nilai koordinat x dari lokasi
     */  
    public double getX()
    {
       return x;
    }
 
        /**
     * getY. 
     * Metode yang akan mengembalikan nilai koordinat y dari lokasi ketika dipanggil.
     * @return double y nilai koordinat y dari lokasi
     */
     public double getY()
    {
       return y;
    }
    
        /**
     * getNama. 
     * Metode yang akan mengembalikan nama lokasi ketika dipanggil.
     * @return String nama   nama lokasi.
     */ 
     public String getNama()
    {
       return nama_lokasi;
    }
    
        /**
     * getKeteranganLokasi. 
     * Metode yang akan mengembalikan keterangan lokasi ketika dipanggil.
     * @return String nama   keterangan lokasi.
     */ 
    public String getKeteranganLokasi()
    {
       return keterangan_lokasi;
    }
    
        /**
     * setX. 
     * Metode untuk merubah nilai x dari lokasi.
     * @param double x   nilai x baru dari lokasi.
     */
    public void setX(double x)
    {
       this.x = x;
    }
    
        /**
     * setY. 
     * Metode untuk merubah nilai y dari lokasi.
     * @param double y   nilai y baru dari lokasi.
     */
     public void setY(double y)
    {
       this.y = y;
    }
    
        /**
     * setNama. 
     * Metode untuk merubah nama lokasi.
     * @param String nama_Lokasi   nama baru lokasi.
     */
    public void setNama(String nama_lokasi)
    {
       this.nama_lokasi = nama_lokasi;
    }
    
        /**
     * setKeteranganLokasi. 
     * Metode untuk merubah keterangan lokasi.
     * @param String keterangan_lokasi   keterangan baru lokasi.
     */
    public void setKeteranganLokasi(String keterangan_lokasi)
    {
       this.keterangan_lokasi = keterangan_lokasi;
    }
}
>>>>>>> origin/master
