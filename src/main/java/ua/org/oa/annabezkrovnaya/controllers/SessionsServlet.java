package ua.org.oa.annabezkrovnaya.controllers;


import ua.org.oa.annabezkrovnaya.dto.MovieDTO;
import ua.org.oa.annabezkrovnaya.service.impl.MovieServiceImpl;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "sessionsservlet", urlPatterns={"/sessions"})
public class SessionsServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        List<MovieDTO> movieDTOList2 = MovieServiceImpl.getInstance().getAll();
        request.setAttribute("movieDTOList2", movieDTOList2);
        request.getRequestDispatcher("pages/common/sessions.jsp").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        doPost(request, response);
    }
}
