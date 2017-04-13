
/**
 * Write a description of class PesananOlehPelangganDitemukanException here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PesananOlehPelangganDitemukanException extends Exception
{
    private Pelanggan pelanggan_error;

    public PesananOlehPelangganDitemukanException(Pelanggan pelanggan_input)
    {
        super("Pesanan oleh ");
        this.pelanggan_error=pelanggan_input;
    }

    public String getMessage()
    {
        return super.getMessage() + pelanggan_error.getNama() + " tidak ditemukan";
    }
}
