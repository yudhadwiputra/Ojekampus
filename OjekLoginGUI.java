import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseAdapter;
import javax.swing.*;

/**
 * Antarmuka untuk login Ojek
 * 
 * @author Yudha Dwi Putra
 * @version 29 April 2017
 */

public class OjekLoginGUI extends JFrame
{
    private JButton enter;
    private JButton accept;
    private JButton decline;
    private JLabel labelidojek;
    private JLabel labelinfo;
    private JLabel labelojeklogin;
    private JTextField idOjek;
    private JTextField status;

    public OjekLoginGUI()
    {
        this.setTitle("Ojek Login GUI");
        this.setSize(500,400);

        JPanel contentPane = new JPanel(null);
        contentPane.setPreferredSize(new Dimension(500,400));

        enter = new JButton();
        enter.setBounds(312,105,126,36);
        enter.setEnabled(true);
        enter.setText("Enter");
        enter.setVisible(true);

        accept = new JButton();
        accept.setBounds(152,280,80,44);
        accept.setEnabled(true);
        accept.setText("Accept");
        accept.setVisible(true);
        enter.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent klik)
            {
                DatabaseUser.getUserOjek(Integer.parseInt(idOjek.getText()));
                status.setText((DatabaseUser.getUserOjek(Integer.parseInt(idOjek.getText())).toString()));
            }
        });
        
        decline = new JButton();
        decline.setBounds(247,280,80,43);
        decline.setEnabled(true);
        decline.setText("Decline");
        decline.setVisible(true);
        decline.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent klik)
            {
                Administrasi.pesananDibatalkan(DatabaseUser.getUserOjek(Integer.parseInt(idOjek.getText())));
            }
        });

        labelidojek = new JLabel();
        labelidojek.setBounds(25,103,90,35);
        labelidojek.setEnabled(true);
        labelidojek.setText("ID");
        labelidojek.setVisible(true);

        labelinfo = new JLabel();
        labelinfo.setBounds(139,163,253,48);
        labelinfo.setEnabled(true);
        labelinfo.setText("Informasi Pesanan");
        labelinfo.setVisible(true);

        labelojeklogin = new JLabel();
        labelojeklogin.setBounds(129,17,250,68);
        labelojeklogin.setEnabled(true);
        labelojeklogin.setText("OJEK LOGIN");
        labelojeklogin.setVisible(true);

        idOjek = new JTextField();
        idOjek.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent e){
                idOjek.setText("");
            }
        });
        idOjek.setBounds(91,104,171,34);
        idOjek.setEnabled(true);
        idOjek.setText("No ID");
        idOjek.setVisible(true);

        status = new JTextField();
        status.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent e){
                status.setText("");
            }
        });
        status.setBounds(31,216,430,40);
        status.setEnabled(true);
        status.setText("Status");
        status.setVisible(true);
		
        contentPane.add(enter);
        contentPane.add(accept);
        contentPane.add(decline);
        contentPane.add(labelidojek);
        contentPane.add(labelinfo);
        contentPane.add(labelojeklogin);
        contentPane.add(idOjek);
        contentPane.add(status);
        
        this.add(contentPane);
        this.setLocationRelativeTo(null);
        this.pack();
        this.setVisible(true);
    }
    
    
     public static void main(String[] args)
     {
          new OjekLoginGUI();  
     }
}
