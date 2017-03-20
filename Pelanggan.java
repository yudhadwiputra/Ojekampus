<<<<<<< HEAD

/**
 * Write a description of class Pelanggan here.
 * Kelas Pelanggan merupakan kelas dimana berisi detail tentang pelanggan yang
 * akan menggunakan jasa OjeKampus berupa nama dan ID pelanggan
 * @author (Yudha Dwi Putra) 
 * @version (04/03/2017)
 */
public class Pelanggan
{
    private String nama,telefon,email;
    private String dob;
    private int id;
    
        /**
     * Constructor Pelanggan. 
     * Metode yang pertama kali dipanggil ketika sebuah object dari kelas pelanggan diciptakan.
     * @param int id    id pelanggan untuk object pelanggan baru.
     * @param String nama   nama pelanggan untuk object pelanggan baru.
     */
    public Pelanggan(int id, String nama)
    {
        this.id = id;
        this.nama = nama;
    }

        /**
     * getID. 
     * Metode yang akan mengembalikan nilai id pelanggan ketika dipanggil.
     * @return int id   nilai id pelanggan.
     */   
    public int getID()
    {
        return id;
    }
    
    public String getDOB()
    {
        return dob;
    }
    
        /**
     * getNama. 
     * Metode yang akan mengembalikan nama pelanggan ketika dipanggil.
     * @return String nama  nama pelanggan.
     */
    public String getNama()
    {
        return nama;
    }
    
    public boolean setTelefon (String telefon)
    {
        this.telefon=telefon;
        return false;
    }
    
    public boolean setEmail (String email)
    {
        this.email=email;
        return false;
    }
    
    public void setDOB (String dob)
    {
        this.dob=dob;
    }
    
        /**
     * setID. 
     * Metode untuk merubah nilai id pelanggan.
     * @param int id   nilai id baru pelanggan.
     */
    public void setID (int id)
    {
        this.id=id;
    }
    
        /**
     * setNama. 
     * Metode untuk merubah nama pelanggan.
     * @param String nama   nama baru pelanggan.
     */
    public void setNama (String nama)
    {
        this.nama = nama;
    }
    
        
        /**
     * printData. 
     * Metode untuk mencetak data pelanggan.
     */ 
    public void printData()
    {
        System.out.println("Pelanggan dengan nama "+nama+" dan ID "+id+" telefon: "+telefon+" Email: "+email+" DOB: "+dob);
    }
}
=======

/**
 * Write a description of class Pelanggan here.
 * Kelas Pelanggan merupakan kelas dimana berisi detail tentang pelanggan yang
 * akan menggunakan jasa OjeKampus berupa nama dan ID pelanggan
 * @author (Yudha Dwi Putra) 
 * @version (04/03/2017)
 */
public class Pelanggan
{
    private String nama;
    private int id;
    
        /**
     * Constructor Pelanggan. 
     * Metode yang pertama kali dipanggil ketika sebuah object dari kelas pelanggan diciptakan.
     * @param int id    id pelanggan untuk object pelanggan baru.
     * @param String nama   nama pelanggan untuk object pelanggan baru.
     */
    public Pelanggan(int id, String nama)
    {
        this.id = id;
        this.nama = nama;
    }
    
        /**
     * printData. 
     * Metode untuk mencetak data pelanggan.
     */ 
    public void printData()
    {
        System.out.println("Pelanggan");
        System.out.println("Id = " + id);
        System.out.println("Nama = " + nama);
    }

        /**
     * getID. 
     * Metode yang akan mengembalikan nilai id pelanggan ketika dipanggil.
     * @return int id   nilai id pelanggan.
     */   
    public int getID()
    {
        return id;
    }
    
        /**
     * getNama. 
     * Metode yang akan mengembalikan nama pelanggan ketika dipanggil.
     * @return String nama  nama pelanggan.
     */
    public String getNama()
    {
        return nama;
    }
    
        /**
     * setID. 
     * Metode untuk merubah nilai id pelanggan.
     * @param int id   nilai id baru pelanggan.
     */
    public void setID (int id)
    {
        this.id=id;
    }
    
        /**
     * setNama. 
     * Metode untuk merubah nama pelanggan.
     * @param String nama   nama baru pelanggan.
     */
    public void setNama (String nama)
    {
        this.nama = nama;
    }
    
    
}
>>>>>>> origin/master
