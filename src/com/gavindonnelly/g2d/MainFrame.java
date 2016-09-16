package com.gavindonnelly.g2d;

import java.awt.Frame;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/**
 * Created by gavindonnelly on 16/09/2016.
 *
 * The main class for our app - it simply creates a frame, add our canvas
 * and makes the frame visible. Responds to WindowClosing event by
 * exiting.
 *
 */
public class MainFrame extends Frame implements WindowListener, KeyListener{

    private static final long serialVersionUID = 1L;//good idea for serialisation compatability

    public static void main(String[] args){
        new MainFrame();
    }

    public MainFrame(){
        this.addWindowListener(this);
        this.addKeyListener(this);
        this.add(new BritishFlag(this));
        this.setSize(1280,640);
        this.setVisible(true);
    }

    public void exit(){
        System.exit(0);
    }

    public void windowActivated(WindowEvent arg0) {
    }

    public void windowClosed(WindowEvent arg0) {
    }

    public void windowClosing(WindowEvent arg0) {
        exit();
    }

    public void windowDeactivated(WindowEvent arg0) {
    }

    public void windowDeiconified(WindowEvent arg0) {
    }

    public void windowIconified(WindowEvent arg0) {
    }

    public void windowOpened(WindowEvent arg0) {
    }

    public void keyPressed(KeyEvent e) {
    }

    public void keyReleased(KeyEvent e) {
		/*
		 * Close the application if ESCape or control-w (or command-w on MacOS) is pressed
		 */
        if ( (e.getKeyCode()==KeyEvent.VK_ESCAPE) ||
                ((e.getKeyCode() == KeyEvent.VK_W) && (Toolkit.getDefaultToolkit().getMenuShortcutKeyMask() != 0))
                )
            exit();
    }

    public void keyTyped(KeyEvent e) {
    }
}