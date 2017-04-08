/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.AccountDAOImp;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Account;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author duonghan
 */
//@Controller
//@RequestMapping(value = "/index")
@WebServlet(urlPatterns = {"/login"})
public class LoginController extends HttpServlet {
//    @RequestMapping(value = "/index")
//    public String index(){
//        
//        return "jsp/index";
//    }

//       @RequestMapping(value = "/index", method = RequestMethod.GET)
//    public String index(ModelMap modelMap) {
//        modelMap.put("Account", new Account());
//        return "index";
//    }
    AccountDAOImp check = new AccountDAOImp();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        String email = (String) request.getParameter("username");
        String pass = (String) request.getParameter("password");

        // Đã login rồi thì chuyển tiếp sang /WEB-INF/views/userInfoView.jsp
        if (check.checkAccount(email, pass)) {
            request.setAttribute("Email", email);
            request.setAttribute("Password", pass);
            if (check.checkAdmin(email)) {
                RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/admin/index.jsp");
                dispatcher.forward(request, response);
            } else {
                RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/pages/success.jsp");
                dispatcher.forward(request, response);
            }

        } else {
            request.setAttribute("error", "Tài khoản hoặc mật khẩu không đúng");
            RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/pages/index.jsp");
            dispatcher.forward(request, response);
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }
}
