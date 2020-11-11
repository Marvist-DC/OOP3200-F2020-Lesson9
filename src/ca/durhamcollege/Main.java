/*
 * Author: Domenic Catalano
 * Date: November 11, 2020
 * Program Name: Lesson 9
 */

package ca.durhamcollege;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        // Scanner definition
        Scanner keyboard = new Scanner(System.in);

        // INPUT
        String name = null;
        System.out.print("Please enter your name: ");
        name = keyboard.nextLine();

        float age = 0.0f;
        boolean isValidInput = false; // sentinel variable

        do
        {
            System.out.print("Please enter your age: ");
            try
            {

                age = keyboard.nextFloat();
                isValidInput = true;

                if((age <= 0.0f) || (age >= 120.0f))
                {
                    System.out.println("Error: You must enter an age greater than 0.0 and less than 120.0 years old");
                    keyboard.nextLine();
                    isValidInput = false;
                }
            }
            catch(InputMismatchException inputMismatchException)
            {
                System.out.println("Error: You must enter a valid floating-point number");
                keyboard.nextLine();
                isValidInput = false;
            }

        }
        while(!isValidInput);

        // Multi-dimensional array example

        System.out.println("Multi-Dimensional Array Example");
        int rows = 8;
        int columns = 8;
        float[][] board = new float[rows][columns];

        for (int x = 0; x < rows; x++)
        {
            for (int y = 0; y < columns; y++)
            {
                board[x][y] = (float)(Math.random() * 100.0) + 1.0f;
            }
        }

        System.out.println("Showing 10 Random Values: ");

        for (int i = 0; i < 10; i++)
        {
            var randRows = (int)(Math.random() * rows);
            var randColumns = (int)(Math.random() * columns);
            System.out.print("For row: " + randRows + " col: " + randColumns + " ");
            System.out.printf("The Random number is: %.2f \n", board[randRows][randColumns]);
        }

        // OUTPUT
        System.out.println();
        System.out.printf("You Entered: %s \n",name);
        System.out.printf("You Entered: %.2f \n",age);
    }
}
