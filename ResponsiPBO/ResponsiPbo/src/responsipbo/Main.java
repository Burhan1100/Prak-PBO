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
public class Main {
    
    public static void main(String[] args) {
        MenuView menuView = new MenuView();
        MenuController menuController = new MenuController(menuView);
    }
}