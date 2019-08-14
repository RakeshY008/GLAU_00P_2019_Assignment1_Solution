package Gravity;

import java.util.Scanner;

public class Gravity {

    public static void main(String[] args) {

        double g = 9.8;    // g=gravity const. value
        Scanner myObj = new Scanner(System.in); // syntax to take input from user
        double t = myObj.nextDouble();

        /* Calculation */
        double speed = g * t;
        double distance = 0.5 * g * t * t;

                        /* syntax to print in java
	                            using concatenate method  */

        System.out.println("The speed of the object at " + t + " seconds after its release is " + speed + " and the distance the object has travelled in the " + t + " seconds after the relase is " + distance);
    }
}