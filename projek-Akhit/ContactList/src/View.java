
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;


public class View extends JFrame{
    JLabel lId = new JLabel("ID Pemesan");
    JLabel lNoPesanan = new JLabel("No Pesanan");
    JLabel lKodeK = new JLabel("No KodeK");
    JLabel lTgl = new JLabel("Tanggal");
    JLabel lBulan = new JLabel("Berapa Bulan");
    JLabel lBayar = new JLabel("Bayar");
    JLabel ljudul = new JLabel("Data Pembayaran Kos");
    JLabel ljudul1 = new JLabel("Input Pembayaran Kos");
    
    JTextField tfId = new JTextField();
    JTextField tfKodeK = new JTextField();
    JTextField tfNoPesanan = new JTextField();
    JTextField tfTgl = new JTextField();
    JTextField tfBulan = new JTextField();
    JTextField tfBayar = new JTextField();
    
    JButton btnTambah = new JButton("Bayar");
    JButton btnUpdate = new JButton("Update");
    
    JLabel lNama = new JLabel("Nama Pemesan");
    JLabel lId1 = new JLabel("ID Pemesan");
    JLabel lAlamat = new JLabel("Alamat");
    JLabel lNoHp = new JLabel("Nomor Handphone");
   
    
    JTextField tfNama = new JTextField();
    JTextField tfIdq = new JTextField();
    JTextField tfAlamat = new JTextField();
    JTextField tfNNoHp = new JTextField();
    
    JButton btnSimpan = new JButton("Tambah");
    
    JTable tabel;
    DefaultTableModel dtm;
    JScrollPane scrollPane;
    Object namaKolom[] = {"Id", "No Pesanan", "KodeK", "Tgl", "Bulan", "Bayar", "Nama", "Harga", "Sisa Uang"};

    public View() {
        dtm = new DefaultTableModel(namaKolom, 0);
        tabel = new JTable(dtm);
        scrollPane = new JScrollPane(tabel);
        tabel.setBackground (Color.WHITE);
  
        
        setTitle("Data Bayar Kos");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
        setLayout(null);
        setSize(900,400);
        getContentPane().setBackground(Color.green);
        
        add(ljudul);
        ljudul.setBounds(50, 20, 200, 20);
        
        add(scrollPane);
        scrollPane.setBounds(20, 50, 480, 350);
        
        add(ljudul1);
        ljudul1.setBounds(630, 8, 200, 20);
        
        add(lId);
        lId.setBounds(610, 23, 90, 20);
        add(tfId);
        tfId.setBounds(610, 40, 120, 20);
        
        add(lNoPesanan);
        lNoPesanan.setBounds(610, 60, 90, 20);
        add(tfNoPesanan);
        tfNoPesanan.setBounds(610, 80, 120, 20);
        
        add(lKodeK);
        lKodeK.setBounds(610, 100, 90, 20);
        add(tfKodeK);
        tfKodeK.setBounds(610, 120, 120, 20);
        
        add(lTgl);
        lTgl.setBounds(610, 140, 90, 20);
        add(tfTgl);
        tfTgl.setBounds(610, 160, 120, 20);
        
        add(lBulan);
        lBulan.setBounds(610, 180, 90, 20);
        add(tfBulan);
        tfBulan.setBounds(610, 200, 120, 20);
        
        add(lBayar);
        lBayar.setBounds(610, 220, 90, 20);
        add(tfBayar);
        tfBayar.setBounds(610, 240, 120, 20);
        
        add(btnTambah);
        btnTambah.setBounds(610, 270, 90, 20);
        
        add(btnUpdate);
        btnUpdate.setBounds(720, 270, 90, 20);
        
    }
    
    public String getId(){
        return tfId.getText();
    }
    public String getNoPesanan(){
        return tfNoPesanan.getText();
    }
    public String getKodeK(){
        return tfKodeK.getText();
    }
    
    public String getTgl(){
        return tfTgl.getText();
    }
    
    public String getBulan(){
        return tfBulan.getText();
    }
     public String getBayar(){
        return tfBayar.getText();
    }
    
}
