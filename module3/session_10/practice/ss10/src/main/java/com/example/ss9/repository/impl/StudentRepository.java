package com.example.ss9.repository.impl;

import com.example.ss9.model.Student;
import com.example.ss9.repository.IStudentRepository;

import java.util.ArrayList;
import java.util.List;

public class StudentRepository implements IStudentRepository {
    private static List<Student> students = new ArrayList<>();
    static {
        students.add(new Student(1,"haiTT",7.0, "12312312", 1));
        students.add( new Student(2,"haiTT2",3.0,"12312312", 2));
        students.add( new Student(3,"haiTT3",6.0,"12312312", 1));
        students.add( new Student(4,"haiTT4",8.0,"12312312", 3));
        students.add( new Student(5,"haiTT5",5.0,"12312312", 1));
    }

    @Override
    public List<Student> findAll() {
        return students;
    }

    @Override
    public void save(Student student) {
        students.add(student);
    }

    @Override
    public Student findById(Integer code) {
        for (Student student: students) {
            if(student.getCode() == code) {
                return student;
            }
        }
        return null;
    }

    @Override
    public void update(Student studentUpdate) {
        for (int i = 0; i < students.size(); i++) {
            if(students.get(i).getCode() == studentUpdate.getCode()) {
                students.set(i, studentUpdate);
                break;
            }
        }
    }
}
