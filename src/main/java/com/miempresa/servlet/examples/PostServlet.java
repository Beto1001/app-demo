package com.miempresa.servlet.examples;

import java.io.BufferedReader;
import java.io.IOException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/api/post/service")
public class PostServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws IOException {

        StringBuilder jsonBuilder = new StringBuilder();

        String myLine;

        try (BufferedReader reader = req.getReader()) {

            while ((myLine = reader.readLine()) != null) {

                jsonBuilder.append(myLine);

            }

        }

        String json = jsonBuilder.toString();

        System.out.println("JSON: myjson: {}" + json);

        res.setContentType("application/json");
        res.setCharacterEncoding("UTF-8");
        res.getWriter().write(json);
        

    }

}
