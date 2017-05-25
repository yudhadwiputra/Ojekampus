/**
*Text genereted by Simple GUI Extension for BlueJ
*/
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
import javax.swing.border.Border;
import javax.swing.*;


public class OjekGUI extends JFrame {

 private JMenuBar menuBar;
 private JButton button1;
 private JButton button2;
 private JLabel label1;

 //Constructor 
 public OjekGUI(){

  this.setTitle("OjekGUI");
  this.setSize(400,300);
  //menu generate method
  generateMenu();
  this.setJMenuBar(menuBar);

  //pane with null layout
  JPanel contentPane = new JPanel(null);
  contentPane.setPreferredSize(new Dimension(400,300));
  contentPane.setBackground(new Color(192,192,192));


  button1 = new JButton();
  button1.setBounds(134,115,125,30);
  button1.setBackground(new Color(214,217,223));
  button1.setForeground(new Color(0,0,0));
  button1.setEnabled(true);
  button1.setFont(new Font("SansSerif",0,16));
  button1.setText("Registrasi");
  button1.setVisible(true);
  button1.addMouseListener(new MouseAdapter() 
	{
		public void mouseClicked(MouseEvent klik) 
		{
			new RegistOjekGUI();
		}
	});

  button2 = new JButton();
  button2.setBounds(134,155,125,30);
  button2.setBackground(new Color(214,217,223));
  button2.setForeground(new Color(0,0,0));
  button2.setEnabled(true);
  button2.setFont(new Font("SansSerif",0,16));
  button2.setText("Log-in");
  button2.setVisible(true);
  button2.addMouseListener(new MouseAdapter() 
	{
		public void mouseClicked(MouseEvent klik) 
		{
			new OjekLoginGUI();
		}
	});

  label1 = new JLabel();
  label1.setBounds(165,55,112,35);
  label1.setBackground(new Color(214,217,223));
  label1.setForeground(new Color(0,0,0));
  label1.setEnabled(true);
  label1.setFont(new Font("SansSerif",0,24));
  label1.setText("Ojek");
  label1.setVisible(true);

  //adding components to contentPane panel
  contentPane.add(button1);
  contentPane.add(button2);
  contentPane.add(label1);

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



  public static void main(String[] args){
  System.setProperty("swing.defaultlaf", "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
  javax.swing.SwingUtilities.invokeLater(new Runnable() {
   public void run() {
    new OjekGUI();
   }
  });
 }

}