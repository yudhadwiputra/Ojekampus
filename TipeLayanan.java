
/**
 * Enumeration class TipeLayanan - write a description of the enum class here
 * 
 * @author (Yudha Dwi Putra)
 * @version (25 Mar 2017)
 */
public enum TipeLayanan
{
    AntarOrang("Antar Orang"), AntarBarang("Antar Barang"), BeliBarang("Beli Barang");
    private String deskripsi;
    
    TipeLayanan(String deskripsi){
        this.deskripsi = deskripsi;
    }
    
    public String deskripsi(){
        return deskripsi;
    }
   

}
