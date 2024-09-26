package org.launchcode;

import java.util.Comparator;

public class ConeComparator implements Comparator<Cone> {

    @Override
    public int compare(Cone o1, Cone o2) {
        if (o1.getCost() - o2.getCost() < 0){
            return -1;
        } else if (o1.getCost() - o2.getCost() > 0){
            return 1;
        } else {
            return 0;
        }
    } /*cannot use return o1.getCost() - 02.getCost(); because
    cost is a double and compare only compares integers. so use this ef/else
    to return integers to compare*/
}
