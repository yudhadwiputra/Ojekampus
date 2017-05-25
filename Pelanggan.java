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
public class Pelanggan extends User
{
    // instance variables - replace the example below with your own
    /**
     * Constructor Pelanggan. 
     * Metode yang pertama kali dipanggil ketika sebuah object dari kelas pelanggan diciptakan.
     * @param int id    id pelanggan untuk object pelanggan baru.
     * @param String nama   nama pelanggan untuk object pelanggan baru.
     */
    public Pelanggan(int id, String nama, String telefon)
    {
        super.id=id;
        super.nama=nama;
        this.setTelefon(telefon);
    }
    
    public Pelanggan(int id, String nama, String telefon, String email)
    {
        super.id = id;
        super.nama = nama;
        super.telefon = telefon;
        super.email = email;
    }
    
    public Pelanggan(int id, String nama, String telefon, String email, Date dob)
    {
        super.nama = nama;
        super.telefon = telefon;
        super.email = email;
        super.dob = dob;
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
    
}
