/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bars;

import bars.controller.Controller;
import bars.model.Model;
import bars.view.View;

/**
 *
 * @author Escinf
 */
public class Application {
    public static void main(String[] args) {
        Model model=new Model() ;
        View view = new View();
        Controller controller = new Controller(model,view);
        view.setVisible(true);

    }
}
