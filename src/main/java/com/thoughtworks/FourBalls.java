package com.thoughtworks;

import processing.core.PApplet;

public class FourBalls extends PApplet {

    public static final int HEIGHT = 480;
    public static final int WIDTH = 640;
    public static final int DIAMETER = 5;
    public static final int DIVISOR = 5;
    public static final int NUMBEROFBALLS = 4;
    private int position;

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }
    @Override
    public void draw() {
        for(int speed = 1; speed<= NUMBEROFBALLS; speed++){
            drawCircle(speed);
        }
    }
    public void drawCircle(int speed){
        ellipse(getXAxisPosition(speed), getYAxisPosition(speed),DIAMETER, DIAMETER);
        position+=1;
    }
    public int getXAxisPosition(int speed){
        return position*speed;
    }
    public int getYAxisPosition(int speed){
        return HEIGHT*speed/ DIVISOR;
    }
    public static void main(String[] args) {
        PApplet.main("com.thoughtworks.FourBalls",args);
    }
}
