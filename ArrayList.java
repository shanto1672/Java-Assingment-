/**
 * Problem number 7.1
 */

import java.util.Scanner;
import java.util.Random;
public class ArrayList
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        Random rand=new Random();
        int p;
        System.out.println("Enter the array size");
        p = in.nextInt();
        int[] score = new int[p];


        for (int i = 0; i < p; i++)
        {
            score[i] = rand.nextInt(100);


        }
        /**
         * Every elements of index
         */
        System.out.println("Every elements at even index");
        for (int i = 0; i < p; i++)
        {
            if (i % 2 == 0)
            {
                System.out.print(" " + score[i]);
                /**
                 * Print every even elements
                 */
            }
        }
        System.out.println("\n");
        System.out.println("Every elements at even elements");
        for (int i = 0; i < p; i++)
        {
            if (score[i] % 2 == 0)
            {
                System.out.print(" " + score[i]);
            }
        }
        System.out.println("\n");
        /**
         * Every elements in reverse order
         */
        System.out.println("Every elements in reverse order");
        for (int i = p - 1; i >= 0; i--)
        {

            System.out.print(" " + score[i]);

        }
        System.out.println();
        /**
         * Print first and last elements
         */
        System.out.println("First and last elements");

        System.out.print (" "+score[0]);
        System.out.println(" "+score[p-1]);

    }
}
