package com.exp;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "employeeServlet", value = "/employee.do")
public class EmployeeServlet extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");

        String eno = request.getParameter("eno");
        String ename = request.getParameter("ename");
        String ecompany = request.getParameter("ecompany");
        EmployeeBean employee = new EmployeeBean();
        employee.setEno(eno);
        employee.setEname(ename);
        employee.setEcompany(ecompany);

        request.setAttribute("employee", employee);
        RequestDispatcher view =
                request.getRequestDispatcher("/displayEmployee.jsp");
        view.forward(request, response);
    }
}
