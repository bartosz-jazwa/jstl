package com.jazwa;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.*;

@WebServlet("/Game")
public class GameServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<String> questions = new ArrayList<>();
        questions.add("Kto Ty jesteś");
        questions.add("Jaki znak Twój");
        questions.add("Gdzie mieszkasz");
        questions.add("W jakim kraju");

        Map<String,List<String>> questionsAndAnswers = new HashMap<>();
        List<String> answers = new ArrayList<>();
        answers.add("Polak maly");
        answers.add("Cudak bialy");
        answers.add("Swoj");
        answers.add("Obcy");
        questionsAndAnswers.put(questions.get(0),answers);
        answers = new ArrayList<>();
        answers.add("Orzel bialy");
        answers.add("Polak maly");
        answers.add("Order bialy");
        answers.add("Krzyz swiety");
        questionsAndAnswers.put(questions.get(1),answers);
    }



}
