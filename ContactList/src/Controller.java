import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
import javax.swing.JTable;

public class Controller {

    Model Model1;
    View View1;
    
    public Controller(View View, Model Model) {
        this.Model1 = Model;
        this.View1 = View;
        
        if (Model1.getBanyakData()!=0) {
            String data11[][] = Model1.readdata();
            View1.tabel.setModel((new JTable(data11, View1.namaKolom)).getModel());
        }
        else {
            JOptionPane.showMessageDialog(null, "Data Tidak Ada");
        }
        
        View1.btnTambah.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String Id = View1.getId();
                String NoPesanan = View1.getNoPesanan();
                String KodeK = View1.getKodeK();
                String Tgl =View1.getTgl();
                String Bulan =View1.getBulan();
                String Bayar =View1.getBayar();
                Model1.insertData(Id, NoPesanan, KodeK, Tgl, Bulan, Bayar);
         
                String data11[][] = Model1.readdata();
                View1.tabel.setModel((new JTable(data11, View1.namaKolom)).getModel());
            }
        });
        
        View1.btnUpdate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String Id = View1.getId();
                String NoPesanan = View1.getNoPesanan();
                String KodeK = View1.getKodeK();
                String Tgl =View1.getTgl();
                String Bulan =View1.getBulan();
                String Bayar =View1.getBayar();;
                Model1.updatedata(Id, NoPesanan, KodeK, Tgl, Bulan, Bayar);
                
                String data11[][] = Model1.readdata();
                View1.tabel.setModel((new JTable(data11, View1.namaKolom)).getModel());
            }
        });
        
       
        View1.tabel.addMouseListener(new MouseAdapter() {
          
            public void mouseClicked(MouseEvent e) {
                super.mousePressed(e);
                int baris = View1.tabel.getSelectedRow();
                int kolom = View1.tabel.getSelectedColumn(); // ga kepake sekarang

                String dataterpilih = View1.tabel.getValueAt(baris, 1).toString();

                System.out.println(dataterpilih);

                int input = JOptionPane.showConfirmDialog(null,
                        "Apa anda ingin menghapus Data " + dataterpilih + "?", "Pilih Opsi...", JOptionPane.YES_NO_OPTION);

                if (input == 0) {
                    Model1.deletedata(dataterpilih);
                    String data11[][] = Model1.readdata();
                    View1.tabel.setModel(new JTable(data11, View1.namaKolom).getModel());
                } else {
                    JOptionPane.showMessageDialog(null, "Tidak Jadi Dihapus");
                }
            }
        }
        );
    }
}

