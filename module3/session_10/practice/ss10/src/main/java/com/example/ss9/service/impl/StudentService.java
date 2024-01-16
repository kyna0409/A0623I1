package com.example.ss9.service.impl;

import com.example.ss9.model.Student;
import com.example.ss9.repository.IStudentRepository;
import com.example.ss9.repository.impl.StudentRepository;
import com.example.ss9.service.IStudentService;

import java.util.List;

public class StudentService implements IStudentService {
    private IStudentRepository iStudentRepository = new StudentRepository();
    @Override
    public List<Student> findAll() {
        return iStudentRepository.findAll();
    }

    @Override
    public void save(Student student) {
        iStudentRepository.save(student);
    }

    @Override
    public Student findById(Integer code) {
        return iStudentRepository.findById(code);
    }

    @Override
    public void update(Student studentUpdate) {
        iStudentRepository.update(studentUpdate);
    }
}
