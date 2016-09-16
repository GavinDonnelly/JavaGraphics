package com.gavindonnelly.g2d;

/**
 * Created by gavindonnelly on 16/09/2016.
 */
public class G2DRectangle extends G2DPolygon {

    public G2DRectangle(G2DPoint topLeft, G2DPoint bottomRight){
        this(topLeft.getLogicalX(), topLeft.getLogicalY(), bottomRight.getLogicalX(), bottomRight.getLogicalY());
    }
    public G2DRectangle(double x1, double y1, double x2, double y2){
        super();
        addPoint(x1,y1);
        addPoint(x1,y2);
        addPoint(x2,y2);
        addPoint(x2,y1);
    }

    //TODO "disinherit" the addPoint method to stop adding extra points to a rectangle

}
