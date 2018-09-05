/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bars.controller; 

import bars.model.Data;
import bars.model.Model;
import bars.view.View;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JButton;

/**
 *
 * @author Escinf
 */
public class Controller  extends MouseAdapter implements ActionListener, MouseListener, MouseMotionListener{

    Model model;
    View view;
    Point inicio=null;
    Point fin=null;
    int seleccionada=-1;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
        view.setModel(model);
        view.setController(this);
    }
    
// ActionListener
    @Override
    public void actionPerformed(ActionEvent e) {
        Data d = new Data (view.getColumna(),Integer.parseInt(view.getValor()),50,200);
        model.add(d);
    }

// MouseListener    
    @Override
    public void mousePressed(MouseEvent e) {
        inicio = e.getPoint();
        seleccionada = find(e.getPoint());
    }

    //@Override
    public void mouseClicked(MouseEvent e) {
        if (seleccionada!=-1){
            model.incrementar(seleccionada);
        }        
    }

//MouseMotionListener
    //@Override
    public void mouseDragged(MouseEvent e) {
        fin = e.getPoint();
        if(seleccionada !=-1){
            model.mover(seleccionada,fin.x-inicio.x, fin.y-inicio.y);
            inicio=fin;
        }
    }
    //@Override
    public void mouseMoved(MouseEvent e) {
    }

    
    public int find(Point p){
         Data d;
         for(int i=0; i<model.getSeries().size();i++){
             d= model.getSeries().get(i);
             Rectangle r = new Rectangle(d.getX(),d.getY()-d.getData(),50,d.getData());
             if (r.contains(p)){
                 return i;
             }
        }
         return -1;
    }

}



