package sept.Assignment;
/*
Create a Class  ATBStudent and 5 Objects - (A/B) - github.com
 */

public class ATBStudent {
   static String name;
    int roll_num;
    boolean result;



    public static void main(String[] args) {
        ATBStudent student1=new ATBStudent();
        ATBStudent student2=new ATBStudent();
        ATBStudent student3=new ATBStudent();
        ATBStudent student4=new ATBStudent();
        ATBStudent student5=new ATBStudent();


        System.out.println(student2.name);
        System.out.println(student3.name);
        System.out.println(student4.name);
        System.out.println(student5.name);
       student1.eat(name);
        System.out.println(student1.name);
    }
    public String eat(String name)
    {
        this.name="Likith";
        System.out.println(this.name+ ":Student can eat");
        return name;
    }
    public void sleep()
    {
        System.out.println("Student can sleep");

    }
    public void read()
    {
        System.out.println("Student can sleep");
    }

}
