package sept.Assignment;

public class Assignment_13 {
    public static void main(String[] args) {
        int n = 100;    /*

      Prime Number from 1 to 100. (for loop)
       */
        //The number which is divisible by 1 and itself is called prime number
        for (int i = 1; i <= n; i++) {
            int count = 0;
            for (int j = i; j >= 1; j--) {
                if (i % j == 0) {
                    count++;
                }
            }

                if (count == 2)
                {
                    System.out.println("It is prime number:" + i);
                }

            }

        }
    }





