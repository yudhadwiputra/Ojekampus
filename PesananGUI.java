import javax.swing.*;
import java.awt.*;
/**
 * Write a description of class PesananGUI here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PesananGUI extends JFrame
{
    private JMenuBar menuBar;
    private JButton button1;
    private JButton button2;
    private JComboBox combobox1;
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    private JLabel label5;
    private JLabel label6;
    private JLabel label7;
    private JLabel label8;
    private JTextField textfield1;
    private JTextField textfield10;
    private JTextField textfield11;
    private JTextField textfield12;
    private JTextField textfield2;
    private JTextField textfield3;
    private JTextField textfield4;
    private JTextField textfield5;
    private JTextField textfield6;
    private JTextField textfield7;
    private JTextField textfield8;
    private JTextField textfield9;

    public PesananGUI(){
        this.setTitle("Pemesanan Customer GUI");
        this.setSize(500,400);
        this.setJMenuBar(menuBar);

        JPanel contentPane = new JPanel(null);
        contentPane.setPreferredSize(new Dimension(500,400));
        contentPane.setBackground(new Color(192,192,192));

        button1 = new JButton();
        button1.setBounds(378,49,90,35);
        button1.setEnabled(true);
        button1.setText("Enter");
        button1.setVisible(true);

        button2 = new JButton();
        button2.setBounds(395,328,90,35);
        button2.setEnabled(true);
        button2.setText("Pesan");
        button2.setVisible(true);

        combobox1 = new JComboBox();
        combobox1.setBounds(130,90,90,35);
        combobox1.setEnabled(true);
        combobox1.setVisible(true);

        label1 = new JLabel();
        label1.setBounds(170,8,150,35);
        label1.setEnabled(true);
        label1.setText("Pemesanan Customer");
        label1.setVisible(true);

        label2 = new JLabel();
        label2.setBounds(30,57,90,35);
        label2.setEnabled(true);
        label2.setText("ID");
        label2.setVisible(true);

        label3 = new JLabel();
        label3.setBounds(30,91,90,35);
        label3.setEnabled(true);
        label3.setText("Tipe Layanan");
        label3.setVisible(true);

        label4 = new JLabel();
        label4.setBounds(30,122,90,35);
        label4.setEnabled(true);
        label4.setText("Lokasi Awal");
        label4.setVisible(true);

        label5 = new JLabel();
        label5.setEnabled(true);
        label5.setText("Lokasi Akhir");
        label5.setVisible(true);

        label6 = new JLabel();
        label6.setBounds(30,209,90,35);
        label6.setEnabled(true);
        label6.setText("NP Awal");
        label6.setVisible(true);

        label7 = new JLabel();
        label7.setBounds(30,270,90,35);
        label7.setEnabled(true);
        label7.setText("NP AKhir");
        label7.setVisible(true);

        label8 = new JLabel();
        label8.setBounds(30,300,90,35);
        label8.setEnabled(true);
        label8.setText("Biaya");
        label8.setVisible(true);

        textfield1 = new JTextField();
        textfield1.setBounds(130,54,90,35);
        textfield1.setEnabled(true);
        textfield1.setText("id");
        textfield1.setVisible(true);

        textfield10 = new JTextField();
        textfield10.setBounds(130,217,90,35);
        textfield10.setEnabled(true);
        textfield10.setText("Nama Pengguna Awal");
        textfield10.setVisible(true);

        textfield11 = new JTextField();
        textfield11.setBounds(130,254,90,35);
        textfield11.setEnabled(true);
        textfield11.setText("Nama Pengguna Akhir");
        textfield11.setVisible(true);

        textfield12 = new JTextField();
        textfield12.setBounds(130,289,90,35);
        textfield12.setEnabled(true);
        textfield12.setText("Biaya");
        textfield12.setVisible(true);

        textfield2 = new JTextField();
        textfield2.setBounds(130,129,90,35);
        textfield2.setEnabled(true);
        textfield2.setText("x");
        textfield2.setVisible(true);

        textfield3 = new JTextField();
        textfield3.setBounds(220,129,90,35);
        textfield3.setEnabled(true);
        textfield3.setText("y");
        textfield3.setVisible(true);

        textfield4 = new JTextField();
        textfield4.setBounds(315,129,90,35);
        textfield4.setEnabled(true);
        textfield4.setText("Nama Lokasi");
        textfield4.setVisible(true);

        textfield5 = new JTextField();
        textfield5.setBounds(405,129,90,35);
        textfield5.setEnabled(true);
        textfield5.setText("Keterangan");
        textfield5.setVisible(true);

        textfield6 = new JTextField();
        textfield6.setBounds(130,165,90,35);
        textfield6.setEnabled(true);
        textfield6.setText("x");
        textfield6.setVisible(true);

        textfield7 = new JTextField();
        textfield7.setBounds(220,165,90,35);
        textfield7.setEnabled(true);
        textfield7.setText("y");
        textfield7.setVisible(true);

        textfield8 = new JTextField();
        textfield8.setBounds(315,165,90,35);
        textfield8.setEnabled(true);
        textfield8.setText("Nama Lokasi");
        textfield8.setVisible(true);

        textfield9 = new JTextField();
        textfield9.setBounds(405,165,90,35);
        textfield9.setEnabled(true);
        textfield9.setText("Keterangan");
        textfield9.setVisible(true);

        contentPane.add(button1);
        contentPane.add(button2);
        contentPane.add(combobox1);
        contentPane.add(label1);
        contentPane.add(label2);
        contentPane.add(label3);
        contentPane.add(label4);
        contentPane.add(label5);
        contentPane.add(label6);
        contentPane.add(label7);
        contentPane.add(label8);
        contentPane.add(textfield1);
        contentPane.add(textfield10);
        contentPane.add(textfield11);
        contentPane.add(textfield12);
        contentPane.add(textfield2);
        contentPane.add(textfield3);
        contentPane.add(textfield4);
        contentPane.add(textfield5);
        contentPane.add(textfield6);
        contentPane.add(textfield7);
        contentPane.add(textfield8);
        contentPane.add(textfield9);

        this.add(contentPane);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.pack();
        this.setVisible(true);
    }
    
    public static void main(String args[]) {
        new PesananGUI();
    }
}
