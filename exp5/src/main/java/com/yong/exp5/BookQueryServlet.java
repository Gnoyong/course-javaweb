package com.yong.exp5;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "bookQuery", value = "/bookquery.do")
public class BookQueryServlet extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String bookid = request.getParameter("bookid");
        BookDAO bookdao = new BookDAO();
        BookBean book = bookdao.searchBook(bookid);

        if (book != null) {
            request.setAttribute("book", book);
            RequestDispatcher view = request.getRequestDispatcher("/display.jsp");
            view.forward(request, response);
        } else {
            RequestDispatcher view = request.getRequestDispatcher("/errorPage.jsp");
            view.forward(request, response);
        }
    }
}
