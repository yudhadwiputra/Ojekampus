import java.awt.*;
import javax.swing.*;
import javax.swing.table.*;
import javax.swing.event.*;
import java.awt.event.*;
import java.util.Arrays;
import java.sql.*;
/**
 * Write a description of class TabelPesanan here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DatabasePesananSQL extends JFrame
{
    // instance variables - replace the example below with your own
    JTable pesananTable;
    DefaultTableModel tableModel;
    String[] headerName = {"ID", "Nama", "LokasiAwal", "LokasiAkhir", "Ojek", "Biaya", "Status", "Time"};
    /**
     * Constructor for objects of class TabelPesanan
     */
    
    public class CustomTableModel extends DefaultTableModel{
        public boolean isCellEditable(int row, int column){  
          return false;  
      }

    }
    
    public DatabasePesananSQL()
    {
        // initialise instance variables
        this.setTitle("Table");
        this.setSize(500,400);
               
        tableModel = new CustomTableModel();
        tableModel.setColumnIdentifiers(headerName);
        
        pesananTable = new JTable(tableModel);
        //pesananTable.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        pesananTable.setFillsViewportHeight(true);

        this.add(new JScrollPane(pesananTable));
        addData();
        //Icon
        ImageIcon img = new ImageIcon("icon.png");
        this.setIconImage(img.getImage());
        
        this.setLocationRelativeTo(null);
        this.pack();
        this.setVisible(true);
    }
    
    public void addData(){
        try{
            //Driver
            Class.forName("com.mysql.jdbc.Driver");  
            //Open Conn
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ojekampus","root","");  
            //here cvoep is database name, root is username and password  
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select * from pesanan");        
            String[] temp = headerName;
            while(rs.next()){
                //set variable dari database
                int id = rs.getInt(1);
                String pelanggan = rs.getString(2);
                String lokasiawal = rs.getString(3);
                String lokasiakhir = rs.getString(4);
                String ojek = rs.getString(5);
                int biaya = rs.getInt(6);
                String status = rs.getString(7);
                String waktu = rs.getString(8);
                //table
                temp[0] = Integer.toString(id);
                temp[1] = pelanggan;
                temp[2] = lokasiawal;
                temp[3] = lokasiakhir;
                temp[4] = ojek;
                temp[5] = Integer.toString(biaya);
                temp[6] = status;
                temp[7] = waktu;
                tableModel.addRow(temp);
                //Arrays.fill(temp, null);
            }
            rs.close();
            stmt.close();
            con.close();
        } catch(Exception e){ System.out.println(e);}
    }
    
    public static void main(String[] args)
     {
        System.setProperty("swing.defaultlaf", "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        javax.swing.SwingUtilities.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new DatabasePesananSQL();
            }
        });
    }
}
