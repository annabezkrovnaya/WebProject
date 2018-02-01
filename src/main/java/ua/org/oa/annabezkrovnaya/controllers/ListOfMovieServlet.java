package ua.org.oa.annabezkrovnaya.controllers;

import ua.org.oa.annabezkrovnaya.dto.MovieDTO;
import ua.org.oa.annabezkrovnaya.service.impl.MovieServiceImpl;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "listofmovieservlet", urlPatterns={"/movies_l"})
public class ListOfMovieServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        List<MovieDTO> movieDTOList1 = MovieServiceImpl.getInstance().getAll();
        request.setAttribute("movieDTOList1", movieDTOList1);
        request.getRequestDispatcher("pages/common/movies_l.jsp").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        doPost(request, response);
    }
}
