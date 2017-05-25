import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.GregorianCalendar;

/**
 * Abstract class User - write a description of the class here
 * Kelas User
 * @author (Yudha Dwi Putra)
 * @version (08/04/2017)
 */
public abstract class User
{
    protected int id;
    protected String nama,telefon,email;
    protected Date dob;

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
    
    public void setDOB(int day, int month, int year){
        dob = new GregorianCalendar (year, month, day).getTime();
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
