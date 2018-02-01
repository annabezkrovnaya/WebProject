package ua.org.oa.annabezkrovnaya.controllers;

import ua.org.oa.annabezkrovnaya.dto.CinemaDTO;
import ua.org.oa.annabezkrovnaya.service.impl.CinemaServiceImpl;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "cinemaservlet", urlPatterns={"/cinema"})
public class CinemaServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        CinemaDTO cinemaDTO = CinemaServiceImpl.getInstance().getById(1);
        request.setAttribute("cinemaDTO", cinemaDTO);
        request.getRequestDispatcher("pages/common/cinema.jsp").forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
