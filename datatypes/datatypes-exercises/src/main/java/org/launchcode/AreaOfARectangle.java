package org.launchcode;
import java.util.Scanner;

public class AreaOfARectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a whole number: ");
        Integer length = input.nextInt();
        System.out.println("Please enter a whole number: ");
        Integer width = input.nextInt();
        Integer area = width*length;
        System.out.println("The area of the rectangle with dimmensions " + length + " by " + width + " is " + area + ".");

    }
}
