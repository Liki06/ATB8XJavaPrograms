/*
Difference between = and  ==?
byte b = 10; long l = 10l; → How much Byte will be used.
Another byte b = 10; byte c = 10;  What is the anwser if the perform b+c, What is the data type it will give in result.

       short s = 10;

char c = 'A'; //...
 */
package sept.Assignment_1;

public class Assignment_3 {
    public static void main(String[] args)
    {
    int a = 10;// here we are assigning value to the variable a
    int b= 20;//here we are assigning value to the variable b

       boolean c = false;/* here c will return false because a==b values compare
        the Varaible and a and b and returns boolean value */
        System.out.println(c);
        //
        byte d=10;// here first we need to convert into binary 1010 since byte will take 8 bit 00001010 so it will take 8
        long l=10L;
        System.out.println(d);
        byte s1=120;
        byte s2=30;
        int s3=(s1+s2);  //  120 +30 java will by default it will not allow the byte when two bytes are adding
        System.out.println(s3);

        short S4 =10;
        char S5='A';
        long S6= S4+S5;
        System.out.println(S6);







    }
}
