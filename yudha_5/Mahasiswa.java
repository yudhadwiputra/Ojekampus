
/**

 * Kelas ini berfungsi untuk mengimplementasikan fungsi comparable pada method compareTo
 * sehingga nilai dari satu mahasiswa dapat di bandingkan dengan mahasiswa lain.
 * 
 * @author (Yudha Dwi Putra) 
 * @version (23 Maret 2017)
 */
public class Mahasiswa implements Comparable<Mahasiswa>
{
    private int nilai;
    private String nama;
    
    /**
     * Mahasiswa Constructor
     *
     * @param nama parameter untuk nama dari mahasiswa
     * @param nilai parameter untuk nilai dari mahasiswa
     */
    public Mahasiswa(String nama, int nilai)
    {
        // initialise instance variables
        this.nama = nama;
        this.nilai = nilai;
    }
    
    /**
     * Method setNilai
     *
     * @param newNilai parameter untuk input nilai baru
     */
    public void setNilai(int newNilai){
        nilai = newNilai;
    }
    
    /**
     * Method setNama
     *
     * @param nama parameter untuk input nama baru
     */
    public void setNama(String nama){
        this.nama = nama;
    }
    
    /**
     * Method getNilai
     *
     * @return nilai yang sudah diinput
     */
    public int getNilai(){
        return nilai;
    }
    
    /**
     * Method getNama
     *
     * @return nama yang sudah diinput
     */
    public String getNama(){
        return nama;
    }
    
    /**
     * Method compareTo
     * Metode untuk membandingkan mahasiswa dengan mahasiswa lain.
     * fungsi bekerja dengan melakukan override yang akan dipanggil ketika proses sorting dilakukan
     * @param s merupakan objek mahasiswa lainnya
     * @return hasil dari perbandingan nilai dengan nilai lainnya
     */
    public int compareTo(Mahasiswa s)
    {
        return s.nilai - this.nilai;     
    }
    
    /**
     * Method toString
     *
     * @return method yang menampilkan informasi dari kelas mahasiswa
     */
    public String toString(){
        return nama + " " + nilai + " ";
    }
 
}
