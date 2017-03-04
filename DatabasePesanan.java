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
    
    public static boolean addPesanan(Pesanan pesan) 
    {
        list_pesanan = pesan;
        System.out.println("Pesanan Berhasil Dilakukan");
        return true;
    }
    
    public static boolean hapusPesanan(Pesanan pesan) 
    {
        list_pesanan = null;
        return true;
    }
    
    public static Pesanan getPesanan() 
    {
        return list_pesanan;
    }
    
}
