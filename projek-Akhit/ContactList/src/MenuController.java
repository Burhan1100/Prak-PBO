
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuController {
    
  MenuView mv;
    //JFrame frame = new JFrame();

    public MenuController(MenuView menuView) {
        this.mv = menuView;
        
        menuView.btnLihat.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                View View = new View();
                Model Model = new Model();
                Controller controller = new Controller(View, Model);
            }
        });
        menuView.btnTambah.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                View2 View4 = new View2();
                Model2 Model4 = new Model2();
                Controller2 controller4 = new Controller2(View4, Model4);
            }
        });
        
        menuView.btnLihat2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                View6 View4 = new View6();
                Model6 Model4 = new Model6();
                Controller6 controller4 = new Controller6(View4, Model4);
            }
        });
    }
    
}
