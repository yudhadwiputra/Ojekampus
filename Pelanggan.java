import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Date;
import java.util.GregorianCalendar;

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
    private Date dob;
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
    
    public Date getDOB()
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
        Pattern pola_email = Pattern.compile("(.)+(@)(.)+\\.(.)+");
        Matcher matcher_email = pola_email.matcher(email);
        if(matcher_email.matches())
        {
            this.email = email;
            return true; 
        }
        else
        {
            return false;
        }
    }
    
    public void setDOB (int day, int month, int year)
    {
        dob = new GregorianCalendar (year, month, day).getTime();
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
    
    public String toString()
    {
        if (DatabasePesanan.getPesanan() != null) {
            return nama + " " + id + " " + telefon + " " + DatabasePesanan.getPesanan().getPenggunaAwal();
        }
        else {
            return nama + " " + id + " " + telefon;
        }
    }
}
