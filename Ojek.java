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
public class Ojek
{
    // instance variables - replace the example below with your own
    private StatusOjek status = StatusOjek.Idle;
    private Lokasi posisiSekarang;
    private Pesanan pesanan_sekarang=null;
    private int id;
    private String nama;
    private String telefon;
    private String email;
    private String no_plat;
    private Date dob;

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
        this.id = id;
        this.nama = nama;
        this.posisiSekarang = posisiSekarang;
    }
    
    /**
     * printData. 
     * Metode untuk mencetak data ojek.
     */ 
    public String toString(){
        if(pesanan_sekarang == null){
        return "Ojek" + " Id : "+id + " Nama : "+  nama + " Status :" + status.getIDStatus()+ "||";
    }
        Pelanggan temp = pesanan_sekarang.getPelanggan();
        return "Ojek" + " Id : "+id + " Nama : "+  nama + " Status :" + status.getIDStatus() + " Pelanggan" + temp.getNama()+ "||";
    }
    
    /**
     * setID. 
     * Metode untuk merubah nilai id ojek.
     * @param int id   nilai id baru ojek.
     */
    public void setID(int id){
        this.id = id;
    }
    
    /**
     * setNama. 
     * Metode untuk merubah nama ojek.
     * @param String nama   nama baru ojek.
     */
    public void setNama(String nama){
        this.nama = nama;
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
    
    public void setDOB(int day, int month, int year){
        dob = new GregorianCalendar (year, month, day).getTime();
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
    
    /**
     * getID. 
     * Metode yang akan mengembalikan nilai id ojek ketika dipanggil.
     * @return int id nilai id ojek.
     */  
    public int getID(){
        return id;
    }
    
    /**
     * getNama. 
     * Metode yang akan mengembalikan nama ojek ketika dipanggil.
     * @return String nama   nama ojek.
     */  
    public String getNama(){
        return nama;
    }
    
    public String getTelefon(){
        return telefon;
    }
    
    public String getEmail(){
        return email;
    }
    
    public String getNoPlat(){
        return no_plat;
    }
    
    public Date getDOB(){
        return dob;
    }
    
    /**
     * getPesanan. 
     * Metode yang akan mengembalikan pesanan yang diambil ojek ketika dipanggil.
     * @return Pesanan pesanan_sekarang   pesanan yang diambil ojek.
     */  
    public Pesanan getPesanan(){
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
