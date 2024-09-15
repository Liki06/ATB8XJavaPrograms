//Modulus operator=
package sept.Assignment_1;
public class Assignment_2
{
    public static void main(String[] args)
    {
        double a=50.0;
        double b=50.0;
        double sum=a+b;
//        System.out.println("*****Sample Calculator*******");
//        System.out.println("Addition Calculator for values:"+ (a+b));
//        System.out.println("Subtraction Calculator for values:"+ (a-b));
//        System.out.println("Multiplication Calculator for values:"+ (a*b));
//        System.out.println("Division Calculator for values:"+ (a/b));
//        System.out.println("Modulus Calculator for values:"+ (a%b));
      //we need to use %f for double
        System.out.printf("%f + %f = %f",a,b,(a+b));
        System.out.println();
        System.out.printf("%f - %f = %f",a,b,(a-b));
        System.out.println();
        System.out.printf("%f * %f = %f",a,b,(a*b));
        System.out.println();
        System.out.printf("%f / %f = %f",a,b,(a/b));
        System.out.println();
        System.out.printf("%f mod %f = %f",a,b,(a % b));
        System.out.println();









    }


}
