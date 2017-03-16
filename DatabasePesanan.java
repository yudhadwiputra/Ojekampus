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
    private static Pesanan list_pesanan;
    
            /**
     * addPesanan. 
     * Metode untuk menambahkan pesanan pada database serta memberi tahu terdapat penambahan pesanan dalam database.
     * @param Pesanan pesan    data pesanan yang akan ditambahkan dalam database.
     * @return true   menandakan penambahan pesanan berhasil dilakukan.
     */
    public static boolean addPesanan(Pesanan pesan) 
    {
        list_pesanan = pesan;
        System.out.println("Pesanan Berhasil Dilakukan");
        return true;
    }
    
        /**
     * hapusPesanan. 
     * Metode untuk menghapus pesanan dari database serta memberi tahu terdapat penghapusan pesanan dalam database.
     * @param Pesanan pesan    data pesanan yang akan dihapus dalam database.
     * @return true   menandakan penghapusan pesanan berhasil dilakukan.
     */
    public static boolean hapusPesanan(Pesanan pesan) 
    {
        list_pesanan = null;
        return true;
    }
    
        /**
     * getPesanan. 
     * Metode yang akan mengembalikan data pesanan yang terakhir dimasukkan ke database ketika dipanggil.
     * @return Pesanan list_pesanan   data pesanan yang terakhir dimasukkan ke database.
     */
    public static Pesanan getPesanan() 
    {
        return list_pesanan;
    }
    
}
