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


public class LoginGUI extends JFrame {

	private JMenuBar menuBar;
	private JButton button1;
	private JButton button2;
	private JLabel label1;

	//Constructor 
	public LoginGUI(){

		this.setTitle("LoginGUI");
		this.setSize(500,400);
		this.setJMenuBar(menuBar);

		//pane with null layout
		JPanel contentPane = new JPanel(null);
		contentPane.setPreferredSize(new Dimension(500,400));
		contentPane.setBackground(Color.YELLOW);

		button1 = new JButton();
		button1.setBounds(84,294,90,35);
		button1.setEnabled(true);
		button1.setText("Customer");
		button1.setVisible(true);

		button2 = new JButton();
		button2.setBounds(330,297,90,35);
		button2.setEnabled(true);
		button2.setText("Ojek");
		button2.setVisible(true);

		label1 = new JLabel();
		label1.setBounds(203,29,90,35);
		label1.setBackground(new Color(214,217,223));
		label1.setForeground(new Color(0,0,0));
		label1.setEnabled(true);
		label1.setFont(new Font("SansSerif",0,20));
		label1.setText("Login as");
		label1.setVisible(true);

		//adding components to contentPane panel
		contentPane.add(button1);
		contentPane.add(button2);
		contentPane.add(label1);

		//adding panel to JFrame and seting of window position and close operation
		this.add(contentPane);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.pack();
		this.setVisible(true);
	}
	
    public static void main(String[] args)
    {
         new LoginGUI();
    }
}