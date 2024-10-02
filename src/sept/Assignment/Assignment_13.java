package sept.Assignment;

public class Assignment_13 {
    public static void main(String[] args)
    {
      /*

      Prime Number from 1 to 100. (for loop)
       */
        //The number which is divisible by 1 and itself is called prime number
        for(int i=1;i<=100;i++)
        {
           if(i%1==0 && i%i==0)
           {
               System.out.println("It is prime number" + i);
           }
        }
    }
}
