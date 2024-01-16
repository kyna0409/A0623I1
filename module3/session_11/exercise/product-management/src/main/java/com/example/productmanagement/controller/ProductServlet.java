package com.example.productmanagement.controller;

import com.example.productmanagement.model.Product;
import com.example.productmanagement.service.IProductService;
import com.example.productmanagement.service.impl.ProductService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ProductServlet",urlPatterns = "/products")
public class ProductServlet extends HttpServlet {
    private IProductService service = new ProductService();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        if(action==null)
        {
            action ="";
        }
        switch (action)
        {
            case "create":
                showCreateForm(req,resp);
                break;
            case "update":
                showUpdateForm(req,resp);
                break;
            case "delete":
                deleteProduct(req,resp);
                break;
            case "view":
                showViewForm(req,resp);
                break;
            case "sortByName":
                sortProductsByName(req, resp);
                break;
            case "sortByPrice":
                sortProductsByPrice(req, resp);
                break;
            default:
                listProductForm(req,resp);
                break;
        }
    }

    private void sortProductsByPrice(HttpServletRequest req, HttpServletResponse resp) {
        service.sortByPrice();
        listProductForm(req,resp);
    }

    private void sortProductsByName(HttpServletRequest req, HttpServletResponse resp) {
        service.sortByName();
        listProductForm(req,resp);
    }


    private void showViewForm(HttpServletRequest req, HttpServletResponse resp) {
        int id = Integer.parseInt(req.getParameter("id"));
        Product product = service.findById(id);
        req.setAttribute("product",product);
        RequestDispatcher dispatcher = req.getRequestDispatcher("/product/view.jsp");
        try{
            dispatcher.forward(req,resp);
        } catch (ServletException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void showUpdateForm(HttpServletRequest req, HttpServletResponse resp) {
        int id = Integer.parseInt(req.getParameter("id"));
        Product product = service.findById(id);
        req.setAttribute("product",product);
        RequestDispatcher dispatcher = req.getRequestDispatcher("/product/update.jsp");
        try{
            dispatcher.forward(req,resp);
        } catch (ServletException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void showCreateForm(HttpServletRequest req, HttpServletResponse resp) {
        RequestDispatcher dispatcher = req.getRequestDispatcher("/product/create.jsp");
        try{
            dispatcher.forward(req,resp);
        } catch (ServletException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void listProductForm(HttpServletRequest req, HttpServletResponse resp) {
        List<Product> products = service.findAll();
        req.setAttribute("products",products);
        RequestDispatcher dispatcher = req.getRequestDispatcher("/product/list.jsp");
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
        if(action==null)
        {
            action="";
        }
        switch (action){
            case "create":
                createProduct(req,resp);
                break;
            case "update":
                updateProduct(req,resp);
                break;
            case "search":
                searchProduct(req,resp);
                break;
            default:
                break;
        }
    }
    private void searchProduct(HttpServletRequest req, HttpServletResponse resp) {
        String search = req.getParameter("search");
        List<Product> products=service.findByName(search);
        req.setAttribute("products",products);
        RequestDispatcher dispatcher = req.getRequestDispatcher("/product/list.jsp");
        try{
            dispatcher.forward(req,resp);
        } catch (ServletException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
    private void deleteProduct(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        service.remove(id);
        resp.sendRedirect("/products");
    }

    private void updateProduct(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        Product product = service.findById(id);
        String name = req.getParameter("name");
        double price = Double.parseDouble(req.getParameter("price"));
        String description = req.getParameter("description");
        String producer = req.getParameter("producer");
        product.setName(name);
        product.setPrice(price);
        product.setDescription(description);
        product.setProducer(producer);
        service.update(id,product);
        resp.sendRedirect("/products");
    }

    private void createProduct(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        int  id = service.getLastId()+1;
        String name = req.getParameter("name");
        double price = Double.parseDouble(req.getParameter("price"));
        String description = req.getParameter("description");
        String producer = req.getParameter("producer");
        Product product = new Product(id,name,price,description,producer);
        service.save(product);
       resp.sendRedirect("/products");
    }
}
