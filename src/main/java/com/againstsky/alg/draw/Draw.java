package com.againstsky.alg.draw;

import com.againstsky.alg.IntegerAble;
import edu.princeton.cs.algs4.StdDraw;


import java.awt.*;

public class Draw {

    int w = 800, h = 800;

    double halfDrawW,hScale;

    private void drawBg(int w, int h) {
        StdDraw.setCanvasSize(w, h);

    }

    public void draw(IntegerAble[] array,IntegerAble maxInt) {
        StdDraw.enableDoubleBuffering();

        while (true){
            drawBg(w, h);
            int N = array.length;

            hScale = ((double)1) / (maxInt.intVal()*2);
            halfDrawW = ((double)1)/(N*3-1)  ;

            renderArray(array);

            lightRect(15,array[15].intVal());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }

    private double[] calculateXY(int i,int val){
        double x = (i * 3 + 1) * halfDrawW;
        double y = (double) val*hScale /2;
        return new double[]{x,y};
    }

    private void lightRect(int i,int val){
        StdDraw.setPenColor(Color.RED);
        double[] xy = calculateXY(i, val);
        StdDraw.filledRectangle(xy[0],xy[1]+0.1,halfDrawW,xy[1]);
        StdDraw.setPenColor(Color.CYAN);
    }

    private void renderArray(IntegerAble[] array) {
        StdDraw.setPenColor(Color.CYAN);
        for (int i = 0; i < array.length; i++) {
            int val = array[i].intVal();
            double[] xy = calculateXY(i, val);
            StdDraw.filledRectangle(xy[0],xy[1],halfDrawW,xy[1]);
        }
    }
}
