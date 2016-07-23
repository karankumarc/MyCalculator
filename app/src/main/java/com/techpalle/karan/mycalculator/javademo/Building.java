package com.techpalle.karan.mycalculator.javademo;

/**
 * Created by ADMIN on 7/23/2016.
 */
public class Building {

    private int length;
    private int breadth;
    private int height;
    private int numberOfFloors;
    private String buildingAddress;
    private int count;

    public int getBuildingCount() {
        return count;
    }

    public void setBuildingAddress(String buildingAddress) {
        this.buildingAddress = buildingAddress;
    }

    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }

    public int getHeight() {
        return height;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public Building(int l, int b, int h, int numberOfFloors) {
        length = l;
        breadth = b;
        height = h;
        this.numberOfFloors = numberOfFloors;
        count++;
    }

    public int getVolume(){
        return length*breadth*height;
    }

    public float getVolumePerFloor(){
        return (float) getVolume()/ (float) numberOfFloors;
    }
}
