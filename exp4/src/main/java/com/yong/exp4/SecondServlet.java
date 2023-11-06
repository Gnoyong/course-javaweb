package com.yong.exp4;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "SecondServlet", value = "/second")
public class SecondServlet extends HttpServlet {
    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=utf-8");
        req.setCharacterEncoding("utf-8");
        Student student = (Student) req.getAttribute("student");
        PrintWriter writer = resp.getWriter();
        writer.println("<p>" + "学号：" + student.getSno() + "</p>");
        writer.println("<p>" + "姓名：" + student.getName() + "</p>");
        writer.println("<a href=\"" + req.getContextPath() + "/input_student.html\">back</a>");
    }
}
