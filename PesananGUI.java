import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseAdapter;
import javax.swing.*;

/**
 * Write a description of class WelcomeGUI here.
 * 
 * @author Yudha Dwi Putra
 * @version 29 April 2017
 */

public class PesananGUI extends JFrame {
    private JButton enter;
    private JButton pesan;
    private JLabel biaya;
    private JLabel id;
    private JLabel labelPesanan; 
    private JLabel labelLokasiAkhir;
    private JLabel labelLokasiAwal; 
    private JLabel labelNamaAkhir; 
    private JLabel labelNamaAwal; 
    private JLabel tipeLayanan;
    private JTextField ID; 
    private JTextField x_awal;
    private JTextField y_awal; 
    private JTextField x_akhir;
    private JTextField y_akhir;
    private JTextField lokasiAwal; 
    private JTextField lokasiAkhir;
    private JTextField keteranganAwal;
    private JTextField keteranganAkhir;
    private JTextField namaAwal;
    private JTextField namaAkhir;
    private JTextField Biaya;
    private JComboBox pilihTipeLayanan;
    
    public PesananGUI()
    {
        this.setTitle("Pesanan GUI");
        this.setSize(497,428);
       
        JPanel contentPane = new JPanel(null);
        contentPane.setPreferredSize(new Dimension(497,428));

        labelPesanan = new JLabel();
        labelPesanan.setBounds(43,8,430,76);
        labelPesanan.setEnabled(true);
        labelPesanan.setText("PEMESANAN CUSTOMER");
        labelPesanan.setVisible(true);
        
        biaya = new JLabel();
        biaya.setBounds(18,322,90,35);
        biaya.setEnabled(true);
        biaya.setText("Biaya");
        biaya.setVisible(true);

        enter = new JButton();
        enter.setBounds(387,68,90,35);
        enter.setEnabled(true);
        enter.setText("Enter");
        enter.setVisible(true);
        enter.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent klik)
            {
                DatabaseUser.getUserPelanggan(Integer.parseInt(ID.getText()));
            }
        });

        id = new JLabel();
        id.setBounds(20,68,120,35);
        id.setEnabled(true);
        id.setText("ID                    :");
        id.setVisible(true);

        ID = new JTextField();
        ID.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent e){
                ID.setText("");
            }
        });
        ID.setBounds(125,68,250,35);
        ID.setEnabled(true);
        ID.setText("ID");
        ID.setVisible(true);

        tipeLayanan = new JLabel();
        tipeLayanan.setBounds(20,110,120,35);
        tipeLayanan.setEnabled(true);
        tipeLayanan.setText("Tipe Layanan   :");
        tipeLayanan.setVisible(true);
        
        JComboBox<TipeLayanan> pilihTipeLayanan = new JComboBox<>();
        pilihTipeLayanan.setModel(new DefaultComboBoxModel<>(TipeLayanan.values()));
        pilihTipeLayanan.setBounds(125,110,250,35);
        pilihTipeLayanan.setEnabled(true);
        pilihTipeLayanan.setVisible(true);
        
        labelLokasiAkhir = new JLabel();
        labelLokasiAkhir.setBounds(20,194,120,35);
        labelLokasiAkhir.setEnabled(true);
        labelLokasiAkhir.setText("Lokasi akhir     :");
        labelLokasiAkhir.setVisible(true);

        labelLokasiAwal = new JLabel();
        labelLokasiAwal.setBounds(20,151,120,35);
        labelLokasiAwal.setEnabled(true);
        labelLokasiAwal.setText("Lokasi awal");
        labelLokasiAwal.setVisible(true);

        labelNamaAkhir = new JLabel();
        labelNamaAkhir.setBounds(20,278,120,35);
        labelNamaAkhir.setEnabled(true);
        labelNamaAkhir.setText("NP Akhir");
        labelNamaAkhir.setVisible(true);

        labelNamaAwal = new JLabel();
        labelNamaAwal.setBounds(20,236,120,35);
        labelNamaAwal.setEnabled(true);
        labelNamaAwal.setText("NP Awal");
        labelNamaAwal.setVisible(true);

        x_awal = new JTextField();
        x_awal.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent e){
                x_awal.setText("");
            }
        });
        x_awal.setBounds(125,151,50,35);
        x_awal.setEnabled(true);
        x_awal.setText("x");
        x_awal.setVisible(true);
        
        y_awal = new JTextField();
        y_awal.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent e){
                y_awal.setText("");
            }
        });
        y_awal.setBounds(180,151,50,35);
        y_awal.setEnabled(true);
        y_awal.setText("y");
        y_awal.setVisible(true);
        
        lokasiAwal = new JTextField();
        lokasiAwal.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent e){
                lokasiAwal.setText("");
            }
        });
        lokasiAwal.setBounds(235,151,140,35);
        lokasiAwal.setEnabled(true);
        lokasiAwal.setText("Nama Lokasi");
        lokasiAwal.setVisible(true);
        
        keteranganAwal = new JTextField();
        keteranganAwal.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent e){
                keteranganAwal.setText("");
            }
        });
        keteranganAwal.setBounds(380,151,90,35);
        keteranganAwal.setEnabled(true);
        keteranganAwal.setText("Keterangan");
        keteranganAwal.setVisible(true);
        
        x_akhir = new JTextField();
        x_akhir.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent e){
                x_akhir.setText("");
            }
        });
        x_akhir.setBounds(125,194,50,35);
        x_akhir.setEnabled(true);
        x_akhir.setText("x");
        x_akhir.setVisible(true);
        
        y_akhir = new JTextField();
        y_akhir.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent e){
                y_akhir.setText("");
            }
        });
        y_akhir.setBounds(180,194,50,35);
        y_akhir.setEnabled(true);
        y_akhir.setText("y");
        y_akhir.setVisible(true);
        
        lokasiAkhir = new JTextField();
        lokasiAkhir.setBounds(235,194,140,35);
        lokasiAkhir.setEnabled(true);
        lokasiAkhir.setText("Nama Lokasi");
        lokasiAkhir.setVisible(true);
        
        keteranganAkhir = new JTextField();
        keteranganAkhir.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent e){
                keteranganAkhir.setText("");
            }
        });
        keteranganAkhir.setBounds(380,194,90,35);
        keteranganAkhir.setEnabled(true);
        keteranganAkhir.setText("Keterangan");
        keteranganAkhir.setVisible(true);
         
        namaAwal = new JTextField();
        namaAwal.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent e){
                namaAwal.setText("");
            }
        });
        namaAwal.setBounds(125, 236, 250, 35);
        namaAwal.setEnabled(true);
        namaAwal.setText("Nama Pengguna Awal");
        namaAwal.setVisible(true);
        
        namaAkhir = new JTextField();
        namaAkhir.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent e){
                namaAkhir.setText("");
            }
        });
        namaAkhir.setBounds(125, 278, 250, 35);
        namaAkhir.setEnabled(true);
        namaAkhir.setText("Nama Pengguna Akhir");
        namaAkhir.setVisible(true);
        
        Biaya = new JTextField();
        Biaya.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent e){
                Biaya.setText("");
            }
        });
        Biaya.setBounds(125, 320, 250, 35);
        Biaya.setEnabled(true);
        Biaya.setText("Biaya");
        Biaya.setVisible(true);
        
        pesan = new JButton();
        pesan.setBounds(380,362,90,35);
        pesan.setEnabled(true);
        pesan.setText("Pesan");
        pesan.setVisible(true);
        pesan.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent klik)
            {
                try
                {
                    DatabasePesanan.addPesanan(
                    new Pesanan(DatabaseUser.getUserPelanggan(Integer.parseInt(ID.getText())), (TipeLayanan)pilihTipeLayanan.getSelectedItem(), 
                    new Lokasi(lokasiAwal.getText(), Integer.parseInt(x_awal.getText()), Integer.parseInt(y_awal.getText()), keteranganAwal.getText()), 
                    new Lokasi(lokasiAkhir.getText(),Integer.parseInt(x_akhir.getText()), Integer.parseInt(y_akhir.getText()), keteranganAkhir.getText()), 
                    namaAwal.getText(), namaAkhir.getText(), Integer.parseInt(Biaya.getText())));
                    Administrasi.printPesananDatabase();
                    Administrasi.jalankanSistemPenugas();
                }
                catch(PesananSudahAdaException e)
                {
                    System.out.println(e.getMessage());
                }
            }
        });
        
        contentPane.add(biaya);
        contentPane.add(enter);
        contentPane.add(id);
        contentPane.add(ID);
        contentPane.add(labelPesanan);
        contentPane.add(labelLokasiAkhir);
        contentPane.add(labelLokasiAwal);
        contentPane.add(labelNamaAkhir);
        contentPane.add(labelNamaAwal);
        contentPane.add(pilihTipeLayanan);
        contentPane.add(x_awal);
        contentPane.add(y_awal);
        contentPane.add(lokasiAwal);
        contentPane.add(keteranganAwal);
        contentPane.add(x_akhir);
        contentPane.add(y_akhir);
        contentPane.add(lokasiAkhir);
        contentPane.add(keteranganAkhir);
        contentPane.add(namaAwal);
        contentPane.add(namaAkhir);
        contentPane.add(Biaya);        
        contentPane.add(tipeLayanan);
        contentPane.add(pesan);

        this.add(contentPane);
        this.setLocationRelativeTo(null);
        this.pack();
        this.setVisible(true);
    }

     public static void main(String[] args)
     {
         new PesananGUI();   
     }

}