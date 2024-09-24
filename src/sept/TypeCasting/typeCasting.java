/*
Give some another example of Widening with Implicit and Explicit, Narrowing with implicit and explicit.

int a = 10;
System.out.println(  --a + a --  + a-); System.out.println(a);

int a = 10;
System.out.println(  --a + a++ + a—); System.out.println(a);
 */
package sept.TypeCasting;

public class typeCasting {
    public static void main(String[] args)
    {
      //widenining
//      int 1w=100;
//      long e= a; // it is the widening concept
//        byte w=123;
//        int r= w;
//        System.out.println(e);
        int a = 10;
        System.out.println(--a + a--  +a);
        // value |exp  |
         /* 9 + 9 + 8 =26

          */


        System.out.println(a);

        int a1 = 20;
        System.out.println(  --a1 + a1++ + a1);

        // 19 + 19 + 20 =58
        System.out.println(a1);

    }


}

