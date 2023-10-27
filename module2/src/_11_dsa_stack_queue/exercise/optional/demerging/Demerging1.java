package _11_dsa_stack_queue.exercise.optional.demerging;

import java.util.*;

public class Demerging1 {

    public static void check(List<Student> list)
    {
        Queue<Student>nu = new LinkedList<>();
        Queue<Student>nam = new LinkedList<>();
        for (Student student1:list) {
            if(student1.getGender().equals("NU"))
            {
                nu.offer(student1);
            }else {
                nam.offer(student1);
            }
        }
        list.clear();
        while (!nu.isEmpty()){
            list.add(nu.poll());
        }
        while (!nam.isEmpty())
        {
            list.add(nam.poll());
        }
    }
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("NVA","NU","22"));
        list.add(new Student("NVB","NAM","20"));
        list.add(new Student("NVC","NAM","30"));
        list.add(new Student("NVD","NU","18"));
        list.sort((s1, s2)->s1.getDate().compareTo(s2.getDate()));
        check(list);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }


}
