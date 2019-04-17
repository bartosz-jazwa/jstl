package com.jazwa;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.Optional;

@WebServlet("/Login")
public class LoginServlet extends HttpServlet {
private final String userValid = "bonaventura";
private final String passwordValid = "kurssda";
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie[] cookies = req.getCookies();
        if (cookies!=null){
            Optional<Cookie> cookie = Arrays.stream(cookies)
                    .filter(e -> e.getName().equals("isLogged"))
                    .findFirst();
            if (cookie.isPresent()){
                RequestDispatcher rd = req.getRequestDispatcher("panel.jsp");
                rd.forward(req,resp);
            }else {
                RequestDispatcher rd = req.getRequestDispatcher("login.jsp");
                rd.forward(req,resp);
            }
        }else {
            RequestDispatcher rd = req.getRequestDispatcher("login.jsp");
            rd.forward(req,resp);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String user = req.getParameter("username");
        String password = req.getParameter("pwd");

        if (user.equals(userValid) && password.equals(passwordValid)){
            Cookie cookie = new Cookie("isLogged", user);
            cookie.setMaxAge(30*60);
            resp.addCookie(cookie);
            resp.sendRedirect("/panel.jsp");
        }else {
            resp.sendRedirect("/login.jsp");
        }

    }
}
