package _05_access_modifier.practice;

public class E1_StaticMethod {
    public static void main(String[] args) {
        Student.change();//calling change method
        // creating display method
        Student s1 = new Student(111,"A");
        Student s2 = new Student(111,"B");
        Student s3 = new Student(111,"C");
        //calling display method
        s1.display();
        s2.display();
        s3.display();
    }
}
class Student{
   private int rollno;
   private String name;
   private  static String college ="BBDIT";
   // constructor to initialize the variable
    Student(int r, String n)
    {
        rollno = r;
        name = n;
    }
    // static method to change the value of static variable
    static void change()
    {
        college="CODEGYM";
    }
    //method to display values
    void display()
    {
        System.out.println(rollno+" "+name+" "+college);
    }
}
