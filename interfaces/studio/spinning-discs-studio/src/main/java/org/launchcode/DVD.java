package org.launchcode;

public class DVD extends BaseDisc implements OpticalDisc{
    public DVD(double spinSpeed, double storageCapacity, double remainingCapacity, double usedCapacity) {
        super(spinSpeed, storageCapacity, remainingCapacity, usedCapacity);
    }


    // TODO: Implement your custom interface.
    @Override
    public void spinDisc() {
        System.out.println("DVD spins at speed "+spinSpeed);
    }
    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.
}
