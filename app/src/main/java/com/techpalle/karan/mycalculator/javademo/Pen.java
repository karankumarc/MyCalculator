package com.techpalle.karan.mycalculator.javademo;

/**
 * Created by ADMIN on 7/23/2016.
 */
public class Pen {
    private String inkColor="White";
    private String penColor;
    private String brand;
    private int inkLevel;
    private boolean capIsOpen;
    private int penCount;

    public int getPenCount() {
        return penCount;
    }

    public String getInkColor() {
        return inkColor;
    }

    public String getPenColor() {
        return penColor;
    }

    public String getBrand() {
        return brand;
    }

    public int getInkLevel() {
        return inkLevel;
    }

    public boolean isCapIsOpen() {
        return capIsOpen;
    }

    public Pen(String inkColor, String penColor, String brand) {
        this.inkColor = inkColor;
        this.penColor = penColor;
        this.brand = brand;
        inkLevel = 3;
        penCount++;
    }

    public void openCap(){
        if(!capIsOpen)
            capIsOpen = true;
    }

    public void closeCap(){
        if(capIsOpen)
            capIsOpen = false;
    }

    public void writeToConsole(String messageToWrite){
        if(capIsOpen && inkLevel > 0){
            System.out.println(messageToWrite);
            inkLevel--;
        } else {
            if(inkLevel <= 0)
                System.out.println("Out of ink! Refill");
            else if(!capIsOpen)
                System.out.println("Cap is closed! Unable to write");
        }

    }

}
