
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class Model {
    
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/bayarkos";
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
            
            String data[][] = new String[getBanyakData()][9]; //baris, kolom nya ada 
            
            String query = "SELECT b.Id, b.KodeK, b.NoPesanan, b. Tgl,b.Bulan,b. Bayar, p.Nama,(b.Bulan*k.harga)AS jumlah, (b.Bayar-(b.Bulan*k.harga))AS Sisa from databayar b,kos k, pemesan p WHERE  b.Id=p.Id AND b.KodeK=k.KodeK"; 
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()){
                data[jmlData][0] = resultSet.getString("Id"); //harus sesuai nama kolom di mysql
                data[jmlData][1] = resultSet.getString("NoPesanan");
                data[jmlData][2] = resultSet.getString("KodeK");
                data[jmlData][3] = resultSet.getString("Tgl");
                data[jmlData][4] = resultSet.getString("Bulan");
                data[jmlData][5] = resultSet.getString("Bayar");
                data[jmlData][6] = resultSet.getString("Nama");
                data[jmlData][7] = resultSet.getString("jumlah");
                data[jmlData][8] = resultSet.getString("Sisa");
                
                jmlData++;
            }
            return data;
               
        }catch(SQLException e){
            System.out.println(e.getMessage());
            System.out.println("SQL Error");
            return null;
        }
    }
    

    
    public void insertData(String Id,String NoPesanan, String KodeK, String Tgl, String Bulan, String Bayar){
        int jmlData=0;
        try {
           String query = "Select * from databayar WHERE NoPesanan=" + NoPesanan; 
           System.out.println(Id + " " + NoPesanan + " " + KodeK + " " + Tgl + " " + Bulan + " " + Bayar);
           ResultSet resultSet = statement.executeQuery(query);
           
           while (resultSet.next()){ 
                jmlData++;
            }
            
            if (jmlData==0) {
                query = "INSERT INTO databayar VALUES('"+Id+"','"+NoPesanan+"','"+KodeK+"','"+Tgl+"','"+Bulan+"','"+Bayar+"')";
           
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
    
    public void updatedata(String Id,String NoPesanan, String KodeK, String Tgl, String Bulan, String Bayar){
        int jmlData=0;
         try {
           String query = "Select * from databayar WHERE NoPesanan=" + NoPesanan; 
           ResultSet resultSet = statement.executeQuery(query);
           
           while (resultSet.next()){ 
                jmlData++;
            }
           
             if (jmlData==1) {
                query = "UPDATE databayar SET Id='" + Id + "', KodeK='" + KodeK + "', Tgl='" + Tgl + "', Bulan='" + Bulan + "', Bayar='" + Bayar + "' WHERE NoPesanan=" + NoPesanan;
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
            String query = "Select * from databayar";
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
    
    public void deletedata (String NoPesanan) {
        try{
            String query = "DELETE FROM databayar WHERE NoPesanan = '"+NoPesanan+"'";
            statement = koneksi.createStatement();
            statement.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Berhasil Dihapus");
            
        }catch(SQLException sql) {
            System.out.println(sql.getMessage());
        }
    }
}

