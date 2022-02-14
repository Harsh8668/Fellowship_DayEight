package com.javaproject.dayeight;

import java.util.Scanner;

import static java.lang.Double.compare;

public class LineComparsion {
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation Program");
        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Co-ordinates for the Line1");
        int x1 = sc.nextInt();
        int x2 = sc.nextInt();
        int x3 = sc.nextInt();
        int x4 = sc.nextInt();

        System.out.println("Enter the Co-ordinates for the Line2");
        int y1 = sc.nextInt();
        int y2 = sc.nextInt();
        int y3 = sc.nextInt();
        int y4 = sc.nextInt();

        double line1 = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        System.out.println("Distance Between Line1 is : " + line1);


        double line2 = Math.sqrt((x4 - x3) * (x4 - x3) + (y4 - y3) * (y4 - y3));
        System.out.println("Distance Between Line2 is : " + line2);

        LineCompare(line1, line2);
        LineEqual(line1, line2);
    }

    public static void LineCompare(double line1, double line2) {
        if (compare(line1, line2) > 0) {
            System.out.println("Line1 is greater than Line2");
        } else if (compare(line1, line2) < 0) {
            System.out.println("Line1 is smaller than Line2");
        } else {
            System.out.println("Both the Lines are equal");
        }
    }

    public static void LineEqual(double line1, double line2) {
        if (line1 == line2) {
            System.out.println("Both the lines are equal");
        }
        else {
            System.out.println("Both the Lines are not equal");
        }
    }

}
