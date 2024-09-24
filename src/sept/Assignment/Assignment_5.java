package sept.Assignment;
/*
 Ternary Operators to handle multiple conditions.
// Input → int score = 85
// String grade →
//  score >= 90 → A
//  score >= 80 → B
//  score >= 70 → C
 */
public class Assignment_5
{
    public static void main(String[] args) {
        int score=96;
        //condition?a:b
       String grade= (score>=90)? "A":((score>=80)?"B":"C");
        System.out.println(grade);


    }



}
