import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class View2 extends JFrame{
    JLabel lId = new JLabel("ID Pemesan");
    JLabel lNama = new JLabel("Nama Pemesan");
    JLabel lAlamat = new JLabel("Alamat");
    JLabel lNoHp = new JLabel("Nomor Handphone");
    JLabel lJudul = new JLabel("Data Pemesan");
    
    JTextField tfId = new JTextField();
    JTextField tfNama = new JTextField();
    JTextField tfAlamat = new JTextField();
    JTextField tfNoHp = new JTextField();
    
    JButton btnSimpan = new JButton("Tambah");
    JButton btnUbah = new JButton("Ubah");
    
    JTable tabel;
    DefaultTableModel dtm;
    JScrollPane scrollPane;
    Object namaKolom[] = {"Id", "Nama", "Alamat", "NoHP"};

    public View2() {
        dtm = new DefaultTableModel(namaKolom, 0);
        tabel = new JTable(dtm);
        scrollPane = new JScrollPane(tabel);
        tabel.setBackground (Color.WHITE);
      

        
        setTitle("Input Pemesan Kos");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
        setLayout(null);
        setSize(900,400);
        getContentPane().setBackground(Color.green);
        
        add(lJudul);
        lJudul.setBounds(50, 20, 200, 20);
        
        add(scrollPane);
        scrollPane.setBounds(20, 50, 480, 350);
        
        add(lId);
        lId.setBounds(610, 23, 90, 20);
        add(tfId);
        tfId.setBounds(610, 40, 120, 20);
        
        add(lNama);
        lNama.setBounds(610, 60, 90, 20);
        add(tfNama);
        tfNama.setBounds(610, 80, 120, 20);
        
        add(lAlamat);
        lAlamat.setBounds(610, 100, 90, 20);
        add(tfAlamat);
        tfAlamat.setBounds(610, 120, 120, 20);
        
        add(lNoHp);
        lNoHp.setBounds(610, 140, 90, 20);
        add(tfNoHp);
        tfNoHp.setBounds(610, 160, 120, 20);
        
        add(btnUbah);
        btnUbah.setBounds(750, 270, 90, 20);  
        
        add(btnSimpan);
        btnSimpan.setBounds(610, 270, 90, 20);  
    }
    
    public String getId(){
        return tfId.getText();
    }
    public String getNama(){
        return tfNama.getText();
    }
    public String getAlamat(){
        return tfAlamat.getText();
    }
    
    public String getNoHp(){
        return tfNoHp.getText();
    }
}
