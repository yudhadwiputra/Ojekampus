/**
*Text genereted by Simple GUI Extension for BlueJ
*/
import javax.swing.UIManager.LookAndFeelInfo;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.FocusListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import javax.swing.border.Border;
import javax.swing.*;
import java.sql.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.AbstractDocument;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;



public class PemesananGUI extends JFrame {

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
 private JTextField textfield13;
 private JTextField textfield14;
 private JTextField textfield2;
 private JTextField textfield5;
 private JTextField textfield6;
 private JTextField textfield7;
 private JTextField textfield8;
 private JTextField textfield9;
 private static JFrame pesan = new JFrame();

 //Constructor 
 public PemesananGUI(){

  this.setTitle("PemesananGUI");
  this.setSize(400,400);
  //menu generate method
  generateMenu();
  this.setJMenuBar(menuBar);

  //pane with null layout
  JPanel contentPane = new JPanel(null);
  contentPane.setPreferredSize(new Dimension(400,400));
  contentPane.setBackground(new Color(192,192,192));
  
  button1 = new JButton();
  button1.setBounds(300,350,90,35);
  button1.setBackground(new Color(214,217,223));
  button1.setForeground(new Color(0,0,0));
  button1.setEnabled(true);
  button1.setFont(new Font("sansserif",0,12));
  button1.setText("Pesan");
  button1.setVisible(true);
  button1.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
            if(
                !textfield1.getText().equals("") &&
                !textfield7.getText().equals("") &&
                !textfield8.getText().equals("") &&
                !textfield9.getText().equals("") &&
                !textfield10.getText().equals("") &&
                !textfield11.getText().equals("") &&
                !textfield12.getText().equals("") &&
                !textfield13.getText().equals("") &&
                !textfield14.getText().equals("") &&
                !textfield2.getText().equals("") &&
                !textfield5.getText().equals("") &&
                !textfield6.getText().equals("")
            ){
                if(
                    !textfield1.getText().equals("Id") &&
                    !textfield7.getText().equals("X") &&
                    !textfield8.getText().equals("Y") &&
                    !textfield9.getText().equals("Nama Lokasi") &&
                    !textfield10.getText().equals("Keterangan") &&
                    !textfield11.getText().equals("X") &&
                    !textfield12.getText().equals("Y") &&
                    !textfield13.getText().equals("Nama Lokasi") &&
                    !textfield14.getText().equals("Keterangan") &&
                    !textfield2.getText().equals("Nama Pengguna Awal") &&
                    !textfield5.getText().equals("Nama Pengguna Akhir") &&
                    !textfield6.getText().equals("Biaya")
                ){
                    try {
                        //Driver
                        Class.forName("com.mysql.jdbc.Driver");  
                        //Open Conn
                        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ojekampus","root","");  
                        Statement stmt=con.createStatement();
                        
                        DatabasePesanan.addPesanan(
                        new Pesanan(DatabaseUser.getUserPelanggan(Integer.parseInt(textfield1.getText())), (TipeLayanan)combobox1.getSelectedItem(), 
                        new Lokasi(textfield9.getText(),Integer.parseInt(textfield7.getText()), Integer.parseInt(textfield8.getText()), textfield10.getText()), 
                        new Lokasi(textfield13.getText(), Integer.parseInt(textfield11.getText()), Integer.parseInt(textfield12.getText()), textfield14.getText()), 
                        textfield2.getText(), textfield5.getText(), Integer.parseInt(textfield6.getText())));
                        Administrasi.printPesananDatabase();
                        Administrasi.jalankanSistemPenugas();
                        
                        String pelanggan = DatabaseUser.getUserPelanggan(Integer.parseInt(textfield1.getText())).getNama();
                        String ojek = DatabasePesanan.getPesanan(DatabaseUser.getUserPelanggan(Integer.parseInt(textfield1.getText()))).getPelayan().getNama();
                        String status = DatabasePesanan.getPesanan(DatabaseUser.getUserPelanggan(Integer.parseInt(textfield1.getText()))).getFinalStatus();
                        stmt.executeUpdate("INSERT INTO pesanan (pelanggan,lokasiawal,lokasiakhir,ojek,biaya,status) VALUES ('"+pelanggan+"','"+textfield9.getText()+"','"+textfield13.getText()+"','"+ojek+"','"+Integer.parseInt(textfield6.getText())+"','"+status+"')");
                        
                        stmt.close();
                        con.close();
                        
                    } catch(PesananSudahAdaException | NumberFormatException exception) {
                        JOptionPane.showMessageDialog(null, exception.getMessage(), "alert", JOptionPane.ERROR_MESSAGE);
                    }
                    catch(Exception ex){
                        System.out.println(ex);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Input harus diisi dengan benar!", "alert", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Input tidak boleh kosong", "alert", JOptionPane.ERROR_MESSAGE);
            }
        }
    });
   /* 
  button1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent klik)
            {
                
                try
                {
                    Lokasi lokasi1 = new Lokasi(textfield9.getText(),Integer.parseInt(textfield7.getText()), Integer.parseInt(textfield8.getText()), textfield10.getText());
                    Lokasi lokasi2 = new Lokasi(textfield13.getText(),Integer.parseInt(textfield11.getText()),Integer.parseInt(textfield12.getText()), textfield14.getText());
                    DatabasePesanan.addPesanan(new Pesanan(DatabaseUser.getUserPelanggan(Integer.parseInt(textfield1.getText())),
                    (TipeLayanan)combobox1.getSelectedItem(), lokasi1 ,lokasi2 , textfield2.getText(), 
                    textfield5.getText(), Integer.parseInt(textfield6.getText())));
                    Administrasi.printPesananDatabase();
                }
                catch(Exception e)
                {
                   JOptionPane.showMessageDialog(pesan, e.getMessage(), "Pesan", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        */

  button2 = new JButton();
  button2.setBounds(300,50,90,35);
  button2.setBackground(new Color(214,217,223));
  button2.setForeground(new Color(0,0,0));
  button2.setEnabled(true);
  button2.setFont(new Font("sansserif",0,12));
  button2.setText("Enter");
  button2.setVisible(true);
  button2.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
            if(
                !textfield1.getText().equals("")
            ){
                if(
                    !textfield1.getText().equals("Id")
                ){
                    try {
                        if(DatabaseUser.getUserPelanggan(Integer.parseInt(textfield1.getText())) == null)
                            JOptionPane.showMessageDialog(null, "ID tidak ditemukan", "alert", JOptionPane.WARNING_MESSAGE);
                        else
                            JOptionPane.showMessageDialog(null, "ID ditemukan", "alert", JOptionPane.INFORMATION_MESSAGE);
                    } catch(NumberFormatException exception){
                        JOptionPane.showMessageDialog(null, "ID merupakan angka", "alert", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "ID harus diisi", "alert", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "ID tidak boleh kosong", "alert", JOptionPane.ERROR_MESSAGE);
            }
        }
    });     

  combobox1 = new JComboBox();
  combobox1.setModel(new DefaultComboBoxModel<>(TipeLayanan.values()));
  combobox1.setBounds(100,100,150,35);
  combobox1.setBackground(new Color(214,217,223));
  combobox1.setForeground(new Color(0,0,0));
  combobox1.setEnabled(true);
  combobox1.setFont(new Font("SansSerif",0,12));
  combobox1.setVisible(true);

  label1 = new JLabel();
  label1.setBounds(50,20,160,16);
  label1.setBackground(new Color(214,217,223));
  label1.setForeground(new Color(0,0,0));
  label1.setEnabled(true);
  label1.setFont(new Font("SansSerif",0,16));
  label1.setText("Pemesanan Customer");
  label1.setVisible(true);

  label2 = new JLabel();
  label2.setBounds(10,50,90,35);
  label2.setBackground(new Color(214,217,223));
  label2.setForeground(new Color(0,0,0));
  label2.setEnabled(true);
  label2.setFont(new Font("sansserif",0,12));
  label2.setText("ID    :");
  label2.setVisible(true);

  label3 = new JLabel();
  label3.setBounds(10,100,100,35);
  label3.setBackground(new Color(214,217,223));
  label3.setForeground(new Color(0,0,0));
  label3.setEnabled(true);
  label3.setFont(new Font("sansserif",0,12));
  label3.setText("Tipe Layanan :    ");
  label3.setVisible(true);

  label4 = new JLabel();
  label4.setBounds(10,150,90,35);
  label4.setBackground(new Color(214,217,223));
  label4.setForeground(new Color(0,0,0));
  label4.setEnabled(true);
  label4.setFont(new Font("sansserif",0,12));
  label4.setText("Lokasi awal    :");
  label4.setVisible(true);

  label5 = new JLabel();
  label5.setBounds(10,200,90,35);
  label5.setBackground(new Color(214,217,223));
  label5.setForeground(new Color(0,0,0));
  label5.setEnabled(true);
  label5.setFont(new Font("sansserif",0,12));
  label5.setText("Lokasi akhir     :");
  label5.setVisible(true);

  label6 = new JLabel();
  label6.setBounds(10,250,90,35);
  label6.setBackground(new Color(214,217,223));
  label6.setForeground(new Color(0,0,0));
  label6.setEnabled(true);
  label6.setFont(new Font("sansserif",0,12));
  label6.setText("NP Awal");
  label6.setVisible(true);

  label7 = new JLabel();
  label7.setBounds(10,300,90,35);
  label7.setBackground(new Color(214,217,223));
  label7.setForeground(new Color(0,0,0));
  label7.setEnabled(true);
  label7.setFont(new Font("sansserif",0,12));
  label7.setText("NP Akhir");
  label7.setVisible(true);

  label8 = new JLabel();
  label8.setBounds(10,350,90,35);
  label8.setBackground(new Color(214,217,223));
  label8.setForeground(new Color(0,0,0));
  label8.setEnabled(true);
  label8.setFont(new Font("sansserif",0,12));
  label8.setText("Biaya");
  label8.setVisible(true);

  textfield1 = new JTextField();
  textfield1.setBounds(100,50,150,35);
  textfield1.setBackground(new Color(255,255,255));
  textfield1.setForeground(new Color(0,0,0));
  textfield1.setEnabled(true);
  textfield1.setFont(new Font("sansserif",0,12));
  textfield1.setText("Id");
  textfield1.setVisible(true);
  selectOnFocus(textfield1);

  textfield10 = new JTextField();
  textfield10.setBounds(300,150,90,35);
  textfield10.setBackground(new Color(255,255,255));
  textfield10.setForeground(new Color(0,0,0));
  textfield10.setEnabled(true);
  textfield10.setFont(new Font("sansserif",0,12));
  textfield10.setText("Keterangan");
  textfield10.setVisible(true);
  selectOnFocus(textfield10);

  textfield11 = new JTextField();
  textfield11.setBounds(100,200,35,35);
  textfield11.setBackground(new Color(255,255,255));
  textfield11.setForeground(new Color(0,0,0));
  textfield11.setEnabled(true);
  textfield11.setFont(new Font("sansserif",0,12));
  textfield11.setText("X");
  textfield11.setVisible(true);
  selectOnFocus(textfield11);

  textfield12 = new JTextField();
  textfield12.setBounds(150,200,35,35);
  textfield12.setBackground(new Color(255,255,255));
  textfield12.setForeground(new Color(0,0,0));
  textfield12.setEnabled(true);
  textfield12.setFont(new Font("sansserif",0,12));
  textfield12.setText("Y");
  textfield12.setVisible(true);
  selectOnFocus(textfield12);

  textfield13 = new JTextField();
  textfield13.setBounds(200,200,90,35);
  textfield13.setBackground(new Color(255,255,255));
  textfield13.setForeground(new Color(0,0,0));
  textfield13.setEnabled(true);
  textfield13.setFont(new Font("sansserif",0,12));
  textfield13.setText("Nama Lokasi");
  textfield13.setVisible(true);
  selectOnFocus(textfield13);

  textfield14 = new JTextField();
  textfield14.setBounds(300,200,90,35);
  textfield14.setBackground(new Color(255,255,255));
  textfield14.setForeground(new Color(0,0,0));
  textfield14.setEnabled(true);
  textfield14.setFont(new Font("sansserif",0,12));
  textfield14.setText("Keterangan");
  textfield14.setVisible(true);
  selectOnFocus(textfield14);

  textfield2 = new JTextField();
  textfield2.setBounds(100,250,150,35);
  textfield2.setBackground(new Color(255,255,255));
  textfield2.setForeground(new Color(0,0,0));
  textfield2.setEnabled(true);
  textfield2.setFont(new Font("sansserif",0,12));
  textfield2.setText("Nama Pengguna Awal");
  textfield2.setVisible(true);
  selectOnFocus(textfield2);

  textfield5 = new JTextField();
  textfield5.setBounds(100,300,150,35);
  textfield5.setBackground(new Color(255,255,255));
  textfield5.setForeground(new Color(0,0,0));
  textfield5.setEnabled(true);
  textfield5.setFont(new Font("sansserif",0,12));
  textfield5.setText("Nama Pengguna Akhir");
  textfield5.setVisible(true);
  selectOnFocus(textfield5);

  textfield6 = new JTextField();
  textfield6.setBounds(100,350,150,35);
  textfield6.setBackground(new Color(255,255,255));
  textfield6.setForeground(new Color(0,0,0));
  textfield6.setEnabled(true);
  textfield6.setFont(new Font("sansserif",0,12));
  textfield6.setText("Biaya");
  textfield6.setVisible(true);
  selectOnFocus(textfield6);

  textfield7 = new JTextField();
  textfield7.setBounds(100,150,35,35);
  textfield7.setBackground(new Color(255,255,255));
  textfield7.setForeground(new Color(0,0,0));
  textfield7.setEnabled(true);
  textfield7.setFont(new Font("sansserif",0,12));
  textfield7.setText("X");
  textfield7.setVisible(true);
  selectOnFocus(textfield7);

  textfield8 = new JTextField();
  textfield8.setBounds(150,150,35,35);
  textfield8.setBackground(new Color(255,255,255));
  textfield8.setForeground(new Color(0,0,0));
  textfield8.setEnabled(true);
  textfield8.setFont(new Font("sansserif",0,12));
  textfield8.setText("Y");
  textfield8.setVisible(true);
  selectOnFocus(textfield8);

  textfield9 = new JTextField();
  textfield9.setBounds(200,150,90,35);
  textfield9.setBackground(new Color(255,255,255));
  textfield9.setForeground(new Color(0,0,0));
  textfield9.setEnabled(true);
  textfield9.setFont(new Font("sansserif",0,12));
  textfield9.setText("Nama Lokasi");
  textfield9.setVisible(true);
  selectOnFocus(textfield9);

  //adding components to contentPane panel
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
  contentPane.add(textfield13);
  contentPane.add(textfield14);
  contentPane.add(textfield2);
  contentPane.add(textfield5);
  contentPane.add(textfield6);
  contentPane.add(textfield7);
  contentPane.add(textfield8);
  contentPane.add(textfield9);

  //adding panel to JFrame and seting of window position and close operation
  this.add(contentPane);
  this.setLocationRelativeTo(null);
  this.pack();
  this.setVisible(true);
  this.setResizable(false);
  
  DocumentListener documentListener = new DocumentListener() {

            @Override
            public void removeUpdate(DocumentEvent e) {
                performBiayaCalculation(null);
            }

            @Override
            public void insertUpdate(DocumentEvent e) {
                performBiayaCalculation(null);
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
            }
        };

        DocumentFilter numericFilter = new DocumentFilter(){

            @Override
            public void insertString(FilterBypass fb, int offset,
                    String string, AttributeSet attr)
                    throws BadLocationException {
                fb.insertString(offset, string.replaceAll("[^\\d]", ""), attr);
            }

            @Override
            public void replace(FilterBypass fb, int offset, int length,
                    String text, AttributeSet attrs)
                    throws BadLocationException {

                fb.replace(offset, length, text.replaceAll("[^\\d]", ""), attrs);
            }
        };

        ((AbstractDocument) textfield7.getDocument()).setDocumentFilter(numericFilter);
        ((AbstractDocument) textfield8.getDocument()).setDocumentFilter(numericFilter);
        ((AbstractDocument) textfield11.getDocument()).setDocumentFilter(numericFilter);
        ((AbstractDocument) textfield12.getDocument()).setDocumentFilter(numericFilter);

        textfield7.getDocument().addDocumentListener(documentListener);
        textfield8.getDocument().addDocumentListener(documentListener);
        textfield11.getDocument().addDocumentListener(documentListener);
        textfield12.getDocument().addDocumentListener(documentListener);
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

