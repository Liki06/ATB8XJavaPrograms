package sept.Assignment;

import java.util.Scanner;

public class Assignment_9
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        sc.close();
          for(int i = 1; i <= a ; i++)
        {
            System.out.println(a +"*"+ i + "="+ a*i);
        }

    }
}
