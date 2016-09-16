package com.gavindonnelly.g2d;

import java.awt.Graphics;
import java.awt.Polygon;
import java.util.ArrayList;

/**
 * Created by gavindonnelly on 16/09/2016.
 */

public class G2DPolygon extends G2DObject {

    private ArrayList<G2DPoint> vertices;

    public G2DPolygon(){
        vertices = new ArrayList<G2DPoint>();
    }


    public void addPoint(G2DPoint pt){
        vertices.add(pt);
    }
    public void addPoint(double x, double y){
        addPoint(new G2DPoint(x,y));
    }

    @Override
    public void draw(Graphics g) {
        Polygon awtPoly = new Polygon();

        for (G2DPoint pt:vertices)
            awtPoly.addPoint(pt.getPhysicalX(), pt.getPhysicalY());

        g.setColor(getColor());
        g.fillPolygon(awtPoly);
    }

    @Override
    public void translate(int dx, int dy) {
        for (G2DPoint pt:vertices)
            pt.translate(dx,dy);
    }


    @Override
    public void rotateAroundOrigin(int degrees) {
        for (G2DPoint pt:vertices)
            pt.rotateAroundOrigin(degrees);
    }

}

