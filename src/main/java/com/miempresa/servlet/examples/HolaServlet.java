package com.miempresa.servlet.examples;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.IOException;

@WebServlet("/api/saludo")
public class HolaServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws IOException {

        String nombre = req.getParameter("nombre");
        if (nombre == null || nombre.isBlank()) nombre = "Mundo";

        res.setContentType("application/json");
        res.setCharacterEncoding("UTF-8");
        res.getWriter().write("{\"mensaje\": \"¡Hola, " + nombre + "!\"}");
    }

    



}