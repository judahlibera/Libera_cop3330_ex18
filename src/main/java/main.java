/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Judah Libera
 */
import java.util.*;
public class main {
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        System.out.printf("Press C to convert from Fahrenheit to Celsius.\nPress F to convert from Celsius to Fahrenheit.\n Your choice: ");
        char s = '0';
        do {
            s = sc.next().charAt(0);
        }while(s != 'c' && s != 'C' && s != 'f' && s != 'F');
        if(s == 'c' || s == 'C')
        {
            System.out.printf("Please enter the temperature in Fahrenheit: ");
            int t = sc.nextInt();
            double nt = (t - 32) * 5 / 9;
            System.out.printf("The temperature in Celsius is %.1f.", nt);
        }
        else
        {
            System.out.printf("Please enter the temperature in Celsius: ");
            int t = sc.nextInt();
            double nt = (t * 9 / 5) + 32;
            System.out.printf("The temperature in Fahrenheit is %.1f.", nt);
        }
    }
}