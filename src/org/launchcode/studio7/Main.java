package org.launchcode.studio7;

public class Main {

    public static void main(String[] args){

        // TODO: Declare and initialize a CD and a DVD object.
        CD cd = new CD(700, "CD Example", "Work", "CD_R");
        DVD dvd = new DVD (4700, "DVD Example", "Home", "DVD-R");

        // TODO: Call each CD and DVD method to verify that they work as expected.
        cd.spinDisc();
        dvd.spinDisc();

        cd.readData();
        dvd.readData();

        System.out.println(cd.readData());
        System.out.println(dvd.readData());

    }
}
