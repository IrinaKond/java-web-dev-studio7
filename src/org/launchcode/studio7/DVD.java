package org.launchcode.studio7;

    public class DVD extends BaseDisc implements OpticalDisc {

        public DVD(int discCapacity, String discName, String discContent, String discType) {
            super(discCapacity, discName, discContent, discType);
        }
        public void spinDisc() {

        }

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
