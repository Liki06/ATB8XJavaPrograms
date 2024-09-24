package sept.Assignment;

public class Assignment_8 {
    public static void main(String[] args)
    {
        //Leap year logic
        //2000 is a not a leap year only the number which is divisible by 4 and not divisible by 100 is called leap year
         int i=2004;
         if(i%4==0 && !(i%100==0))
         {
             System.out.println("It is  Leap year: " +i);

         }
         else if(i%4==0 && (i%100==0))
         {
             System.out.println("It is not a leap year :" +i);
         }

    }
}
