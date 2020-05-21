
package responsipbo;

/**
 *
 * @author Burhan
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class Model6 {
    
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/tiketkereta";
    static final String USER = "root";
    static final String PASS = "";
    
    Connection koneksi;
    Statement statement;
    
    public Model6(){
        try{
            Class.forName(JDBC_DRIVER);
            koneksi = (Connection) DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.println("Koneksi Berhasil");
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
            System.out.println("Koneksi Gagal");
        }
    }
    
    public String[][] readdata(){
        try{
            int jmlData = 0;
            
            String data[][] = new String[getBanyakData()][11]; //baris, kolom nya ada 
            
            String query = "SELECT t.IdPesanan,t.IdPemesan,t.IdKereta,p.NamaP,k.NamaKereta,k.Harga,k.Tujuan,t.NoKursi, t.Kelas,t.Tgl,t.Status from tiket t,kereta k , penumpang p WHERE  t.IdPemesan=p.IdPemesan AND t.IdKereta=k.IdKereta"; 
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()){
                data[jmlData][0] = resultSet.getString("IdPesanan"); //harus sesuai nama kolom di mysql
                data[jmlData][1] = resultSet.getString("IdPemesan");
                data[jmlData][2] = resultSet.getString("NamaP");
                data[jmlData][3] = resultSet.getString("IdKereta");                
                data[jmlData][4] = resultSet.getString("NamaKereta");
                data[jmlData][5] = resultSet.getString("Harga");
                data[jmlData][6] = resultSet.getString("Tujuan");
                data[jmlData][7] = resultSet.getString("NoKursi");
                data[jmlData][8] = resultSet.getString("Kelas");
                data[jmlData][9] = resultSet.getString("Tgl");
                data[jmlData][10] = resultSet.getString("status");
                jmlData++;
            }
            return data;
               
        }catch(SQLException e){
            System.out.println(e.getMessage());
            System.out.println("SQL Error");
            return null;
        }
    }
    
    public void updatedata(String IdPesanan,String Bayar){
        int jmlData=0;
         try {
           String query = "Select * from Tiket WHERE IdPesanan=" + IdPesanan; 
           ResultSet resultSet = statement.executeQuery(query);
           
           while (resultSet.next()){ 
                jmlData++;
            }
           
             if (jmlData==1) {
                query = "UPDATE tiket SET Bayar='" + Bayar + "', Status = 'Lunas' WHERE IdPesanan=" + IdPesanan ;
                statement = (Statement) koneksi.createStatement();
                statement.executeUpdate(query); //execute querynya
                System.out.println("Berhasil Dibayar");
                JOptionPane.showMessageDialog(null, "Data Berhasil DiBayar");
             }
             else {
                 JOptionPane.showMessageDialog(null, "Data Tidak Ada");
             }
           
        } catch (Exception sql) {
            System.out.println(sql.getMessage());   
            JOptionPane.showMessageDialog(null, sql.getMessage());
        }
    }
    
    public int getBanyakData(){
        int jmlData = 0;
        try{
            statement = koneksi.createStatement();
            String query = "Select * from tiket";
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()){ 
                jmlData++;
            }
            return jmlData;
            
        }catch(SQLException e){
            System.out.println(e.getMessage());
            System.out.println("SQL Error");
            return 0;
        }
    }
}
    


