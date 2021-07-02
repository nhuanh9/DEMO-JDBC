package com.codegym.controller;

import com.codegym.dao.BlogDao;
import com.codegym.dao.IBlogDAO;
import com.codegym.model.Blog;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "BlogController", urlPatterns = "/blogs")
public class BlogController extends HttpServlet {
    private IBlogDAO blogDao = new BlogDao();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("blog/list.jsp");
        List<Blog> blogs = blogDao.findAll();
        request.setAttribute("listBlog", blogs);
        requestDispatcher.forward(request, response);


    }
}
