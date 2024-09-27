package org.launchcode;

public class CD extends BaseDisc implements OpticalDisc{
    public CD(double spinSpeed, double storageCapacity, double remainingCapacity, double usedCapacity) {
        super(spinSpeed, storageCapacity, remainingCapacity, usedCapacity);
    }


    // TODO: Implement your custom interface.
    @Override
    public void spinDisc() {
        System.out.println("CD spins at "+spinSpeed);
    }
    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.
}
