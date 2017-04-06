/**
 * Enumeration class StatusOjek - write a description of the enum class here
 * 
 * @author (Yudha Dwi Putra)
 * @version (25 Mar 2017)
 */
public enum StatusOjek
{
    Idle("Idle"), Jemput("Menjemput"), Antar("Mengantar");
    private String deskripsi;
    
    StatusOjek(String deskripsi){
        this.deskripsi = deskripsi;
    }
    
    public String getIDStatus(){
        return deskripsi;
    }
}