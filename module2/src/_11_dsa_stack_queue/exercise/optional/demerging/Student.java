package _11_dsa_stack_queue.exercise.optional.demerging;

public class Student implements Comparable<Student>{
    private String name;
    private String gender;
    private String date;
    public Student()
    {

    }

    public Student(String name, String gender, String date) {
        this.name = name;
        this.gender = gender;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", date='" + date + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return Integer.parseInt(this.getGender())-Integer.parseInt(o.getGender());
    }
}
