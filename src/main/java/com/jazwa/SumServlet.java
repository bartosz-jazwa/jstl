package com.jazwa;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

@WebServlet("/Sum")
public class SumServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Map<String,String[]> paramsMap = req.getParameterMap();
        AtomicInteger counter = new AtomicInteger();


        paramsMap.forEach((s, strings) -> Arrays.stream(strings).forEach(st -> {
                try {
                    counter.addAndGet(Integer.parseInt(st));
                }catch (NumberFormatException e){
                    ;
                }
            })
        );

    }
}
