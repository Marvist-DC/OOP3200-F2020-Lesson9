/**
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
        String name = null;
        Scanner	keyboard = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        name = keyboard.nextLine();
        System.out.printf("You entered: %s", name);
    }
}
