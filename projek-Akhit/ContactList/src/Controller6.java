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
public class Controller6 {
    


    Model6 Model4;
    View6 View4;
    
    public Controller6(View6 View6, Model6 Model6) {
        this.Model4 = Model6;
        this.View4 = View6;
        
        if (Model4.getBanyakData()!=0) {
            String data11[][] = Model4.readata();
            View4.tabel.setModel((new JTable(data11, View4.namaKolom)).getModel());
        }
        else {
            JOptionPane.showMessageDialog(null, "Data Tidak Ada");
        }
    }
}

