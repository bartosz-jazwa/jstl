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
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@WebServlet("/GetCookie")
public class GetCookieServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie[] cookies = req.getCookies();
        Map<String,String> names= Arrays.stream(cookies)
                .collect(Collectors.toMap(e-> e.getName(),v->v.getValue()));

        req.setAttribute("cookies",names);
        RequestDispatcher rd = req.getRequestDispatcher("cookiesNames.jsp");
        rd.forward(req,resp);
    }
}
