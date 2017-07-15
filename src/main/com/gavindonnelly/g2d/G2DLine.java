package com.gavindonnelly.g2d;
/**
 * Created by GavinDonnelly on 16/09/2016.
 */

import java.awt.*;


/**
 * A simple G2DLine object modelled as two G2DPoints
 *
 */
public class G2DLine extends G2DObject {

    G2DPoint start, end;

    public G2DLine(int x1, int y1, int x2, int y2){
        start = new G2DPoint(x1,y1);
        end = new G2DPoint(x2,y2);
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(getColor());
        g.drawLine(start.getPhysicalX(), start.getPhysicalY(), end.getPhysicalX(), end.getPhysicalY());
    }

    @Override
    public void translate(int dx, int dy) {
        start.translate(dx, dy);
        end.translate(dx, dy);
    }

    @Override
    public void rotateAroundOrigin(int degrees) {
        start.rotateAroundOrigin(degrees);
        end.rotateAroundOrigin(degrees);
    }

}
