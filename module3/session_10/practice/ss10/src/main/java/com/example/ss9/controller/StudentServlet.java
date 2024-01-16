package com.example.ss9.controller;

import com.example.ss9.model.Student;
import com.example.ss9.service.IStudentService;
import com.example.ss9.service.impl.StudentService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "studentServlet", urlPatterns = "/student")
public class StudentServlet extends HttpServlet {
    private IStudentService iStudentService = new StudentService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        if(action == null) {
            action ="";
        }
        switch (action) {
            case "create":
                req.getRequestDispatcher("/student/create.jsp").forward(req, resp);
                break;
            case "update":

                Integer code = Integer.valueOf(req.getParameter("code"));
                Student student = iStudentService.findById(code);
                req.setAttribute("student", student);
                req.getRequestDispatcher("/student/update.jsp").forward(req, resp);
                break;
            default:
                List<Student> students = iStudentService.findAll();
//       Gửi dữ liệu về JSP theo dạng key - value
                req.setAttribute("listStudent", students);
                req.getRequestDispatcher("student/list.jsp").forward(req, resp);
        }

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        if(action == null) {
            action ="";
        }
        switch (action) {
            case "create":
                Integer id = Integer.valueOf(req.getParameter("id"));
                String name = req.getParameter("name");
                Double point = Double.valueOf(req.getParameter("point"));
                String idCard = req.getParameter("idCard");
                Integer codeClass = Integer.valueOf(req.getParameter("codeClass"));
                Student student = new Student(id, name, point, idCard, codeClass);
                iStudentService.save(student);
                resp.sendRedirect("/student");
                break;
            case "update": {
                Integer idUpdate = Integer.valueOf(req.getParameter("id"));
                String nameUpdate = req.getParameter("name");
                Double pointUpdate = Double.valueOf(req.getParameter("point"));
                String idCardUpdate = req.getParameter("idCard");
                Integer codeClassUpdate = Integer.valueOf(req.getParameter("codeClass"));
                Student studentUpdate = new Student(idUpdate, nameUpdate, pointUpdate, idCardUpdate, codeClassUpdate);
                iStudentService.update(studentUpdate);
                resp.sendRedirect("/student");
                break;
            }
        }
    }
}
