 import java.util.*;


/**
 * Write a description of class DatabasePesanan here.
 * Kelas DatabasePesanan merupakan kelas dimana berisi detail tentang 
 * list dari seluruh pesanan dimana bisa dilakukan untuk menambah pesanan
 * atau menghapus pesanan
 * @author Yudha Dwi Putra
 * @version 04/03/2017
 */
public class DatabasePesanan
{
    // instance variables - replace the example below with your own
    private static ArrayList<Pesanan>  list_pesanan = new ArrayList<>();
    
    public static ArrayList<Pesanan> getDatabase(){
        return list_pesanan;
    }
    
    /**
     * getPesanan. 
     * Metode yang akan mengembalikan data pesanan yang terakhir dimasukkan ke database ketika dipanggil.
     * @return Pesanan list_pesanan   data pesanan yang terakhir dimasukkan ke database.
     */
    public static Pesanan getPesanan(Pelanggan pengguna)
    {
        for(Pesanan pesan : list_pesanan){
            if(pesan.getPelanggan().equals(pengguna)){
                 return pesan;
            }
        }
       return null;
    }
   
     /**
     * addPesanan. 
     * Metode untuk menambahkan pesanan pada database serta memberi tahu terdapat penambahan pesanan dalam database.
     * @param Pesanan pesan    data pesanan yang akan ditambahkan dalam database.
     * @return true   menandakan penambahan pesanan berhasil dilakukan.
     */
    public static boolean addPesanan(Pesanan pesan) throws PesananSudahAdaException
    {
        Pelanggan pengguna = pesan.getPelanggan();
        if(getPesanan(pengguna)==null){
            System.out.println("Pesanan berhasil dilakukan");
            list_pesanan.add(pesan);
            return true;
        }
        System.out.println("Pesanan gagal");
        throw new PesananSudahAdaException(pesan);
    }
   
    /**
     * hapusPesanan. 
     * Metode untuk menghapus pesanan dari database serta memberi tahu terdapat penghapusan pesanan dalam database.
     * @param Pesanan pesan    data pesanan yang akan dihapus dalam database.
     * @return true   menandakan penghapusan pesanan berhasil dilakukan.
     */
    public static boolean hapusPesanan(Pesanan pesan) throws PesananTidakDitemukanException
    {
        if(pesan.getPelayan()== null){
            throw new PesananTidakDitemukanException(pesan);
        }
        list_pesanan.remove(pesan);
        return true;
    }
   
    public static boolean hapusPesanan(Pelanggan pengguna) throws PesananOlehPelangganDitemukanException
    {
        Pesanan pesan = getPesanan(pengguna);
        if(pesan.getPelayan()== null){
            list_pesanan.remove(pesan);
            return true;
        }
        throw new PesananOlehPelangganDitemukanException(pengguna);
    }
}
