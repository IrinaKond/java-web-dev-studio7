package org.launchcode.studio7;

public interface OpticalDisc {
    void spinDisc();

    String readData();

    void writeData(String data);
    void stopDisc();

}
