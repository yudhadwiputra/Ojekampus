import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
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
    // instance variables - replace the example below with your own
    private int id;
    private String nama,telefon,email;
    private Date dob;
    
    /**
     * Constructor Pelanggan. 
     * Metode yang pertama kali dipanggil ketika sebuah object dari kelas pelanggan diciptakan.
     * @param int id pelanggan untuk object pelanggan baru.
     * @param String nama pelanggan untuk object pelanggan baru.
     */
    public Pelanggan(int id, String nama, String telefon)
    {
        // initialise instance variables
        this.id = id;
        this.nama = nama;
        this.setTelefon(telefon);
    }
    
    /**
     * printData. 
     * Metode untuk mencetak data pelanggan.
     */    
    public String toString(){
        if(DatabasePesanan.getPesanan(this) == null){
            return "Pelanggan" + " Nama : "+ nama + " Id : "+ id + "No.Tlp : " + telefon + "||";
        }
        Pesanan temp = DatabasePesanan.getPesanan(this);
        return "Pelanggan" + " Nama : "+ nama + " Id : "+ id + "No.Tlp : " + telefon + " Pelanggan Awal :" + temp.getPenggunaAwal() + "||";
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
    
    public String getTelefon(){
        return telefon;
    }
    
    public String getEmail(){
        return email;
    }
    
    public Date getDOB(){
        return dob;
    }
    
    /**
     * getNama. 
     * Metode yang akan mengembalikan nama pelanggan ketika dipanggil.
     * @return String nama  nama pelanggan.
     */
    public String getNama(){
        return nama;
    }
    
    /**
     * setID. 
     * Metode untuk merubah nilai id pelanggan.
     * @param int id   nilai id baru pelanggan.
     */
    public void setID(int id){
        this.id = id;
    }
    
    /**
     * setNama. 
     * Metode untuk merubah nama pelanggan.
     * @param String nama   nama baru pelanggan.
     */
    public void setNama(String nama){
        this.nama = nama;
    }
  
    
    public void setDOB(Date dob){
        this.dob = dob;
    }
   
    public boolean setTelefon(String telefon){
        Pattern pattern = Pattern.compile("\\d{10,12}");
        Matcher matcher = pattern.matcher(telefon);
        if(matcher.matches())
        {
            this.telefon = telefon;
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public boolean setEmail(String email){
        Pattern pattern = Pattern.compile("(.)+(@)(.)+\\.(.)+");
        Matcher matcher = pattern.matcher(email);
        this.email=email;
        if(matcher.matches())
        {
            return true;
        }
        else
        {
            return false;
        }
    }

}
