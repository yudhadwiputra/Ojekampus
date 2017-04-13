
/**
 * Write a description of class PesananSudahAdaException here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PesananSudahAdaException extends Exception
{
    private Pesanan pesanan_error;

    public PesananSudahAdaException(Pesanan pesanan_input)
    {
        super("Pelanggan dengan nama ");
        this.pesanan_error=pesanan_input;
    }

    public String GetMessage()
    {
        return super.getMessage() + pesanan_error.getPelanggan().getNama() + " sudah melakukan pemesanan dengan tipe layanan " + pesanan_error.getTipeLayanan();
    }
}
