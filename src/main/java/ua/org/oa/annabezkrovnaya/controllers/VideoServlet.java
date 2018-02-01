package ua.org.oa.annabezkrovnaya.controllers;

import ua.org.oa.annabezkrovnaya.dto.MovieDTO;
import ua.org.oa.annabezkrovnaya.service.impl.MovieServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "VideoServlet", urlPatterns={"/trailer"})
public class VideoServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        MovieDTO movieDTO2 = MovieServiceImpl.getInstance().getById(Integer.parseInt(request.getParameter("id")));
        request.setAttribute("movieDTO2", movieDTO2);
        request.getRequestDispatcher("pages/common/trailer.jsp").forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
