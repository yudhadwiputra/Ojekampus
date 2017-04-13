
/**
 * Write a description of class PesananTidakDitemukanException here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PesananTidakDitemukanException extends Exception
{
    private Pesanan pesanan_error;

    public PesananTidakDitemukanException(Pesanan pesanan_input)
    {
        super("Pesanan yang dipesan oleh");
        this.pesanan_error=pesanan_input;
    }

    public String getMessage()
    {
        return super.getMessage() + pesanan_error.getPelanggan().getNama() +" tidak ditemukan";
    }
}
