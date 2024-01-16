package codegym.com.usermanager.controller;

import codegym.com.usermanager.model.User;
import codegym.com.usermanager.service.IUserService;
import codegym.com.usermanager.service.impl.UserService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "UserServlet",urlPatterns = "/users")
public class UserServlet extends HttpServlet {
    private IUserService service = new UserService();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        if(action==null){
            action="";
        }
        switch (action)
        {
            case "create":
                createUserForm(req,resp);
                break;
            case "update":
                updateUserForm(req,resp);
                break;
            case "delete":
                deleteUserForm(req,resp);
                break;
            case "view":
                viewUserForm(req,resp);
                break;
            case "sortByName":
                sortByNameUser(req,resp);
                break;
            case "sortByEmail":
                sortByEmailUser(req,resp);
                break;
            case "sortByCountry":
                sortByCountryUser(req,resp);
                break;
            default:
                listUserForm(req,resp);
                break;

        }
    }

    private void sortByCountryUser(HttpServletRequest req, HttpServletResponse resp) {
        List<User> users = service.selectAllUsers();
        service.sortByCountry(users);
        req.setAttribute("users",users);
        RequestDispatcher dispatcher = req.getRequestDispatcher("/user/list.jsp");
        try{
            dispatcher.forward(req,resp);
        } catch (ServletException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void sortByEmailUser(HttpServletRequest req, HttpServletResponse resp) {
        List<User> users = service.selectAllUsers();
        service.sortByEmail(users);
        req.setAttribute("users",users);
        RequestDispatcher dispatcher = req.getRequestDispatcher("/user/list.jsp");
        try{
            dispatcher.forward(req,resp);
        } catch (ServletException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void sortByNameUser(HttpServletRequest req, HttpServletResponse resp) {
        List<User> users = service.selectAllUsers();
        service.sortByName(users);
        req.setAttribute("users",users);
        RequestDispatcher dispatcher = req.getRequestDispatcher("/user/list.jsp");
        try{
            dispatcher.forward(req,resp);
        } catch (ServletException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void viewUserForm(HttpServletRequest req, HttpServletResponse resp) {
        int id = Integer.parseInt(req.getParameter("id"));
        User user = service.selectUser(id);
        req.setAttribute("user",user);
        RequestDispatcher dispatcher = req.getRequestDispatcher("/user/view.jsp");
        try{
            dispatcher.forward(req,resp);
        } catch (ServletException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void deleteUserForm(HttpServletRequest req, HttpServletResponse resp) {
        int id = Integer.parseInt(req.getParameter("id"));
        service.delete(id);
        try {
            resp.sendRedirect("/users");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void updateUserForm(HttpServletRequest req, HttpServletResponse resp) {
        int id = Integer.parseInt(req.getParameter("id"));
        User user = service.selectUser(id);
        req.setAttribute("user",user);
        RequestDispatcher dispatcher = req.getRequestDispatcher("/user/update.jsp");
        try{
            dispatcher.forward(req,resp);
        } catch (ServletException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void createUserForm(HttpServletRequest req, HttpServletResponse resp) {
        RequestDispatcher dispatcher = req.getRequestDispatcher("/user/create.jsp");
        try{
            dispatcher.forward(req,resp);
        } catch (ServletException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void listUserForm(HttpServletRequest req, HttpServletResponse resp) {
        List<User> users = service.selectAllUsers();
        req.setAttribute("users",users);
        RequestDispatcher dispatcher = req.getRequestDispatcher("/user/list.jsp");
        try{
            dispatcher.forward(req,resp);
        } catch (ServletException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        if(action==null){
            action="";
        }
        switch (action)
        {
            case "create":
                createUser(req,resp);
                break;
            case "update":
                updateUser(req,resp);
                break;
            case "search":
                searchUser(req,resp);
                break;
            default:
                break;
        }
    }

    private void searchUser(HttpServletRequest req, HttpServletResponse resp) {
        String search = req.getParameter("search");
        List<User> users = service.search(search);
        req.setAttribute("users",users);
        RequestDispatcher dispatcher = req.getRequestDispatcher("/user/list.jsp");
        try{
            dispatcher.forward(req,resp);
        } catch (ServletException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void updateUser(HttpServletRequest req, HttpServletResponse resp) {
        int id  = Integer.parseInt(req.getParameter("id"));
        String name = req.getParameter("name");
        String email = req.getParameter("email");
        String country = req.getParameter("country");
        User user = new User(id,name,email,country);
        service.update(user);
        try{
            resp.sendRedirect("/users");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    private void createUser(HttpServletRequest req, HttpServletResponse resp) {
        String name = req.getParameter("name");
        String email = req.getParameter("email");
        String country = req.getParameter("country");
        User user = new User(name,email,country);
        service.insertUser(user);
        try{
            resp.sendRedirect("/users");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
