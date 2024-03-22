package com.Himraj.basic_questions;

import java.util.Scanner;

// Calculate Distance Between Two Points.
public class Distance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // coordinate for the first point.
        System.out.print("(first point) Enter x coordinate: ");
        float x1 = sc.nextFloat();
        System.out.print("(first point) Enter y coordinate: ");
        float y1 = sc.nextFloat();

        // coordinate for the second point.
        System.out.print("(second point) Enter x coordinate: ");
        float x2 = sc.nextFloat();
        System.out.print("(second point) Enter y coordinate: ");
        float y2 = sc.nextFloat();

        float diffInX = (float) Math.pow(x2 - x1, 2);
        float diffInY = (float) Math.pow(y2 - y1, 2);

        float distance = (float) Math.sqrt(diffInX + diffInY);
        System.out.println("Distance: " + distance);

    }

}
