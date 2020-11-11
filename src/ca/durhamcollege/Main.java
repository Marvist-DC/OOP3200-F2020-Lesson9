/*
 * Author: Domenic Catalano
 * Date: November 11, 2020
 * Program Name: Lesson 9
 */
package ca.durhamcollege;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        // Define our scanner
        Scanner	keyboard = new Scanner(System.in);

        // INPUT
        String name = null;
        System.out.print("Please enter your name: ");
        name = keyboard.nextLine();

        float age = 0.0f;
        System.out.print("Please enter your age: ");
        age = keyboard.nextFloat();

        // OUTPUT
        System.out.println();
        System.out.printf("You entered: %s \n", name);
        System.out.printf("You entered: %,.2f \n", age);

    }
}
