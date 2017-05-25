import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Calendar;
import java.util.GregorianCalendar;
/**
 * Write a description of class Ojek here.
 * Kelas Ojek merupakan kelas dimana berisi detail tentang pelayan (Ojek)
 * yang akan melayani pelanggan OjeKampus berupa nama,ID Ojek, serta
 * posisi sekarang ojek berada.
 * @author (Yudha Dwi Putra) 
 * @version (04/03/2017)
 */
public class Ojek extends User
{
    // instance variables - replace the example below with your own
    private StatusOjek status = StatusOjek.Idle;
    private Lokasi posisiSekarang;
    private Pesanan pesanan_sekarang=null;
    private String no_plat;

    /**
     * Constructor Ojek. 
     * Metode yang pertama kali dipanggil ketika sebuah object dari kelas ojek diciptakan.
     * @param int id untuk ojek baru.
     * @param String nama untuk ojek baru.
     * @param Lokasi posisiSekarang posisi dari ojek baru.
     */
    public Ojek(int id, String nama, Lokasi posisiSekarang)
    {
        // initialise instance variables
        super.id=id;
        super.nama=nama;
        this.posisiSekarang = posisiSekarang;
    }

    public Ojek(int id, String nama, String telefon, String email, Date date, String no_plat, Lokasi posisiSekarang)
    {
        super.id = id;
        super.nama = nama;
        super.telefon = telefon;
        super.email = email;
        super.dob = date;
        this.no_plat = no_plat;
        this.posisiSekarang = posisiSekarang;
    }
    
    /**
     * Method untuk menampilkan data pada kelas Ojek
     */
    public String toString(){
    if(pesanan_sekarang == null)
    {
        return "\nOjek" + " Id: "+id + " Nama: "+ nama + " Status:" + status.toString();
    }
    else
    {
        Pelanggan temp = pesanan_sekarang.getPelanggan();
        return "\nOjek" + " Id: "+id + " Nama: "+ nama + " Status:" + status.toString() + " Pelanggan:" + temp.getNama();
    }
    }
    
    public boolean setNoPlat(String no_plat){
        Pattern pattern = Pattern.compile("[A-Z]\\d{1,4}[A-Z]{1,3}");
        Matcher matcher = pattern.matcher(no_plat);
        if(matcher.matches())
        {
            this.no_plat = no_plat;
            return true;
        }
        else
        {
            return false;
        }
    }
    
    /**
     * setPesanan. 
     * Metode untuk merubah pesanan yang sedang diambil ojek.
     * @param Pesanan pesan   Pesanan baru ojek.
     */
    public void setPesanan(Pesanan pesan){
        pesanan_sekarang = pesan;
    }
    
    /**
     * setPosisi. 
     * Metode untuk merubah posisi ojek.
     * @param Lokasi sekarang   Posisi baru ojek.
     */
    public void setPosisi(Lokasi sekarang){
        posisiSekarang = sekarang;
    }
    
    /**
     * setStatus. 
     * Metode untuk merubah status ojek.
     * @param String status   status baru ojek.
     */
    public void setStatus(StatusOjek status){
        this.status = status;
    }
    
    public String getNoPlat(){
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
    public Lokasi getPosisi(){
        return posisiSekarang;
    }
    
    /**
     * getStatus. 
     * Metode yang akan mengembalikan status ojek ketika dipanggil.
     * @return String statusa   status ojek.
     */ 
    public StatusOjek getStatus(){
        return status;
    }
    
}
