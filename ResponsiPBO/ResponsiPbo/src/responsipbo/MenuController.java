/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package responsipbo;

/**
 *
 * @author Burhan
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuController {
   
MenuView mv;   
    public MenuController(MenuView menuView) {
        this.mv = menuView;
        
        menuView.btnPesan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                View View = new View();
                Model Model = new Model();
                Controller controller = new Controller(View, Model);
            }
        });
        
         menuView.btnBayar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                View6 View7 = new View6();
                Model6 Model7 = new Model6();
                Controller6 controller7 = new Controller6(View7, Model7);
            }
        });
        
        menuView.btnlihatpemesan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                View2 View4 = new View2();
                Model2 Model4 = new Model2();
                Controller2 controller4 = new Controller2(View4, Model4);
            }
        });
        
         menuView.btnInputPemesan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                View8 View9 = new View8();
                Model8 Model9 = new Model8();
                Controller8 controller9 = new Controller8(View9, Model9);
            }
        });
        
      menuView.btnlihatkereta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                View3 View5 = new View3();
                Model3 Model5 = new Model3();
                Controller3 controller5 = new Controller3(View5, Model5);
            }
        });  
    }
}
    


