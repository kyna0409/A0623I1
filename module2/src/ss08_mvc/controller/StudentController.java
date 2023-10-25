package ss08_mvc.controller;

import ss08_mvc.model.Student;
import ss08_mvc.service.StudentService;
import ss08_mvc.service.StudentServiceImpl;
import ss08_mvc.view.Menu;

import java.util.Scanner;

/**
 * (C) Copyright 2023 CodeGym Da Nang. All Rights Reserved.
 *
 * @author caube
 * @version 1.0
 * @see <a href="https://danang.codegym.vn/">CodeGym Da Nang</a>
 * @since 10/11/2023
 */
public class StudentController {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int select = 0;
        do {
            Menu.menu();
            select = Integer.parseInt(scanner.nextLine());
            switch (select){
                case 1: //list
                    Menu.List();
                    break;
                case 2: //add new

//                    System.out.print("Input id: ");
//                    int id = Integer.parseInt(scanner.nextLine());
//                    System.out.print("Input name: ");
//                    String name = scanner.nextLine();
//                    Student student = new Student(id, name);
//
//                    service.addStudent(student);
                    break;
                case 3: //update
                    break;
                case 9:// exit
                    System.exit(0);
            }
        } while (true);
    }

}
