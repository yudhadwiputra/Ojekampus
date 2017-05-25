import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import javax.swing.*;

public class SplashScreen extends JWindow {

    static boolean isRegistered;
    private static JProgressBar progressBar = new JProgressBar();
    private static SplashScreen execute;
    private static int count;
    private static Timer timer1;

    public SplashScreen() {

        Container container = getContentPane();
        container.setLayout(null);
        container.setBackground(new Color(25,0,240));
              
        JLabel label = new JLabel("Ojek Yudha's Project!",JLabel.CENTER);
        label.setFont(new Font("Verdana", Font.BOLD, 14));
        label.setBounds(45, 25, 280, 30);
        container.add(label);

        progressBar.setMaximum(50);
        progressBar.setBounds(55, 180, 250, 15);
        container.add(progressBar);
        loadProgressBar();
        setSize(370, 215);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void loadProgressBar() {
        ActionListener al = new ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                count++;
                progressBar.setValue(count);
                if (count == 50) {
                    new mainGUI();
                    execute.setVisible(false);//swapped this around with timer1.stop()
                    timer1.stop();
                }

            }
        };
        timer1 = new Timer(50, al);
        timer1.start();
    }

    public static void main(String[] args) {
        execute = new SplashScreen();
    }
};