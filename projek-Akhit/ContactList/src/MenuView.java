
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MenuView extends JFrame{
    JButton btnLihat = new JButton("Bayar");
    JButton btnTambah = new JButton("Input Pemesan");
    JButton btnLihat2 = new JButton("Lihat Data Kos");
    // JLabel background = new JLabel();

    public MenuView() {
        setTitle("Bayar Kos");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(null);
        setSize(300,400);
        setBackground (Color.red);
        
        add(btnLihat);
        btnLihat.setBounds(60, 170, 150, 20);
        add(btnTambah);
        btnTambah.setBounds(60, 200, 150, 20);
        add(btnLihat2);
        btnLihat2.setBounds(60, 230, 150, 20);
    }
}
