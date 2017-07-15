package com.gavindonnelly.g2d;

import java.awt.*;
import java.awt.event.KeyListener;
import java.util.ArrayList;

/**
 * Created by gavindonnelly on 30/09/2016.
 */
public class AmericanFlag extends Canvas{

    private static final long serialVersionUID = 1L;//good idea for serialisation compatability

    private double height; // Represents the height of the entire flag
    private double width;  // Represents the width of the entire flag

    private ArrayList<G2DObject> usFlag = new ArrayList<G2DObject>();

    public AmericanFlag(KeyListener callerFrame) {
        this.addKeyListener(callerFrame);//allows for closing after clicking on canvas and gaining focus

        width = 2560;
        height = 1280;

        double rectWidth = .6*width;
        double xCoord = .4*width;

        //create the union on panel
        G2DRectangle union = new G2DRectangle(0,0,(.4*width),(.53846*height));
        union.setColor(new Color(0x003399));

        usFlag.add(union);

        for(int i=0; i<13; i++)
        {
            // Change the x coordinate and the width of the stripes when it is
            // time to draw the eigth stripe on the flag as it should be drawn
            // below the union
            if(i==7)
            {
                xCoord = 0;
                rectWidth = width;
            }

            G2DRectangle stripe = new G2DRectangle(xCoord,i*.0769*height,rectWidth,.0769*height);

            // Alternate the color for each stripe between red and white
            if(i%2==0)
                stripe.setColor(Color.RED);
            else
                stripe.setColor(Color.WHITE);

            //usFlag.add(stripe);
        }


    }

    public void paint(Graphics g){
        G2DPoint.setPhyiscalSize( getWidth(),  getHeight() );

        for (G2DObject obj : usFlag)
            obj.draw(g);

    }
}
