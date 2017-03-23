import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Date;
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
    private StatusOjek status = StatusOjek.Idle;
    private Lokasi posisi_sekarang;
    private Pesanan pesanan_sekarang = null;
    private int id;
    private String nama, telefon, email, no_plat;
    private Date dob;
   
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
    
    public Date getDOB()
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
        Pattern pola_telefon = Pattern.compile("\\d{10,12}");
        Matcher matcher_telefon = pola_telefon.matcher(telefon);    
        if(matcher_telefon.matches())
        {
            this.telefon = telefon;
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public boolean setEmail(String email)
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
    
    public void setDOB(int day, int month, int year)
    {
        dob = new GregorianCalendar (year, month, day).getTime();
    }
    
    public boolean setNoPlat(String no_plat)
    {
        Pattern pola_plat = Pattern.compile("[A-Z]\\d{1,4}[A-Z]{1,3}");
        Matcher matcher_no_plat = pola_plat.matcher(no_plat);
        if(matcher_no_plat.matches())
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
    
    public String toString()
    {
        if(pesanan_sekarang.equals(null))
        {
            return nama + id + status.toString();
        }
        else
        {
            return nama + id + status.toString() + DatabaseUser.getUserPelanggan().getNama();
        }
    }
}
