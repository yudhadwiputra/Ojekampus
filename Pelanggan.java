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
    public static final Pattern VALID_EMAIL_ADDRESS_REGEX = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
    public static final Pattern VALID_PHONE_NUM_ID = Pattern.compile("^08[0-9]{9,}$");
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
   
    public void setTelefon(String telefon){
        if(tlp_validate(telefon)){
            this.telefon = telefon;
        }
    }
    
    public void setEmail(String email){
        if(validate(email)){
            this.email = email;
        }
    }
   
    

    public static boolean validate(String emailStr) {
        Matcher matcher = VALID_EMAIL_ADDRESS_REGEX .matcher(emailStr);
        return matcher.find();
    }

    public static boolean tlp_validate(String telefon) {
        Matcher matcher = VALID_PHONE_NUM_ID.matcher(telefon);
        return matcher.find();
    }
    

}
