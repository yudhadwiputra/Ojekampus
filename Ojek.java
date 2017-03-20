<<<<<<< HEAD

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
    private StatusOjek status = StatusOjek.Idle;
    private Lokasi posisi_sekarang;
    private Pesanan pesanan_sekarang = null;
    private int id;
    private String nama, telefon, email, no_plat;
    private String dob;
   
        /**
     * Constructor Ojek. 
     * Metode yang pertama kali dipanggil ketika sebuah object dari kelas ojek diciptakan.
     * @param int id    id untuk object ojek baru.
     * @param String nama   nama untuk object ojek baru.
     * @param Lokasi posisiSekarang     posisi dari object ojek baru.
     */
    public Ojek(int id, String nama, Lokasi posisi_sekarang)
    {
        this.id = id;
        this.nama = nama;
        this.posisi_sekarang = posisi_sekarang;
    }
    
         /**
     * getID. 
     * Metode yang akan mengembalikan nilai id ojek ketika dipanggil.
     * @return int id   nilai id ojek.
     */  
    public int getID()
    {
       return id;
    }
    
        /**
     * getNama. 
     * Metode yang akan mengembalikan nama ojek ketika dipanggil.
     * @return String nama   nama ojek.
     */ 
    public String getNama()
    {
       return nama;
    }
    
    public String getTelefon()
    {
       return telefon;
    }
    
    public String getEmail()
    {
       return email;
    }
    
    public String getDOB()
    {
       return dob;
    }
    
    public String getNoPlat()
    {
       return no_plat;
    }
    
        /**
     * getPesanan. 
     * Metode yang akan mengembalikan pesanan yang diambil ojek ketika dipanggil.
     * @return Pesanan pesanan_sekarang   pesanan yang diambil ojek.
     */  
    public Pesanan getPesanan()
    {
       return pesanan_sekarang;
    }
    
        /**
     * getPosisi. 
     * Metode yang akan mengembalikan posisi ojek ketika dipanggil.
     * @return Lokasi posisiSekarang   posisi ojek sekarang.
     */ 
    public Lokasi getPosisi()
    {
       return posisi_sekarang;
    }
    
        /**
     * getStatus. 
     * Metode yang akan mengembalikan status ojek ketika dipanggil.
     * @return String status   status ojek.
     */ 
    public StatusOjek getStatus()
    {
       return status;
    }

        /**
     * setID. 
     * Metode untuk merubah nilai id ojek.
     * @param int id   nilai id baru ojek.
     */
    public void setID(int id)
    {
        this.id = id;
    }
    
        /**
     * setNama. 
     * Metode untuk merubah nama ojek.
     * @param String nama   nama baru ojek.
     */
    public void setNama(String nama)
    {
        this.nama = nama;
    }
    
    public boolean setTelefon(String telefon)
    {
        this.telefon = telefon;
        return true;
    }
    
    public boolean setEmail(String email)
    {
        this.email = email;
        return true;
    }
    
    public void setDOB(String dob)
    {
        this.dob = dob;
    }
    
    public boolean setNoPlat(String no_plat)
    {
        this.no_plat = no_plat;
        return true;
    }
    
       /**
     * setStatus. 
     * Metode untuk merubah status ojek.
     * @param String status   status baru ojek.
     */
    public void setStatus(StatusOjek status)
    {
        this.status = status;
    }
    
            /**
     * setPosisi. 
     * Metode untuk merubah posisi ojek.
     * @param Lokasi sekarang   Posisi baru ojek.
     */
    public void setPosisi(Lokasi sekarang)
    {
        posisi_sekarang = sekarang;
    }
    
        /**
     * setPesanan. 
     * Metode untuk merubah pesanan yang sedang diambil ojek.
     * @param Pesanan pesan   Pesanan baru ojek.
     */
    public void setPesanan(Pesanan pesan)
    {
        pesanan_sekarang = pesan;
    }
    
            /**
     * printData. 
     * Metode untuk mencetak data ojek.
     */ 
    public void printData()
    {
        System.out.println("Ojek dengan nama "+nama+" dan ID "+id+" memiliki status "+status);
        System.out.println("Ojek berada di Posisi Sekarang = " + posisi_sekarang);
    }
}
=======

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
    private StatusOjek status = StatusOjek.Idle;
    private Lokasi posisi_sekarang;
    private Pesanan pesanan_sekarang = null;
    private int id;
    private String nama, telefon, email, no_plat;
    private String dob;
   
        /**
     * Constructor Ojek. 
     * Metode yang pertama kali dipanggil ketika sebuah object dari kelas ojek diciptakan.
     * @param int id    id untuk object ojek baru.
     * @param String nama   nama untuk object ojek baru.
     * @param Lokasi posisiSekarang     posisi dari object ojek baru.
     */
    public Ojek(int id, String nama, Lokasi posisi_sekarang)
    {
        this.id = id;
        this.nama = nama;
        this.posisi_sekarang = posisi_sekarang;
    }
    
        /**
     * printData. 
     * Metode untuk mencetak data ojek.
     */ 
    public void printData()
    {
        System.out.println("Ojek");
        System.out.println("Id = " + id);
        System.out.println("Nama = " + nama);
        System.out.println("Status Ojek = " + status);
        System.out.println("Posisi Sekarang = " + posisi_sekarang);
    }

        /**
     * setID. 
     * Metode untuk merubah nilai id ojek.
     * @param int id   nilai id baru ojek.
     */
    public void setID(int id)
    {
        this.id = id;
    }
    
        /**
     * setNama. 
     * Metode untuk merubah nama ojek.
     * @param String nama   nama baru ojek.
     */
    public void setNama(String nama)
    {
        this.nama = nama;
    }
    
    public void setTelefon(String telefon)
    {
        this.telefon = telefon;
    }
    
    public void setEmail(String email)
    {
        this.email = email;
    }
    
    public void setDOB(String dob)
    {
        this.dob = dob;
    }
    
    public boolean setNoPlat(String no_plat)
    {
        this.no_plat = no_plat;
        return true;
    }
    
        /**
     * setPesanan. 
     * Metode untuk merubah pesanan yang sedang diambil ojek.
     * @param Pesanan pesan   Pesanan baru ojek.
     */
    public void setPesanan(Pesanan pesan)
    {
        pesanan_sekarang = pesan;
    }
    
        /**
     * setPosisi. 
     * Metode untuk merubah posisi ojek.
     * @param Lokasi sekarang   Posisi baru ojek.
     */
    public void setPosisi(Lokasi sekarang)
    {
        posisi_sekarang = sekarang;
    }
    
       /**
     * setStatus. 
     * Metode untuk merubah status ojek.
     * @param String status   status baru ojek.
     */
    public void setStatus(StatusOjek status)
    {
        this.status = status;
    }
    
        /**
     * getID. 
     * Metode yang akan mengembalikan nilai id ojek ketika dipanggil.
     * @return int id   nilai id ojek.
     */  
    public int getID()
    {
       return id;
    }
    
        /**
     * getNama. 
     * Metode yang akan mengembalikan nama ojek ketika dipanggil.
     * @return String nama   nama ojek.
     */ 
    public String getNama()
    {
       return nama;
    }
    
    public String getTelefon()
    {
       return telefon;
    }
    
    public String getEmail()
    {
       return email;
    }
    
    public String getDOB()
    {
       return dob;
    }
    
    public String getNoPlat()
    {
       return no_plat;
    }
    
        /**
     * getPesanan. 
     * Metode yang akan mengembalikan pesanan yang diambil ojek ketika dipanggil.
     * @return Pesanan pesanan_sekarang   pesanan yang diambil ojek.
     */  
    public Pesanan getPesanan()
    {
       return pesanan_sekarang;
    }
    
        /**
     * getPosisi. 
     * Metode yang akan mengembalikan posisi ojek ketika dipanggil.
     * @return Lokasi posisiSekarang   posisi ojek sekarang.
     */ 
    public Lokasi getPosisi()
    {
       return posisi_sekarang;
    }
    
        /**
     * getStatus. 
     * Metode yang akan mengembalikan status ojek ketika dipanggil.
     * @return String status   status ojek.
     */ 
    public StatusOjek getStatus()
    {
       return status;
    }
    
}
>>>>>>> origin/master
