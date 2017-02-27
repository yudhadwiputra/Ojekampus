/**
 * Write a description of class DatabaseUser here.
 * 
 * @author Yudha Dwi Putra
 * @version 25/2/17
 */
public class DatabaseUser
{
    // instance variables - replace the example below with your own
    private static String[] pelanggan_database;
    private static String[] ojek_database;
    private static int id_ojek_terakhir;
    private static int id_pelanggan_terakhir;

    /**
     * Constructor for objects of class DatabaseUser
     */
    public static boolean addPelanggan (String baru)
    {
        // initialise instance variables
        return false;
    }

    public static boolean removePelanggan (int id)
    {
        return false;
    }
    
    public static boolean addOjek (String baru)
    {
        return false;
    }
   
    public static boolean removeOjek (int id)
    {
        return false;
    }
    
    public static int getIDOjekTerakhir ()
    {
        return 0;
    }
    
    public static int getIDPelangganTerakhir ()
    {
        return 0;
    }
    
    public static String getUserOjek (int id)
    {
        return null;
    }
    
    public static String[] getOjekDatabase ()
    {
        return null;
    }
    
    public static String getUserPelanggan (int id)
    {
        return null;
    }
    
    public static String[] getPelangganDatabase ()
    {
        return null;
    }
}