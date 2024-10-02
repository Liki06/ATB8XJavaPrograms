package sept.Assignment;

import java.util.Scanner;

public class Assignment_10 {
    public static void main(String[] args) {
//        Create a simple calculator that performs addition, subtraction, multiplication, and division
//        , modus based on user input using switch statements.
//
//                Inputs :   num 1, num 2, +
//                Output :  num1+num2 → print information.

        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        String operator=sc.next();
        sc.close();
        switch (operator){
            case "+":
                System.out.println("a+b=" +(a+b));
                break;
            case "-":
                System.out.println("a-b="+ (a-b) );
                break;
            case "*":
                System.out.println("a*b=" + (a*b));
                break;
            case "/":
                System.out.println("a/b=" + (a/b));
                break;
            case "%":
                System.out.println("a%b=" + (a%b));
                break;
            default:
                System.out.println("Invalid operator");

        }
    }

}
