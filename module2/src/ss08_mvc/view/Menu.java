package ss08_mvc.view;

import ss08_mvc.model.Student;
import ss08_mvc.service.StudentService;
import ss08_mvc.service.StudentServiceImpl;

public class Menu {
    private static StudentService service = new StudentServiceImpl();
    public  static void List()
    {
        Student[] students = service.findAll();
        for(Student student: students){
            System.out.println(student);
        }
    }
    public static void menu()
    {
        System.out.println("-----Student System--------");
        System.out.println("1. All Student In List");
        System.out.println("2. Add New Student");
        System.out.println("3. Update");
        System.out.println("4. Delete a Student");
        System.out.println("5. Delete a lot of Student");
        System.out.println("6. Sort by ID");
        System.out.println("7. Sort by Name");
        System.out.println("8. Search by ID");
        System.out.println("9. Search by Name");
        System.out.println("10. Exit");
        System.out.print("Please input number: ");
    }
}
