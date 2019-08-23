/*
 * @author Divyansh Bhardwaj
 * @version 1.0
 * */
package main;


import java.util.Scanner;

public class Gravity {

	public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double time = scanner.nextDouble();
        double speed;
        double distance;
        double gravity = 9.8;

        speed = gravity * time;
        distance = (gravity * time * time) / 2;

        System.out.println("The speed of the object at " + time + " seconds after its release is " + speed + " and the distance the object has travelled in the " + time + " seconds after the relase is " + distance);
        scanner.close();
	}
}
