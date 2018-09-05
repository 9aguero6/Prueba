/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bars.model;

/**
 *
 * @author Escinf
 */
public class Data {
    
    String label;
    int data;
    int x;
    int y;

    public Data(String label, int data, int x, int y) {
        this.label = label;
        this.data = data;
        this.x=x;
        this.y=y;
    }

    public String getLabel() {
        return label;
    }

    public int getData() {
        return data;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

}
