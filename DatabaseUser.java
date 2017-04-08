import java.util.*; 


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
    private static ArrayList<User>  user_database = new ArrayList<User>();
    private static int id_ojek_terakhir = 1;
    private static int id_pelanggan_terakhir = 1;
    
    public static ArrayList<Ojek> getOjekDatabase(){
        ArrayList<Ojek>  ojek_database = new ArrayList<Ojek>();
       
        for(User user_temp : user_database){
            if(user_temp instanceof Ojek){
                ojek_database.add((Ojek)user_temp);
            }
        }
        return ojek_database;
    }
    
    public static ArrayList<Pelanggan> getPelangganDatabase(){
        ArrayList<Pelanggan>  pelanggan_database = new ArrayList<Pelanggan>();
        for(User user_temp : user_database){
            if(user_temp instanceof Pelanggan){
                pelanggan_database.add((Pelanggan)user_temp);
            }
        }
        return pelanggan_database;
    }
    
    /**
     * addPelanggan. 
     * Metode untuk menambahkan pelanggan pada database serta memberi tahu terdapat penambahan pelanggan dalam database.
     * @param Pelanggan baru    data pelanggan yang akan ditambahkan dalam database.
     * @return true   menandakan penambahan pelanggan berhasil dilakukan.
     */
    public static boolean addPelanggan(Pelanggan baru)
    {
        for(User user_temp : user_database){
            if(user_temp.getID() == baru.getID()){
                if(user_temp instanceof Pelanggan){
                    System.out.println("Penambahan pelanggan dalam database gagal");
                    return false;
                }
            }
        }
        user_database.add(baru);
        id_pelanggan_terakhir++;
        System.out.println("Penambahan pelanggan dalam database berhasil dilakukan");
        return true;
    }
   
    /**
     * removePelanggan. 
     * Metode untuk menghapus pelanggan pada database.
     * @param int id    id pelanggan yang akan dihapus dari database.
     * @return true   menandakan penghapusan pelanggan berhasil dilakukan.
     */    
    public static boolean removePelanggan(int id)
    {
        for(User user_temp : user_database){
            if(user_temp.getID() == id){
                if(user_temp instanceof Pelanggan){
                    user_database.remove(user_temp);
                    System.out.println("Penghapusan Pelanggan dengan id " + id + " Berhasil dilakukan");
                    return true;
                }
            }
        }
        System.out.println("ID Pelanggan tidak terdaftar, tidak terjadi penghapusan");
        return false;
        
        
    }
   
    /**
     * addOjek. 
     * Metode untuk menambahkan ojek pada database serta memberi tahu terdapat penambahan ojek dalam database.
     * @param Ojek baru    data ojek yang akan ditambahkan dalam database.
     * @return true   menandakan penambahan ojek berhasil dilakukan.
     */
    public static boolean addOjek(Ojek baru)
    {
        for(User user_temp : user_database){
            if(user_temp.getID() == baru.getID()){
                if(user_temp instanceof Ojek){
                    System.out.println("Penambahan ojek dalam database gagal");
                    return false;
                }
            }
        }
        user_database.add(baru);
        id_ojek_terakhir++;
        System.out.println("Penambahan ojek dalam database berhasil dilakukan");
        return true;
    }
    
    /**
     * removeOjek. 
     * Metode untuk menghapus ojek pada database serta memberi tahu terdapat penambahan pelanggan dalam database.
     * @param int id    id ojek yang akan dihapus dari database.
     * @return true   menandakan penambahan berhasil dilakukan.
     */
    public static boolean removeOjek(int id)
    {
        for(User user_temp : user_database){
            if(user_temp.getID() == id){
                if(user_temp instanceof Ojek){
                    user_database.remove(user_temp);
                    System.out.println("Penghapusan Ojek dengan id " + id + " Berhasil dilakukan");
                    return true;
                }
            }
        }
        System.out.println("ID Ojek tidak terdaftar, tidak terjadi penghapusan");
        return false;
    }
   
    /**
     * getIDOjekTerakhir. 
     * Metode yang akan mengembalikan nilai id ojek yang terakhir dimasukkan ke database ketika dipanggil.
     * @return int id_ojek_terakhir   nilai id ojek yang terakhir dimasukkan ke database.
     */
    public static int getIDOjekTerakhir()
    {
        return id_ojek_terakhir;
    }
   
    /**
     * getIDPelangganTerakhir. 
     * Metode yang akan mengembalikan nilai id pelanggan yang terakhir dimasukkan ke database ketika dipanggil.
     * @return int id_ojek_terakhir   nilai id pelanggan yang terakhir dimasukkan ke database.
     */
    public static int getIDPelangganTerakhir()
    {
        return id_pelanggan_terakhir;
    }
   
    /**
     * getUserOjek. 
     * Metode yang akan mengembalikan data ojek yang terakhir dimasukkan ke database ketika dipanggil.
     * @return Ojek ojek_database   data ojek yang terakhir dimasukkan ke database.
     */
    public static Ojek getUserOjek(int id)
    {
        for(User user_temp : user_database){
            if(user_temp.getID() == id){
                if(user_temp instanceof Ojek){
                    return (Ojek)user_temp;
                }
            }
        }
        return null;
    }
   
    /**
     * getUserPelanggan. 
     * Metode yang akan mengembalikan data pelanggan yang terakhir dimasukkan ke database ketika dipanggil.
     * @return Pelanggan pelanggan_database   data pelanggan yang terakhir dimasukkan ke database.
     */
    public static Pelanggan getUserPelanggan(int id)
    {
       for(User user_temp : user_database){
            if(user_temp.getID() == id){
                if(user_temp instanceof Pelanggan){
                    return (Pelanggan)user_temp;
                }
            }
        }
        return null;
    }
}