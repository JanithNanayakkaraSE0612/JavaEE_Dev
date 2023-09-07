package lk.ijse.jsp.servlet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

@WebServlet(urlPatterns = {"/cusotmer"})
public class CustomerServletAPI extends HttpServlet {
    public CustomerServletAPI(){
        System.out.println("Customer Sever Invoked");
    }
}
