package com.gavindonnelly.g2d;

/**
 * Created by gavindonnelly on 16/09/2016.
 */

import java.awt.*;


/**
 * A base abstract class for G2D Objects
*/

public abstract class G2DObject {

    public abstract void draw(Graphics g);// draw the object in the given Graphics
    public abstract void translate(int dx, int dy);// move the object dx to the right, dy down
    public abstract void rotateAroundOrigin(int degrees);//rotate object by degrees around the origin clockwise


    private Color color=Color.BLACK;
    public void setColor(Color color){
        this.color = color;
    }
    public Color getColor(){
        return this.color;
    }

}