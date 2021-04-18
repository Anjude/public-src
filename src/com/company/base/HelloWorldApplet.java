package com.company.base;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by Anjude on 2021/3/29 23:20
 */
public class HelloWorldApplet extends Applet {
    public void paint(Graphics g) {
        g.drawString("Hello World", 25, 50);
    }
}
