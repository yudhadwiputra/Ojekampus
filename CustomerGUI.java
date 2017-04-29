import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 * Write a description of class CustomerGUI here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CustomerGUI extends JFrame
{
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JLabel label1;
    
    public CustomerGUI(){
        this.setTitle("Customer GUI");
        this.setSize(500,400);
        
        JPanel contentPane = new JPanel(null);
        contentPane.setPreferredSize(new Dimension(500,400));

        button1 = new JButton();
        button1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                new RegistGUI();
                setVisible(true);
                dispose();
            }
        });
        button1.setBounds(195,112,120,35);
        button1.setEnabled(true);
        button1.setText("Registrasi");
        button1.setVisible(true);

        button2 = new JButton();
        button2.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                new PesananGUI();
                setVisible(true);
                dispose();
            }
        });
        button2.setBounds(195,165,120,35);
        button2.setEnabled(true);
        button2.setText("Pemesanan");
        button2.setVisible(true);

        button3 = new JButton();
        button3.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                new TungguGUI();
                setVisible(true);
                dispose();
            }
        });
        button3.setBounds(195,221,120,35);
        button3.setEnabled(true);
        button3.setText("Menunggu");
        button3.setVisible(true);

        label1 = new JLabel();
        label1.setBounds(236,46,120,35);
        label1.setEnabled(true);
        label1.setText("Customer");
        label1.setVisible(true);

        contentPane.add(button1);
        contentPane.add(button2);
        contentPane.add(button3);
        contentPane.add(label1);

        this.add(contentPane);
        this.setLocationRelativeTo(null);
        this.pack();
        this.setVisible(true);
    
    }
    
    public static void main(String args[]) {
        new CustomerGUI();
    }

}
