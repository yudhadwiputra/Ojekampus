import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseAdapter;
import javax.swing.*;

/**
 * Tunggu GUI
 * 
 * @author Yudha Dwi Putra
 * @version 29 April 2017
 */
public class TungguGUI extends JFrame
{
    private JButton enter;
    private JButton accept;
    private JButton decline;
    private JButton delete;
    private JLabel labelidcust;
    private JLabel labelinfo;
    private JLabel menunggu;
    private JTextField ID;
    private JTextField status;

    public TungguGUI()
    {
        this.setTitle("Tunggu GUI");
        this.setSize(500,400);

        JPanel contentPane = new JPanel(null);
        contentPane.setPreferredSize(new Dimension(500,450));

        enter = new JButton();
        enter.setBounds(312,105,126,36);
        enter.setEnabled(true);
        enter.setText("Enter");
        enter.setVisible(true);
        enter.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent klik)
            {
                DatabaseUser.getUserPelanggan(Integer.parseInt(ID.getText()));
                status.setText(DatabasePesanan.getPesanan((DatabaseUser.getUserPelanggan(Integer.parseInt(ID.getText())))).toString());
            }
        });

        accept = new JButton();
        accept.setBounds(152,280,80,44);
        accept.setEnabled(true);
        accept.setText("Accept");
        accept.setVisible(true);

        decline = new JButton();
        decline.setBounds(247,280,80,44);
        decline.setEnabled(true);
        decline.setText("Decline");
        decline.setVisible(true);
        decline.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent klik)
            {
                Administrasi.pesananDibatalkan(DatabaseUser.getUserPelanggan(Integer.parseInt(ID.getText())));
            }
        });

        delete = new JButton();
        delete.setBounds(195,335,80,44);
        delete.setEnabled(true);
        delete.setText("Delete");
        delete.setVisible(true);
        delete.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent klik)
            {
                Administrasi.pesananSelesai(DatabaseUser.getUserPelanggan(Integer.parseInt(ID.getText())));
            }
        });

        
        labelidcust = new JLabel();
        labelidcust.setBounds(25,103,90,35);
        labelidcust.setEnabled(true);
        labelidcust.setText("ID");
        labelidcust.setVisible(true);

        labelinfo = new JLabel();
        labelinfo.setBounds(139,163,253,48);
        labelinfo.setEnabled(true);
        labelinfo.setText("Informasi Pesanan");
        labelinfo.setVisible(true);

        menunggu = new JLabel();
        menunggu.setBounds(40,17,420,68);
        menunggu.setEnabled(true);
        menunggu.setText("CUSTOMER MENUNGGU");
        menunggu.setVisible(true);

        ID = new JTextField();
        ID.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent e){
                ID.setText("");
            }
        });
        ID.setBounds(91,104,171,34);
        ID.setEnabled(true);
        ID.setText("No ID");
        ID.setVisible(true);

        status = new JTextField();
        status.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent e){
                status.setText("");
            }
        });
        status.setBounds(25,216,454,40);
        status.setEnabled(true);
        status.setText("Status");
        status.setVisible(true);
		
        contentPane.add(enter);
        contentPane.add(accept);
        contentPane.add(decline);
        contentPane.add(delete);
        contentPane.add(labelidcust);
        contentPane.add(labelinfo);
        contentPane.add(menunggu);
        contentPane.add(ID);
        contentPane.add(status);
        
        this.add(contentPane);
        this.setLocationRelativeTo(null);
        this.pack();
        this.setVisible(true);
    }
    
    
    public static void main(String[] args)
    {
        new TungguGUI();
    }
}
