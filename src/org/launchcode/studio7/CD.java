package org.launchcode.studio7;

public class CD extends BaseDisc implements OpticalDisc {

    public CD(int discCapacity, String discName, String discContent, String discType) {
        super(discCapacity, discName, discContent, discType);
    }
    @Override
    public void spinDisc() {
        System.out.println("A CD spins at a rate of 200 - 500 rpm.");
    }

    @Override
    public String readData(){
        return "data";
    }

    public void writeData(String data) {

    }
    public void stopDisc() {

    }

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
