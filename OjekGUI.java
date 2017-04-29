import javax.swing.UIManager.LookAndFeelInfo;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import javax.swing.*;

/**
 * Write a description of class WelcomeGUI here.
 * 
 * @author Yudha
 * @version 29 April 2017
 */

public class OjekGUI extends JFrame
{
    private JButton buttonloginojek;
    private JButton buttonregojek;
    private JLabel labelojek;
    
    public OjekGUI() 
    {
        this.setTitle("Ojek GUI");
        this.setSize(500,400);

        JPanel contentPane = new JPanel(null);
        contentPane.setPreferredSize(new Dimension(500,400));

        buttonloginojek = new JButton();
        buttonloginojek.setBounds(188,208,120,55);
        buttonloginojek.setEnabled(true);
        buttonloginojek.setText("Login");
        buttonloginojek.setVisible(true);
        buttonloginojek.addMouseListener(new MouseAdapter() 
        {
            public void mouseClicked(MouseEvent klik) 
            {
                new OjekLoginGUI();
            }
        });
        
        buttonregojek = new JButton();
        buttonregojek.setBounds(188,149,120,55);
        buttonregojek.setEnabled(true);
        buttonregojek.setText("Registrasi");
        buttonregojek.setVisible(true);
        buttonregojek.addMouseListener(new MouseAdapter() 
        {
            public void mouseClicked(MouseEvent klik) 
            {
                new RegistOjekGUI();
            }
        });

        labelojek = new JLabel();
        labelojek.setBounds(183,40,194,80);
        labelojek.setEnabled(true);
        labelojek.setText("OJEK");
        labelojek.setVisible(true);
        
        contentPane.add(buttonloginojek);
        contentPane.add(buttonregojek);
        contentPane.add(labelojek);

        this.add(contentPane);
        this.setLocationRelativeTo(null);
        this.pack();
        this.setVisible(true);
    }
    
    
    public static void main(String[] args)
    {
        new OjekGUI();
    }
}
