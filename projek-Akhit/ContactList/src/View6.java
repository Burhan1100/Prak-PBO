import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class View6  extends JFrame{
  
    JLabel lJudul = new JLabel("Data Kos");
    
    JTextField tfId = new JTextField();
    JTextField tfNama = new JTextField();
    JTextField tfAlamat = new JTextField();
    JTextField tfNoHp = new JTextField();
    
    JButton btnSimpan = new JButton("Tambah");
    JButton btnUbah = new JButton("Ubah");
    
    JTable tabel;
    DefaultTableModel dtm;
    JScrollPane scrollPane;
    Object namaKolom[] = {"KodeK", "NamaK", "AlamatK", "jenis","Harga"};

    public View6() {
        dtm = new DefaultTableModel(namaKolom, 0);
        tabel = new JTable(dtm);
        scrollPane = new JScrollPane(tabel);
        tabel.setBackground (Color.WHITE);
     


        setTitle("Data Kos");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
        setLayout(null);
        setSize(900,400);
        getContentPane().setBackground(Color.green);
        
        add(lJudul);
        lJudul.setBounds(50, 20, 200, 20);
        
        add(scrollPane);
        scrollPane.setBounds(20, 50, 480, 350);
        
    }
}
