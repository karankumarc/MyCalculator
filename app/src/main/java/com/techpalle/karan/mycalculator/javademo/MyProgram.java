package com.techpalle.karan.mycalculator.javademo;

/**
 * Created by ADMIN on 7/23/2016.
 */
public class MyProgram {
    public static void main(String[] args){
        /*Pen pen1 = new Pen("Black","Purple","Cello");
        System.out.println("Pen count "+ pen1.getPenCount());

        Pen pen2 = new Pen("Black","Purple","Cello");
        System.out.println("Pen count "+ pen2.getPenCount());

        System.out.println("Ink level "+pen1.getInkLevel());
        pen1.openCap();
        pen1.writeToConsole("This is the first line written");
        pen1.writeToConsole("This is the first line written");
        pen1.writeToConsole("This is the first line written");
        pen1.writeToConsole("This is the first line written");

*/
        //System.out.print(pen1.inkColor);

        Building b1 = new Building(3,4,5,6);
        System.out.println("Volume "+b1.getVolume());
        System.out.println("Volume per floor "+b1.getVolumePerFloor());
        System.out.println("Building count "+b1.getBuildingCount());

        Building b2 = new Building(7,8,9,10);
        System.out.println("Volume "+b2.getVolume());
        System.out.println("Volume per floor "+b2.getVolumePerFloor());
        System.out.println("Building count "+b2.getBuildingCount());
    }
}
