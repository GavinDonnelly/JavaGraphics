package com.gavindonnelly.g2d;

import java.awt.Graphics;

/**
 * Created by GavinDonnelly on 16/09/2016.
 *
 * A simple G2DPoint object - used for both drawing points and
 * to define other objects (e.g. a line is two G2DPoints)
 *
*/
public class G2DPoint extends G2DObject {

    private double logiX, logiY;
    private static int physicalWidth=1280, physicalHeight=640;
    private static double logicalWidth=2560, logicalHeight=1280;
    private static int offsetX;
    private static int offsetY;
    private static double centerScale;
    private static double scaleX;
    private static double scaleY;

    public static void SetLogicalSize(double width, double height){
        logicalWidth=width;
        logicalHeight=height;
    }
    public static void setPhyiscalSize(int width, int height){
        physicalWidth = width;
        physicalHeight = height;
        scaleX = ((double)physicalWidth / logicalWidth);
        scaleY = ((double)physicalHeight / logicalHeight);
        centerScale = Math.min(scaleX,scaleY);
        offsetX = (int) ((width - logicalWidth*centerScale)/2);
        offsetY = (int) ((height - logicalHeight*centerScale)/2);

    }
    public static double GetLogicalWidth(){
        return logicalWidth;
    }
    public static double GetLogicalHeight(){
        return logicalHeight;
    }
    public static int GetPhysicalWidth(){
        return physicalWidth;
    }
    public static int GetPhysicalHeight(){
        return physicalHeight;
    }


    public G2DPoint(double x, double y){
        this.logiX = x;
        this.logiY = y;
    }

    public double getLogicalX() {
        return logiX;
    }
    public void setLogicalX(double x) {
        this.logiX = x;
    }
    public double getLogicalY() {
        return logiY;
    }
    public void setLogicalY(double y) {
        this.logiY = y;
    }

    public int getPhysicalX(){
        double scale = Math.min(scaleX, scaleY);
        return (int) Math.round(logiX *scale+offsetX);
    }
    public int getPhysicalY(){
        double scale = Math.min(scaleX, scaleY);
        return (int) Math.round(logiY *scale+offsetY);
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(getColor());
        g.drawLine(getPhysicalX(), getPhysicalY(), getPhysicalX(), getPhysicalY());
    }

    @Override
    public void translate(int dx, int dy) {
        this.logiX+=dx;
        this.logiY+=dy;
    }
    @Override
    public void rotateAroundOrigin(int degrees) {
        double rad = Math.toRadians(degrees);

        double newX = (logiX * Math.cos(rad) - logiY * Math.sin(rad)) ;//x cos degrees - y sin degrees
        double newY = (logiX * Math.sin(rad) + logiY * Math.cos(rad)) ;//x sin degrees + y cos degrees

        logiX = newX;
        logiY = newY;
    }

}

