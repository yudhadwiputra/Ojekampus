
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

public class RegistOjekGUI extends JFrame
{
    private JButton registrasiojek;
    private JLabel labelNama;
    private JLabel labelDOB;
    private JLabel labelEmail;
    private JLabel labelLokasi;
    private JLabel labelPlat;
    private JLabel labelOjek;
    private JLabel labelTelp;
    private JTextField nama;
    private JTextField telepon;
    private JTextField email;
    private JTextField dob;
    private JTextField no_plat;
    private JTextField kor_x;
    private JTextField kor_y;
    private JTextField namaLokasi;
    private JTextField keterangan;
    
    public RegistOjekGUI()
    {  
        this.setTitle("Registrasi Ojek GUI");
        this.setSize(505,412);

        JPanel contentPane = new JPanel(null);
        contentPane.setPreferredSize(new Dimension(505,412));

        registrasiojek = new JButton();
        registrasiojek.setBounds(385,297,103,57);
        registrasiojek.setEnabled(true);
        registrasiojek.setText("Registrasi");
        registrasiojek.setVisible(true);
        registrasiojek.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent klik)
            {
                DatabaseUser.addOjek(new Ojek(DatabaseUser.getIDOjekTerakhir(), nama.getText(), new Lokasi(namaLokasi.getText(), Integer.parseInt(kor_x.getText()), Integer.parseInt(kor_y.getText()), keterangan.getText())));
                Administrasi.printOjekDatabase();
            }
        });

        labelNama = new JLabel();
        labelNama.setBounds(47,90,90,35);
        labelNama.setEnabled(true);
        labelNama.setText("Nama");
        labelNama.setVisible(true);

        labelDOB = new JLabel();
        labelDOB.setBounds(47,189,90,35);
        labelDOB.setEnabled(true);
        labelDOB.setText("DoB");
        labelDOB.setVisible(true);

        labelEmail = new JLabel();
        labelEmail.setBounds(47,155,90,35);
        labelEmail.setEnabled(true);
        labelEmail.setText("Email");
        labelEmail.setVisible(true);

        labelLokasi = new JLabel();
        labelLokasi.setBounds(47,261,90,35);
        labelLokasi.setEnabled(true);
        labelLokasi.setText("Lokasi");
        labelLokasi.setVisible(true);

        labelPlat = new JLabel();
        labelPlat.setBounds(47,225,90,35);
        labelPlat.setEnabled(true);
        labelPlat.setText("Plat");
        labelPlat.setVisible(true);

        labelOjek = new JLabel();
        labelOjek.setBounds(95,5,317,87);
        labelOjek.setEnabled(true);
        labelOjek.setText("REGISTRASI OJEK");
        labelOjek.setVisible(true);

        labelTelp = new JLabel();
        labelTelp.setBounds(47,122,90,35);
        labelTelp.setEnabled(true);
        labelTelp.setText("Telepon");
        labelTelp.setVisible(true);

        nama = new JTextField();
        nama.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent e){
                nama.setText("");
            }
        });
        nama.setBounds(148,93,226,30);
        nama.setEnabled(true);
        nama.setText("Nama");
        nama.setVisible(true);

        telepon = new JTextField();
        telepon.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent e){
                telepon.setText("");
            }
        });
        telepon.setBounds(148,126,226,30);
        telepon.setEnabled(true);
        telepon.setText("0857xxxxxx");
        telepon.setVisible(true);

        email = new JTextField();
        email.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent e){
                email.setText("");
            }
        });
        email.setBounds(148,161,226,30);
        email.setEnabled(true);
        email.setText("contoh@ex.com");
        email.setVisible(true);

        dob = new JTextField();
        dob.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent e){
                dob.setText("");
            }
        });
        dob.setBounds(148,195,226,30);
        dob.setEnabled(true);
        dob.setText("dd/MM/yyyy");
        dob.setVisible(true);

        no_plat = new JTextField();
        no_plat.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent e){
                no_plat.setText("");
            }
        });
        no_plat.setBounds(148,231,226,30);
        no_plat.setEnabled(true);
        no_plat.setText("B1234AB");
        no_plat.setVisible(true);

        kor_x = new JTextField();
        kor_x.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent e){
                kor_x.setText("");
            }
        });
        kor_x.setBounds(151,265,60,40);
        kor_x.setEnabled(true);
        kor_x.setText("x :");
        kor_x.setVisible(true);

        kor_y = new JTextField();
        kor_y.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent e){
                kor_y.setText("");
            }
        });
        kor_y.setBounds(219,266,60,40);
        kor_y.setEnabled(true);
        kor_y.setText("y :");
        kor_y.setVisible(true);

        namaLokasi = new JTextField();
        namaLokasi.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent e){
                namaLokasi.setText("");
            }
        });
        namaLokasi.setBounds(148,315,92,36);
        namaLokasi.setEnabled(true);
        namaLokasi.setText("Nama Lokasi");
        namaLokasi.setVisible(true);

        keterangan = new JTextField();
        keterangan.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent e){
                keterangan.setText("");
            }
        });
        keterangan.setBounds(245,315,92,36);
        keterangan.setEnabled(true);
        keterangan.setText("Keterangan");
        keterangan.setVisible(true);

        contentPane.add(registrasiojek);
        contentPane.add(labelNama);
        contentPane.add(labelDOB);
        contentPane.add(labelEmail);
        contentPane.add(labelLokasi);
        contentPane.add(labelPlat);
        contentPane.add(labelOjek);
        contentPane.add(labelTelp);
        contentPane.add(nama);
        contentPane.add(telepon);
        contentPane.add(email);
        contentPane.add(dob);
        contentPane.add(no_plat);
        contentPane.add(kor_x);
        contentPane.add(kor_y);
        contentPane.add(namaLokasi);
        contentPane.add(keterangan);

        this.add(contentPane);
        this.setLocationRelativeTo(null);
        this.pack();
        this.setVisible(true);
    }

    public static void main(String[] args)
    {
         new RegistOjekGUI();
    }
}
