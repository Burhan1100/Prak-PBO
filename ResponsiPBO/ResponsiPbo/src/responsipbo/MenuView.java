
package responsipbo;

/**
 *
 * @author Burhan
 */

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MenuView extends JFrame{
    JLabel lJudul = new JLabel("Pesan Tiket Kereta Cabang Jogja");
    JButton btnPesan = new JButton("Pesan Tiket");
    JButton btnInputPemesan = new JButton("Tambah Pemesan");
    JButton btnBayar = new JButton("Bayar Tiket");
    JButton btnlihatpemesan = new JButton("Lihat Data Pemesan");
    JButton btnlihatkereta = new JButton("Lihat Data Kereta");
    // JLabel background = new JLabel();

    public MenuView() {
        setTitle("Menu Utama Pembayaran Tiket kereta");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(null);
        setSize(300,400);
        setBackground (Color.red);
        
        add(lJudul);
        lJudul.setBounds(60, 50, 800, 20);
        add(btnPesan);
        btnPesan.setBounds(60, 170, 150, 20);
        add(btnInputPemesan);
        btnInputPemesan.setBounds(60, 200, 150, 20);
        add(btnlihatpemesan);
        btnlihatpemesan.setBounds(60, 230, 150, 20);
        add(btnlihatkereta);
        btnlihatkereta.setBounds(60, 260, 150, 20);
        add(btnBayar);
        btnBayar.setBounds(60, 290, 150, 20);
      
        
    }
}
