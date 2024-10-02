package sept.Assignment;

import java.util.Scanner;

public class Assignment_12

{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        int fact=1;
        for(int i = 1; i<=n; i++)
        {
            fact=fact*i;
        }
        System.out.println("Factorial value of " +n + " is:" + fact  );
}



}
