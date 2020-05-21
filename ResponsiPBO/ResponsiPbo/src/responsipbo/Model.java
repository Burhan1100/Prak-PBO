
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


public class Model {
    
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/tiketkereta";
    static final String USER = "root";
    static final String PASS = "";
    
    Connection koneksi;
    Statement statement;
    
    public Model(){
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
                data[jmlData][10] = resultSet.getString("Status");
                jmlData++;
            }
            return data;
               
        }catch(SQLException e){
            System.out.println(e.getMessage());
            System.out.println("SQL Error");
            return null;
        }
    }
    
    
    public void insertData(String IdPesanan,String IdPemesan, String IdKereta, String NoKursi, String Kelas, String Tgl, String Status, String Bayar){
        int jmlData=0;
        try {
           String query = "Select * from tiket WHERE IdPesanan=" + IdPesanan; 
           System.out.println(IdPesanan + " " + IdPemesan + " " + IdKereta + " " + NoKursi + " " + Kelas + " " + Tgl );
           ResultSet resultSet = statement.executeQuery(query);
           
           while (resultSet.next()){ 
                jmlData++;
            }
            
            if (jmlData==0) {
                query = "INSERT INTO tiket VALUES('"+IdPesanan+"','"+IdPemesan+"','"+IdKereta+"','"+NoKursi+"','"+ Kelas+"','"+Tgl+"', 'Belum Lunas',0)";
           
                statement = (Statement) koneksi.createStatement();
                statement.executeUpdate(query); //execute querynya
                System.out.println("Berhasil ditambahkan");
                JOptionPane.showMessageDialog(null, "Data Berhasil ditambahkan");
            }
            else {
                JOptionPane.showMessageDialog(null, "Data sudah ada");
            }
        } catch (Exception sql) {
            System.out.println(sql.getMessage());   
            JOptionPane.showMessageDialog(null, sql.getMessage());
        }
    }
    
    public void updatedata(String IdPesanan,String IdPemesan, String IdKereta, String NoKursi, String Kelas, String Tgl){
        int jmlData=0;
         try {
           String query = "Select * from Tiket WHERE IdPesanan=" + IdPesanan; 
           ResultSet resultSet = statement.executeQuery(query);
           
           while (resultSet.next()){ 
                jmlData++;
            }
           
             if (jmlData==1) {
                query = "UPDATE tiket SET IdPemesan='" + IdPemesan + "', IdKereta='" + IdKereta + "', NoKursi='" + NoKursi + "', Kelas='" + Kelas + "', Tgl='" + Tgl + "' WHERE IdPesanan=" + IdPesanan;
                statement = (Statement) koneksi.createStatement();
                statement.executeUpdate(query); //execute querynya
                System.out.println("Berhasil diupdate");
                JOptionPane.showMessageDialog(null, "Data Berhasil diupdate");
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
    
    public void deletedata (String IdPesanan) {
        try{
            String query = "DELETE FROM tiket WHERE IdPesanan = '"+IdPesanan+"'";
            statement = koneksi.createStatement();
            statement.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Berhasil Dihapus");
            
        }catch(SQLException sql) {
            System.out.println(sql.getMessage());
        }
    }
}


