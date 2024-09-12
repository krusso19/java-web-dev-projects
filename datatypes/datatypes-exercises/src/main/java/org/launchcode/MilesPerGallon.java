package org.launchcode;
import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter miles driven: ");
        Float miles = input.nextFloat();
        System.out.println("Enter gallons of gas consumed: ");
        Float gallons = input.nextFloat();
        Float mpg = miles/gallons;
        System.out.println("MPG: "+mpg);


    }
}
