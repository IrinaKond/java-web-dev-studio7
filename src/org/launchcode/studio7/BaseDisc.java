package org.launchcode.studio7;

public abstract class BaseDisc {
    protected final int discCapacity;
    protected String discName;
    protected String discContent;
    protected String discType;

    public BaseDisc(int discCapacity, String discName, String discContent, String discType) {
        this.discCapacity = discCapacity;
        this.discName = discName;
        this.discContent = discContent;
        this.discType = discType;
    }

    public int getDiscCapacity() {
        return discCapacity;
    }


    public String getDiscName() {
        return discName;
    }

    public void setDiscName(String discName) {
        this.discName = discName;
    }

    public String getDiscType() {
        return discType;
    }

    public void setDiscType(String discType) {
        this.discType = discType;
    }
}
