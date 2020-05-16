import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
import javax.swing.JTable;
/**
 *
 * @author Burhan
 */
public class Controller2 {
    

    Model2 Model4;
    View2 View4;
    
    public Controller2(View2 View2, Model2 Model2) {
        this.Model4 = Model2;
        this.View4 = View2;
        
        if (Model4.getBanyakData()!=0) {
            String data11[][] = Model4.readata();
            View4.tabel.setModel((new JTable(data11, View4.namaKolom)).getModel());
        }
        else {
            JOptionPane.showMessageDialog(null, "Data Tidak Ada");
        }
        
        View4.btnSimpan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String Id = View4.getId();
                String Nama = View4.getNama();
                String Alamat = View4.getAlamat();
                String NoHp =View4.getNoHp();
                Model4.insertData(Id, Nama, Alamat, NoHp);
         
                String data11[][] = Model4.readata();
                View4.tabel.setModel((new JTable(data11, View4.namaKolom)).getModel());
            }
        });
        
        View4.btnUbah.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String Id = View4.getId();
                String Nama = View4.getNama();
                String Alamat = View4.getAlamat();
                String NoHp =View4.getNoHp();
               
                Model4.updatedata(Id, Nama, Alamat, NoHp);
                
                String data11[][] = Model4.readata();
                View4.tabel.setModel((new JTable(data11, View4.namaKolom)).getModel());
            }
        });
        
       
        View4.tabel.addMouseListener(new MouseAdapter() {
          
            public void mouseClicked(MouseEvent e) {
                super.mousePressed(e);
                int baris = View4.tabel.getSelectedRow();
                int kolom = View4.tabel.getSelectedColumn(); // ga kepake sekarang

                String dataterpilih = View4.tabel.getValueAt(baris, 0).toString();

                System.out.println(dataterpilih);

                int input = JOptionPane.showConfirmDialog(null,
                        "Apa anda ingin menghapus Data " + dataterpilih + "?", "Pilih Opsi...", JOptionPane.YES_NO_OPTION);

                if (input == 0) {
                    Model4.deletedata(dataterpilih);
                    String data11[][] = Model4.readata();
                    View4.tabel.setModel(new JTable(data11, View4.namaKolom).getModel());
                } else {
                    JOptionPane.showMessageDialog(null, "Tidak Jadi Dihapus");
                }
            }
        }
        );
    }
}

