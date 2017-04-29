import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseAdapter;
/**
 * Write a description of class RegistGUI here.
 * 
 * @author (Yudha Dwi Putra) 
 * @version (29/04/2017)
 */
public class RegistGUI extends JFrame
{
    private JMenuBar menuBar;
    private JButton button1;
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    private JLabel label5;
    private JTextField textfield1;
    private JTextField textfield2;
    private JTextField textfield3;
    private JTextField textfield4;


    public RegistGUI(){

        this.setTitle("Registration User GUI");
        this.setSize(500,400);
        this.setJMenuBar(menuBar);

        //pane with null layout
        JPanel contentPane = new JPanel(null);
        contentPane.setPreferredSize(new Dimension(500,400));
        contentPane.setBackground(new Color(192,192,192));


        button1 = new JButton();
        button1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                Pelanggan pelanggan1 = new Pelanggan(DatabaseUser.getIDPelangganTerakhir(), textfield1.getText(), textfield2.getText());
                DatabaseUser.addPelanggan(pelanggan1);
                JOptionPane.showMessageDialog(null, "Menyimpan data ID dengan Nama : "+textfield1.getText()+" dan Telp : " +textfield2.getText());
            }
        });

        button1.setBounds(197,228,120,35);
        button1.setEnabled(true);
        button1.setText("Registrasi");
        button1.setVisible(true);

        label1 = new JLabel();
        label1.setBounds(98,19,120,35);
        label1.setEnabled(true);
        label1.setText("Registrasi Customer");
        label1.setVisible(true);

        label2 = new JLabel();
        label2.setBounds(40,64,90,35);
        label2.setEnabled(true);
        label2.setText("Nama    :");
        label2.setVisible(true);

        label3 = new JLabel();
        label3.setBounds(40,93,90,35);
        label3.setEnabled(true);
        label3.setText("Telp    :");
        label3.setVisible(true);

        label4 = new JLabel();
        label4.setBounds(40,125,90,35);
        label4.setEnabled(true);
        label4.setText("Email   :");
        label4.setVisible(true);

        label5 = new JLabel();
        label5.setBounds(40,159,90,35);
        label5.setEnabled(true);
        label5.setText("DoB :");
        label5.setVisible(true);

        textfield1 = new JTextField("example"); 
        textfield1.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                textfield1.setText("");
            }
        });
        textfield1.setBounds(130,66,90,35);
        textfield1.setEnabled(true);
        textfield1.setVisible(true);

        

        textfield2 = new JTextField("12345678");
        textfield2.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                textfield2.setText("");
            }
        });
        textfield2.setBounds(130,93,90,35);
        textfield2.setEnabled(true);
        textfield2.setVisible(true);



        textfield3 = new JTextField("example@ex.co");
        textfield3.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                textfield3.setText("");
            }
        });
        textfield3.setBounds(130,132,90,35);
        textfield3.setEnabled(true);
        textfield3.setVisible(true);

        textfield4 = new JTextField("dd/MM/yyyy");
        textfield4.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                textfield4.setText("");
            }
        });
        textfield4.setBounds(130,162,90,35);
        textfield4.setEnabled(true);
        textfield4.setVisible(true);

        contentPane.add(button1);
        contentPane.add(label1);
        contentPane.add(label2);
        contentPane.add(label3);
        contentPane.add(label4);
        contentPane.add(label5);
        contentPane.add(textfield1);
        contentPane.add(textfield2);
        contentPane.add(textfield3);
        contentPane.add(textfield4);

        //adding panel to JFrame and seting of window position and close operation
        this.add(contentPane);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.pack();
        this.setVisible(true);
    }
        
    public static void main(String args[]) {
        new RegistGUI();
    }
}
