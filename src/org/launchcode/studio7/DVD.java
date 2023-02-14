package org.launchcode.studio7;

    public class DVD extends BaseDisc implements OpticalDisc {

        public DVD(int discCapacity, String discName, String discContent, String discType) {
            super(discCapacity, discName, discContent, discType);
        }
        @Override
        public void spinDisc() {
            System.out.println("A DVD spins at a rate of 570 - 1600 rpm.");
        }

        @Override
        public String readData(){
            return "Data";
        }

        public void writeData(String data) {

        }
        public void stopDisc() {

        }
    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
