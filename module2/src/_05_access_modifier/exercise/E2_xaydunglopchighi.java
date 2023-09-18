package _05_access_modifier.exercise;

public class E2_xaydunglopchighi {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println(student.setName("nguyen thi thu hoa"));
    }
}
class Student{
    private String name="john";
    private String classes="C02";
    public Student(){

    }
    public String setName(String name)
    {
        return name+this.setClasses("IT");
    }
    private String setClasses(String classes)
    {
        return classes;
    }

}
