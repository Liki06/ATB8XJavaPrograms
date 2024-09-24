package sept.Assignment;

public class Asssignment_6 {
    public static void main(String[] args) {
        int side1=20;
        int side2=30;
        int side3=10;
        if(side1==side2 && side2==side3 && side1==side3)
        {
            System.out.println("triangle is equilateral");
        }
        else if(side1==side2 || (side2==side3) || side1==side3 )
        {
            System.out.println("triangle is isosceles ");
        }
        else
        {
            System.out.println("scalene no sides are matching ");
        }
    }
}