private void performBiayaCalculation(java.awt.event.ActionEvent evt) {
        int xtotal = 0;
        int ytotal = 0;
        int biaya = 0;
        double jarak = 0;
        if(textfield7.getText().trim().length() > 0){
            try{
                xtotal -= Integer.parseInt(textfield7.getText());
            }catch(NumberFormatException nbx){
            }
        }

        if(textfield8.getText().trim().length() > 0){
            try{
                ytotal -= Integer.parseInt(textfield8.getText());
            }catch(NumberFormatException nbx){
            }
        }

        if(textfield11.getText().trim().length() > 0){
            try{
                xtotal += Integer.parseInt(textfield11.getText());
            }catch(NumberFormatException nbx){
            }
        }
        
        if(textfield12.getText().trim().length() > 0){
            try{
                ytotal += Integer.parseInt(textfield12.getText());
            }catch(NumberFormatException nbx){
            }
        }
        jarak = Math.sqrt(Math.abs(xtotal*xtotal)+Math.abs(ytotal*ytotal));
        biaya = (int)jarak*500;
        if(biaya<0)biaya=0;
        textfield6.setText(""+biaya);
 }
 
  public static void main(String[] args){
  System.setProperty("swing.defaultlaf", "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
  javax.swing.SwingUtilities.invokeLater(new Runnable() {
   public void run() {
    new PemesananGUI();
   }
  });
 }

}