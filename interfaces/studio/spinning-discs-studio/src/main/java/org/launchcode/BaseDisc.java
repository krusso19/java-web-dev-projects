package org.launchcode;

public abstract class BaseDisc {

    public double spinSpeed;
    public double storageCapacity;
    public double remainingCapacity;
    public double usedCapacity;

    public BaseDisc(double spinSpeed, double storageCapacity, double remainingCapacity, double usedCapacity) {
        this.spinSpeed = spinSpeed;
        this.storageCapacity = storageCapacity;
        this.remainingCapacity = remainingCapacity;
        this.usedCapacity = usedCapacity;
    }

    public double getSpinSpeed() {
        return spinSpeed;
    }

    public double getStorageCapacity() {
        return storageCapacity;
    }

    public double getRemainingCapacity() {
        return remainingCapacity;
    }

    public double getUsedCapacity() {
        return usedCapacity;
    }

    public void setSpinSpeed(double spinSpeed) {
        this.spinSpeed = spinSpeed;
    }

    public void setStorageCapacity(double storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    public void setRemainingCapacity(double remainingCapacity) {
        this.remainingCapacity = remainingCapacity;
    }

    public void setUsedCapacity(double usedCapacity) {
        this.usedCapacity = usedCapacity;
    }

}