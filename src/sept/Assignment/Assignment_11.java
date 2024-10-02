package sept.Assignment;

import java.util.Scanner;

/*
Write a program that converts between different units (e.g., kilometers to miles, Celsius to Fahrenheit) based on user selection using a switch statement.
Input. -
choice - 1 - km → m, km → 1km
choice - 2 - f → c, f → c
 */
public class Assignment_11
{

    public static void main(String[] args)
    {
    double a,b;
    String c;
        Scanner input=new Scanner(System.in);
        a=input.nextDouble();
        c=input.next();

        switch(c)
        {
            case "K":
                System.out.println((a=a/1000)+" " +c);
                break;
            case "M":
                System.out.println((a=a*1000)+ " "+ c);
                break;
            default:
                System.out.println("Invalid value");
        }





    }
}
