
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

        /**
     * addPelanggan. 
     * Metode untuk menambahkan pelanggan pada database serta memberi tahu terdapat penambahan pelanggan dalam database.
     * @param Pelanggan baru    data pelanggan yang akan ditambahkan dalam database.
     * @return true   menandakan penambahan pelanggan berhasil dilakukan.
     */
    public static boolean addPelanggan (Pelanggan baru)
    {
        pelanggan_database = baru;
        System.out.println("Pelanggan Berhasil Ditambahkan");
        return true;
    }

        /**
     * removePelanggan. 
     * Metode untuk menghapus pelanggan pada database.
     * @param int id    id pelanggan yang akan dihapus dari database.
     * @return true   menandakan penghapusan pelanggan berhasil dilakukan.
     */ 
    public static boolean removePelanggan (int id)
    {
        pelanggan_database = null;
        return true;
    }
    
        /**
     * addOjek. 
     * Metode untuk menambahkan ojek pada database serta memberi tahu terdapat penambahan ojek dalam database.
     * @param Ojek baru    data ojek yang akan ditambahkan dalam database.
     * @return true   menandakan penambahan ojek berhasil dilakukan.
     */
    public static boolean addOjek (Ojek baru)
    {
        ojek_database = baru;
        System.out.println("Ojek Berhasil Ditambahkan");
        return true;
    }
      
    /**
     * removeOjek. 
     * Metode untuk menghapus ojek pada database serta memberi tahu terdapat penambahan pelanggan dalam database.
     * @param int id    id ojek yang akan dihapus dari database.
     * @return true   menandakan penambahan berhasil dilakukan.
     */
    public static boolean removeOjek (int id)
    {
        ojek_database = null;
        return true;
    }
    
        /**
     * getIDOjekTerakhir. 
     * Metode yang akan mengembalikan nilai id ojek yang terakhir dimasukkan ke database ketika dipanggil.
     * @return int id_ojek_terakhir   nilai id ojek yang terakhir dimasukkan ke database.
     */
    public static int getIDOjekTerakhir ()
    {
        return 0;
    }
    
        /**
     * getIDPelangganTerakhir. 
     * Metode yang akan mengembalikan nilai id pelanggan yang terakhir dimasukkan ke database ketika dipanggil.
     * @return int id_ojek_terakhir   nilai id pelanggan yang terakhir dimasukkan ke database.
     */
    public static int getIDPelangganTerakhir ()
    {
        return 0;
    }
    
        /**
     * getUserOjek. 
     * Metode yang akan mengembalikan data ojek yang terakhir dimasukkan ke database ketika dipanggil.
     * @return Ojek ojek_database   data ojek yang terakhir dimasukkan ke database.
     */
    public static Ojek getUserOjek ()
    {
        return ojek_database;
    }
    
        /**
     * getUserPelanggan. 
     * Metode yang akan mengembalikan data pelanggan yang terakhir dimasukkan ke database ketika dipanggil.
     * @return Pelanggan pelanggan_database   data pelanggan yang terakhir dimasukkan ke database.
     */
    public static Pelanggan getUserPelanggan ()
    {
        return pelanggan_database;
    }
    
    public void printData()
    {
        System.out.println("Ojek "+ojek_database);
        System.out.println("Pelanggan "+pelanggan_database);
    }
}