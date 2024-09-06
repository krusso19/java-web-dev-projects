package org.launchcode;
import java.util.Scanner;
public class Area {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("enter a radius");
        Double radius = input.nextDouble();
        while (radius <= 0){
            System.out.println("Invalid radius " + radius + ". Value of radius must be greater than or equal to 0. Enter another number: ");
            radius = input.nextDouble();
        }

        Double area = Circle.getArea(radius);
        System.out.print("The area of the circle with a radius of "+ radius +" is "+ area);
    }
}
