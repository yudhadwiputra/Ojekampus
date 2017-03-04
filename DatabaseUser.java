/**
 * Write a description of class DatabaseUser here.
 * Kelas DatabaseUser merupakan kelas dimana berisi detail tentang 
 * list dari seluruh pelayan/pelanggan dimana bisa dilakukan untuk 
 * menambah pelanggan/pelayan dan menghapus pelanggan/pelayan
 * @author Yudha Dwi Putra
 * @version 04/03/2017
 */
public class DatabaseUser
{
    /*
    Lokasi Penulisan
    Instance Variable
    */
    private static Pelanggan pelanggan_database;
    private static Ojek ojek_database;
    private static int id_ojek_terakhir = 1;
    private static int id_pelanggan_terakhir = 1;

    public static boolean addPelanggan (Pelanggan baru)
    {
        pelanggan_database = baru;
        System.out.println("Pelanggan Berhasil Ditambahkan");
        return true;
    }

    public static boolean removePelanggan (int id)
    {
        pelanggan_database = null;
        return true;
    }
    
    public static boolean addOjek (Ojek baru)
    {
        ojek_database = baru;
        System.out.println("Ojek Berhasil Ditambahkan");
        return true;
    }
   
    public static boolean removeOjek (int id)
    {
        ojek_database = null;
        return true;
    }
    
    public static int getIDOjekTerakhir ()
    {
        return 0;
    }
    
    public static int getIDPelangganTerakhir ()
    {
        return 0;
    }
    
    public static Ojek getUserOjek ()
    {
        return ojek_database;
    }
    
    public static Pelanggan getUserPelanggan (int id)
    {
        return pelanggan_database;
    }

}