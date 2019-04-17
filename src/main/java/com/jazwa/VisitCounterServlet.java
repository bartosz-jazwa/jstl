package com.jazwa;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.Arrays;

@WebServlet("/visits")
public class VisitCounterServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        HttpSession session = req.getSession(true);
        Integer visitCount = new Integer(0);
        String visitCountKey = new String("visitCount");
        String userIDKey = new String("userID");
        String userID = new String("ABCD");

        String welcome;
        if (session.isNew() ){
            welcome = "Welcome to my website";
            session.setAttribute(userIDKey, userID);
            session.setAttribute(visitCountKey,  visitCount);
        }
        visitCount = (Integer)session.getAttribute(visitCountKey);
        visitCount = visitCount +1;
        userID = (String)session.getAttribute(userIDKey);
        session.setAttribute(visitCountKey,  visitCount);

        RequestDispatcher rd = req.getRequestDispatcher("counter.jsp");
        rd.forward(req,resp);
    }
}
