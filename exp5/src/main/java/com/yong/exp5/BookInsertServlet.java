package com.yong.exp5;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "bookInsert", value = "/bookinsert.do")
public class BookInsertServlet extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        request.setCharacterEncoding("utf-8");
        String message = null;
        BookBean book = new BookBean(
                request.getParameter("bookid"), request.getParameter("title"),
                request.getParameter("author"), request.getParameter("publisher"),
                Float.parseFloat(request.getParameter("price"))
        );
        BookDAO bookdao = new BookDAO();
        boolean success = bookdao.insertBook(book);
        if (success) {
            message = "成功插入一条记录！";
        } else {
            message = "插入记录错误！";
        }
        request.setAttribute("result", message);
        RequestDispatcher view = request.getRequestDispatcher("/BookInsert.jsp");
        view.forward(request, response);
    }
}
