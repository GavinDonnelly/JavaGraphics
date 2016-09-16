package com.gavindonnelly.g2d;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyListener;
import java.util.ArrayList;

/**
 * Created by gavindonnelly on 16/09/2016.
 *
 * * A simple extension of canvas to allow us to do our drawing
 * This version after the first programming lecture on 4/10/13
 * Simply draws a G2DPoint and two G2DLines into the canvas
 *
 * Commented out code is the version using only calls to the native
 * awt classes - but this approach doesn't give us objects to handle
 *
 */
public class BritishFlag extends Canvas {

    private static final long serialVersionUID = 1L;//good idea for serialisation compatability

    private ArrayList<G2DObject> ukFlag = new ArrayList<G2DObject>();



    public BritishFlag(KeyListener callerFrame){
        this.addKeyListener(callerFrame);//allows for closing after clicking on canvas and gaining focus



        //create the white background for flag
        G2DRectangle back = new G2DRectangle(0,0,2560,1280);
        back.setColor(new Color(0xFFFFFF));

        //create horizontal and vertical red stripes(red colour
        //from wikipedia page on Union Jack < http://en.wikipedia.org/wiki/Union_Jack >
        G2DRectangle horizonal = new G2DRectangle(0,512,2560,767);
        horizonal.setColor(new Color(0xCC0000));
        G2DRectangle vertical = new G2DRectangle(1152,0,1407,1280);
        vertical.setColor(new Color(0xCC0000));

        //This creates 4 blue rectangles which white and red polygons
        //will then be added over to create the strip through them
        //(again, blue colour from wikipedia page on Union Jack
        //< http://en.wikipedia.org/wiki/Union_Jack >
        G2DRectangle b1 = new G2DRectangle(0,0,1067,426);
        b1.setColor(new Color(0x003399));

        G2DRectangle b2 = new G2DRectangle(1491,426,2560,0);
        b2.setColor(new Color(0x003399));

        G2DRectangle b3 = new G2DRectangle(0,853,1066,1280);
        b3.setColor(new Color(0x003399));

        G2DRectangle b4 = new G2DRectangle(2560,853,1492,1280);
        b4.setColor(new Color(0x003399));

        //Creates 4 white polygons to create the diagonal stripe
        // through the blue rectangles
        G2DPolygon w1 = new G2DPolygon();
        w1.addPoint(0,143);
        w1.addPoint(0,0);
        w1.addPoint(285,0);
        w1.addPoint(1066,390);
        w1.addPoint(1070,426);
        w1.addPoint(565,426);
        w1.setColor(Color.WHITE);

        G2DPolygon w2 = new G2DPolygon();
        w2.addPoint(2560,143);
        w2.addPoint(2560,0);
        w2.addPoint(2275,0);
        w2.addPoint(1490,390);
        w2.addPoint(1490,426);
        w2.addPoint(1995,426);
        w2.setColor(Color.WHITE);

        G2DPolygon w3 = new G2DPolygon();
        w3.addPoint(0,1137);
        w3.addPoint(0,1280);
        w3.addPoint(290,1280);
        w3.addPoint(1066,889);
        w3.addPoint(1066,853);
        w3.addPoint(567,853);
        w3.setColor(Color.WHITE);

        G2DPolygon w4 = new G2DPolygon();
        w4.addPoint(2560,1137);
        w4.addPoint(2560,1280);
        w4.addPoint(2272,1280);
        w4.addPoint(1490,889);
        w4.addPoint(1490,852);
        w4.addPoint(1990,852);
        w4.setColor(Color.WHITE);

        //Creates 4 red polygons to create the thin diagonal stripe
        // through the blue rectangles and white polygons, colour
        //the same as horizontal and vertical stripes
        G2DPolygon r1 = new G2DPolygon();
        r1.addPoint(0,0);
        r1.addPoint(0,95);
        r1.addPoint(661,426);
        r1.addPoint(850,426);
        r1.setColor(new Color(0xCC0000));

        G2DPolygon r2 = new G2DPolygon();
        r2.addPoint(2560,0);
        r2.addPoint(2370,0);
        r2.addPoint(1516,426);
        r2.addPoint(1700,426);
        r2.setColor(new Color(0xCC0000));

        G2DPolygon r3 = new G2DPolygon();
        r3.addPoint(0,1280);
        r3.addPoint(190,1280);
        r3.addPoint(1043,853);
        r3.addPoint(852,853);
        r3.setColor(new Color(0xCC0000));

        G2DPolygon r4 = new G2DPolygon();
        r4.addPoint(2560,1280);
        r4.addPoint(1706,853);
        r4.addPoint(1897,853);
        r4.addPoint(2560,1185);
        r4.setColor(new Color(0xCC0000));

        //adds all the elements created to the scence
        ukFlag.add(back);

        ukFlag.add(horizonal);
        ukFlag.add(vertical);

        ukFlag.add(b1);
        ukFlag.add(b2);
        ukFlag.add(b3);
        ukFlag.add(b4);

        ukFlag.add(w1);
        ukFlag.add(w2);
        ukFlag.add(w3);
        ukFlag.add(w4);

        ukFlag.add(r1);
        ukFlag.add(r2);
        ukFlag.add(r3);
        ukFlag.add(r4);


    }

    public void paint(Graphics g){
        G2DPoint.setPhyiscalSize( getWidth(),  getHeight() );

        for (G2DObject obj : ukFlag)
            obj.draw(g);

    }
}
