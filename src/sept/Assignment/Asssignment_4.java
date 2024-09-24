package sept.Assignment;
import java.lang.Math;
/*
By using Ternary Operators max between 3 numbers.
// Input int - a,b,c - a = 10, b = 20, c = 45
// Max → a,b,c → c
✅ Ternary Operators to handle multiple conditions.
// Input → int score = 85
// String grade →
//  score >= 90 → A
//  score >= 80 → B
//  score >= 70 → C
 */
public class Asssignment_4 {
    public static void main(String[] args)
    {

        int a= 70;
        int b= 100;
        int c= 411;
        //int d=condition?a:b -- ternary operator
        ///Syntax [condition?a:b]
       int max= (a>b?a:b)>c?(a>b?a:b):c;
        System.out.println(max);







        System.out.println();


    }
}
