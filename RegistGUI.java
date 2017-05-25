/**
*Text genereted by Simple GUI Extension for BlueJ
*/
import javax.swing.UIManager.LookAndFeelInfo;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.WindowAdapter;
import java.awt.event.FocusAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowEvent;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import java.awt.event.FocusListener;
import java.awt.event.FocusEvent;
import javax.swing.border.Border;
import javax.swing.*;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.regex.Pattern;
import java.util.regex.Matcher;


public class RegistGUI extends JFrame {

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

    //Constructor 
    public RegistGUI(){

        this.setTitle("RegistGUI");
        this.setSize(400,300);
        //menu generate method
        generateMenu();
        this.setJMenuBar(menuBar);

        //pane with null layout
        JPanel contentPane = new JPanel(null);
        contentPane.setPreferredSize(new Dimension(400,300));
        contentPane.setBackground(new Color(192,192,192));


        button1 = new JButton();
        button1.setBounds(244,245,90,35);
        button1.setBackground(new Color(214,217,223));
        button1.setForeground(new Color(0,0,0));
        button1.setEnabled(true);
        button1.setFont(new Font("sansserif",0,12));
        button1.setText("Registrasi");
        button1.setVisible(true);
        button1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                Pattern pattern_telefon = Pattern.compile("^08[0-9]{9,}$");
                Matcher matcher_telefon = pattern_telefon.matcher(textfield2.getText());
                Pattern pattern_email = Pattern.compile("[^ !].+@.+\\..+");
                Matcher matcher_email = pattern_email.matcher(textfield3.getText());
                if(
                    !textfield1.getText().equals("") &&
                    !textfield2.getText().equals("")
                ){
                    if(
                        matcher_telefon.matches() &&
                        matcher_email.matches() 
                    ){
                        try {
                            DateFormat sourceFormat = new SimpleDateFormat("dd/MM/yyyy");
                            String dateAsString = textfield4.getText();
                            Date date = sourceFormat.parse(dateAsString);
                            DatabaseUser.addPelanggan(new Pelanggan(DatabaseUser.getIDPelangganTerakhir(), textfield1.getText(), textfield2.getText()));
                            Administrasi.printPelangganDatabase();
                            JOptionPane.showMessageDialog(null, "Registrasi Berhasil", "Registrasi Berhasil", JOptionPane.INFORMATION_MESSAGE);
                        } catch(java.text.ParseException | NumberFormatException exception) {
                            JOptionPane.showMessageDialog(null, exception.getMessage(), "Registrasi Gagal", JOptionPane.ERROR_MESSAGE);
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Input Salah!", "Registrasi Gagal", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Input tidak boleh kosong", "Registrasi Gagal", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        
        label1 = new JLabel();
        label1.setBounds(135,30,158,26);
        label1.setBackground(new Color(214,217,223));
        label1.setForeground(new Color(0,0,0));
        label1.setEnabled(true);
        label1.setFont(new Font("SansSerif",0,16));
        label1.setText("Registrasi Customer");
        label1.setVisible(true);

        label2 = new JLabel();
        label2.setBounds(70,80,90,35);
        label2.setBackground(new Color(214,217,223));
        label2.setForeground(new Color(0,0,0));
        label2.setEnabled(true);
        label2.setFont(new Font("sansserif",0,12));
        label2.setText("Nama     :");
        label2.setVisible(true);

        label3 = new JLabel();
        label3.setBounds(70,120,90,35);
        label3.setBackground(new Color(214,217,223));
        label3.setForeground(new Color(0,0,0));
        label3.setEnabled(true);
        label3.setFont(new Font("sansserif",0,12));
        label3.setText("Telp         :");
        label3.setVisible(true);

        label4 = new JLabel();
        label4.setBounds(70,160,90,35);
        label4.setBackground(new Color(214,217,223));
        label4.setForeground(new Color(0,0,0));
        label4.setEnabled(true);
        label4.setFont(new Font("sansserif",0,12));
        label4.setText("Email      :");
        label4.setVisible(true);

        label5 = new JLabel();
        label5.setBounds(70,200,90,35);
        label5.setBackground(new Color(214,217,223));
        label5.setForeground(new Color(0,0,0));
        label5.setEnabled(true);
        label5.setFont(new Font("sansserif",0,12));
        label5.setText("DoB         :");
        label5.setVisible(true);
        
        

        textfield1 = new JTextField();
        textfield1.setBounds(135,80,200,35);
        textfield1.setBackground(new Color(255,255,255));
        textfield1.setForeground(new Color(0,0,0));
        textfield1.setEnabled(true);
        textfield1.setFont(new Font("sansserif",0,12));
        textfield1.setText("Nama");
        textfield1.setVisible(true);
        selectOnFocus(textfield1);
        textfield1.addFocusListener(new FocusListener()
        {
            @Override
            public void focusGained(FocusEvent klik)
            {
                textfield1.setText("");
                textfield1.setForeground(new Color(0,0,153));
            }
            
            @Override
            public void focusLost(FocusEvent klik)
            {
                
            }
        });

        textfield2 = new JTextField();
        textfield2.setBounds(135,120,200,35);
        textfield2.setBackground(new Color(255,255,255));
        textfield2.setForeground(new Color(0,0,0));
        textfield2.setEnabled(true);
        textfield2.setFont(new Font("sansserif",0,12));
        textfield2.setText("08888888888");
        textfield2.setVisible(true);
        selectOnFocus(textfield2);
        textfield2.addFocusListener(new FocusListener()
        {
            @Override
            public void focusGained(FocusEvent klik)
            {
                textfield2.setText("");
                textfield2.setForeground(new Color(0,0,153));
            }
            
            @Override
            public void focusLost(FocusEvent klik)
            {
                
            }
        });

        textfield3 = new JTextField();
        textfield3.setBounds(135,160,200,35);
        textfield3.setBackground(new Color(255,255,255));
        textfield3.setForeground(new Color(0,0,0));
        textfield3.setEnabled(true);
        textfield3.setFont(new Font("sansserif",0,12));
        textfield3.setText("example@example.com");
        textfield3.setVisible(true);
        selectOnFocus(textfield3);
        textfield3.addFocusListener(new FocusListener()
        {
            @Override
            public void focusGained(FocusEvent klik)
            {
                textfield3.setText("");
                textfield3.setForeground(new Color(0,0,153));
            }
            
            @Override
            public void focusLost(FocusEvent klik)
            {
                
            }
        });

        textfield4 = new JTextField();
        textfield4.setBounds(135,200,200,35);
        textfield4.setBackground(new Color(255,255,255));
        textfield4.setForeground(new Color(0,0,0));
        textfield4.setEnabled(true);
        textfield4.setFont(new Font("sansserif",0,12));
        textfield4.setText("dd/mm/yyyy");
        textfield4.setVisible(true);
        selectOnFocus(textfield4);
        textfield4.addFocusListener(new FocusListener()
        {
            @Override
            public void focusGained(FocusEvent klik)
            {
                textfield4.setText("");
                textfield4.setForeground(new Color(0,0,153));
            }
            
            @Override
            public void focusLost(FocusEvent klik)
            {
                
            }
        });

        //adding components to contentPane panel
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
        this.setLocationRelativeTo(null);
        this.pack();
        this.setVisible(true);
        this.setResizable(false);
    }

    //method for generate menu
   public void generateMenu(){
        menuBar = new JMenuBar();

        JMenu file = new JMenu("File");
        JMenu tools = new JMenu("Tools");
        JMenu help = new JMenu("Help");

        JMenuItem open = new JMenuItem("Open   ");
        JMenuItem save = new JMenuItem("Save   ");
        JMenuItem exit = new JMenuItem("Exit   ");
        JMenuItem preferences = new JMenuItem("Preferences   ");
        JMenuItem about = new JMenuItem("About   ");


        file.add(open);
        file.add(save);
        file.addSeparator();
        file.add(exit);
        tools.add(preferences);
        help.add(about);

        menuBar.add(file);
        menuBar.add(tools);
        menuBar.add(help);
    }

    private void selectOnFocus(JTextField textComponent){
        textComponent.addFocusListener(new FocusAdapter(){
            public void focusGained(FocusEvent e){
                textComponent.selectAll();
            }
        });
    }
    

     public static void main(String[] args){
        System.setProperty("swing.defaultlaf", "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new RegistGUI();
            }
        });
    }
}