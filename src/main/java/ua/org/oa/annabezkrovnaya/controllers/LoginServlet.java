package ua.org.oa.annabezkrovnaya.controllers;

import ua.org.oa.annabezkrovnaya.dto.UserDTO;
import ua.org.oa.annabezkrovnaya.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "LoginServlet", urlPatterns={"/login_page"})
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String login = request.getParameter("login");
        String password = request.getParameter("password");
        UserDTO userDTO = UserServiceImpl.getInstance().getByLogin(login);

        if(userDTO != null && userDTO.getPassword().equals(password)){
            request.getSession().setAttribute("user", userDTO);
            response.sendRedirect(request.getSession().getAttribute("url").toString());
        }else{
            request.getSession().setAttribute("message", "Неверный логин или пароль");
            response.sendRedirect(request.getContextPath() + "/pages/common/login_page.jsp");
        }


    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
