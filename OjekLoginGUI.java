/**
*Text genereted by Simple GUI Extension for BlueJ
*/
import javax.swing.UIManager.LookAndFeelInfo;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.FocusAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import javax.swing.border.Border;
import javax.swing.*;


public class OjekLoginGUI extends JFrame {

 private JMenuBar menuBar;
 private JButton button1;
 private JButton button2;
 private JButton button3;
 private JLabel label1;
 private JLabel label2;
 private JLabel label3;
 private JTextField textfield1;
 private JTextField textfield2;

 //Constructor 
 public OjekLoginGUI(){

  this.setTitle("OjekloginGUI");
  this.setSize(400,300);
  //menu generate method
  generateMenu();
  this.setJMenuBar(menuBar);

  //pane with null layout
  JPanel contentPane = new JPanel(null);
  contentPane.setPreferredSize(new Dimension(400,300));
  contentPane.setBackground(new Color(192,192,192));


  button1 = new JButton();
  button1.setBounds(231,65,90,35);
  button1.setBackground(new Color(214,217,223));
  button1.setForeground(new Color(0,0,0));
  button1.setEnabled(true);
  button1.setFont(new Font("sansserif",0,12));
  button1.setText("Enter");
  button1.setVisible(true);
  button1.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
            if(
                !textfield2.getText().equals("")
            ){
                if(
                    !textfield2.getText().equals("No ID")
                ){
                    try {
                        if(DatabaseUser.getUserOjek(Integer.parseInt(textfield2.getText())) == null)
                            JOptionPane.showMessageDialog(null, "ID tidak ditemukan", "alert", JOptionPane.WARNING_MESSAGE);
                        else {
                            DatabaseUser.getUserOjek(Integer.parseInt(textfield2.getText()));
                            textfield1.setText(DatabaseUser.getUserOjek(Integer.parseInt(textfield2.getText())).getStatus().toString());
                        }
                    } catch(NumberFormatException exception){
                        JOptionPane.showMessageDialog(null, "ID berupa angka", "alert", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "ID harus diisi", "alert", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "ID tidak boleh kosong", "alert", JOptionPane.ERROR_MESSAGE);
            }
        }
    });
    
  button2 = new JButton();
  button2.setBounds(200,240,120,35);
  button2.setBackground(new Color(214,217,223));
  button2.setForeground(new Color(0,0,0));
  button2.setEnabled(true);
  button2.setFont(new Font("sansserif",0,12));
  button2.setText("Decline");
  button2.setVisible(true);
  button2.addActionListener(new ActionListener()
    {
        public void actionPerformed(ActionEvent klik)
        {
            button3.setEnabled(true);
            Administrasi.pesananDibatalkan(DatabaseUser.getUserOjek(Integer.parseInt(textfield2.getText())));
            textfield1.setText(DatabaseUser.getUserOjek(Integer.parseInt(textfield2.getText())).getStatus().toString());
            
        }
    });

  button3 = new JButton();
  button3.setBounds(80,240,120,35);
  button3.setBackground(new Color(214,217,223));
  button3.setForeground(new Color(0,0,0));
  button3.setEnabled(true);
  button3.setFont(new Font("sansserif",0,12));
  button3.setText("Accept");
  button3.setVisible(true);
  button3.addActionListener(new ActionListener()
    {
        public void actionPerformed(ActionEvent klik)
        {
            Administrasi.jalankanSistemPenugas();
            if(DatabaseUser.getUserOjek(Integer.parseInt(textfield2.getText())).getStatus() != StatusOjek.Idle){
                textfield1.setText(DatabaseUser.getUserOjek(Integer.parseInt(textfield2.getText())).getStatus().toString());
                button3.setEnabled(false);
            }
        }
    });
  
  label1 = new JLabel();
  label1.setBounds(130,25,170,31);
  label1.setBackground(new Color(214,217,223));
  label1.setForeground(new Color(0,0,0));
  label1.setEnabled(true);
  label1.setFont(new Font("SansSerif",0,16));
  label1.setText("Ojek Log-in");
  label1.setVisible(true);

  label2 = new JLabel();
  label2.setBounds(78,66,90,35);
  label2.setBackground(new Color(214,217,223));
  label2.setForeground(new Color(0,0,0));
  label2.setEnabled(true);
  label2.setFont(new Font("sansserif",0,12));
  label2.setText("ID          :");
  label2.setVisible(true);

  label3 = new JLabel();
  label3.setBounds(130,120,146,34);
  label3.setBackground(new Color(214,217,223));
  label3.setForeground(new Color(0,0,0));
  label3.setEnabled(true);
  label3.setFont(new Font("SansSerif",0,14));
  label3.setText("Informasi Pesanan");
  label3.setVisible(true);

  textfield1 = new JTextField();
  textfield1.setBounds(80,160,240,70);
  textfield1.setBackground(new Color(255,255,255));
  textfield1.setForeground(new Color(0,0,0));
  textfield1.setEnabled(true);
  textfield1.setFont(new Font("sansserif",0,12));
  textfield1.setText("Status");
  textfield1.setVisible(true);

  textfield2 = new JTextField();
  textfield2.setBounds(130,65,90,35);
  textfield2.setBackground(new Color(255,255,255));
  textfield2.setForeground(new Color(0,0,0));
  textfield2.setEnabled(true);
  textfield2.setFont(new Font("sansserif",0,12));
  textfield2.setText("No ID");
  textfield2.setVisible(true);
  selectOnFocus(textfield2);

  //adding components to contentPane panel
  contentPane.add(button1);
  contentPane.add(button2);
  contentPane.add(button3);
  contentPane.add(label1);
  contentPane.add(label2);
  contentPane.add(label3);
  contentPane.add(textfield1);
  contentPane.add(textfield2);

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
    new OjekLoginGUI();
   }
  });
 }

}