
/**
 * Write a description of class Administrasi here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Administrasi
{
    // instance variables - replace the example below with your own

    public Administrasi(Pesanan pesan, Ojek pelayan)
    {
        pesan.setStatusSelesai(false);
        pesan.setStatusDiproses(true);
        pesan.setPelayan(pelayan);
        ojekAmbilPesanan(pesan,pelayan);
        
    }
    
    public void pesananDitugaskan(Pesanan pesan, Ojek pelayan)
    {
        
    }
    
    public void ojekAmbilPesanan(Pesanan pesan, Ojek pelayan)
    {
       pelayan.setStatus(StatusOjek.Jemput);
       pelayan.setPesanan(pesan);
    }
    
    public void ojekLepasPesanan(Ojek pelayan)
    {
        pelayan.setStatus(StatusOjek.Idle);
        pelayan.setPesanan(null);
    }
    
    public void pesananDibatalkan(Ojek pelayan)
    {
        Pesanan pesan = pelayan.getPesanan();
        pesan.setStatusSelesai(false);
        pesan.setStatusDiproses(false);
        pesan.setPelayan(null);
        ojekLepasPesanan(pelayan);
    }
    
    public void pesananSelesai(Ojek pelayan)
    {
        Pesanan pesan = pelayan.getPesanan();
        pesan.setStatusSelesai(true);
        pesan.setStatusDiproses(false);
        pesan.setPelayan(null);
        ojekLepasPesanan(pelayan);
    }
    
    public void pesananDibatalkan(Pesanan pesan)
    {
        pesan.setStatusDiproses(false);
        pesan.setStatusSelesai(false);
        pesan.setPelayan(null);
        ojekLepasPesanan(pesan.getOjek());
    }
    
    public void pesananSelesai(Pesanan pesan)
    {
        
    }

}
