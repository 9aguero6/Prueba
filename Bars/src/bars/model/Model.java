/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bars.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

/**
 *
 * @author Escinf
 */
public class Model extends Observable{
    
    List<Data> series;

    public Model() {
        series = new ArrayList<Data>();
    }

    public List<Data> getSeries() {
        return series;
    }
    
    public Model add(Data d){
        series.add(d);
        this.setChanged();
        this.notifyObservers(null); // parametro no usado por ahora                       
        return this;
    }
    
    @Override
    public void addObserver(java.util.Observer o) {
        super.addObserver(o);
        setChanged();
        notifyObservers(null); // parametro no usado por ahora
    }

    public void incrementar(int pos){
        this.series.get(pos).data+=10;
        setChanged();
        notifyObservers(null); // parametro no usado por ahora        
    }

    public void mover(int seleccionada, int dX, int dY){
        Data sel = this.series.get(seleccionada);
        sel.x+=dX;
        sel.y+=dY;
        setChanged();
        notifyObservers(null); // parametro no usado por ahora         
    }
}









