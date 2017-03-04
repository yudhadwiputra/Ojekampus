
/**
 * Write a description of class Pelanggan here.
 * Kelas Pelanggan merupakan kelas dimana berisi detail tentang pelanggan yang
 * akan menggunakan jasa OjeKampus berupa nama dan ID pelanggan
 * @author (Yudha Dwi Putra) 
 * @version (04/03/2017)
 */
public class Pelanggan
{
    private String nama;
    private int id;
    
    public Pelanggan(int id, String nama)
    {
        this.id = id;
        this.nama = nama;
    }
    
    public void printData()
    {
        System.out.println("Pelanggan");
        System.out.println("Id = " + id);
        System.out.println("Nama = " + nama);
    }

    public int getID()
    {
        return id;
    }
    
    public String getNama()
    {
        return nama;
    }
    
    public void setID (int id)
    {
        this.id=id;
    }
    
    public void setNama (String nama)
    {
        this.nama = nama;
    }
    
    
}
