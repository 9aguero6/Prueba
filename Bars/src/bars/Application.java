package bars;

import bars.controller.Controller;
import bars.model.Model;
import bars.view.View;

public class Application {
    public static void main(String[] args) {
        Model model=new Model() ;
        View view = new View();
        Controller controller = new Controller(model,view);
        view.setVisible(true);
        // Fin del main
    }
}
