package com.yong.exp4;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "firstServlet", value = "/first")
public class FirstServlet extends HttpServlet {
    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=utf-8");
        req.setCharacterEncoding("utf-8");
        String sno = req.getParameter("sno");
        String name = req.getParameter("name");
        Student student = new Student(sno, name);
        req.setAttribute("student", student);
        req.getRequestDispatcher("/second").forward(req, resp);
    }
}
