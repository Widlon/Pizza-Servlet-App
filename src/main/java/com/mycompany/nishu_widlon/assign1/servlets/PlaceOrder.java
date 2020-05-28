/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.nishu_widlon.assign1.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.mycompany.nishu_widlon.assign1.model.PizzaOrder;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpSession;


/**
 *
 * @author nishu
 */
public class PlaceOrder extends HttpServlet {

    
   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
     response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
           /* TODO output your page here. You may use following sample code. */
            HttpSession session = request.getSession();
            String name = (String) session.getAttribute("name");
            String phone = (String) session.getAttribute("phone");

            PizzaOrder pizzaOrder = new PizzaOrder();
            request.setAttribute("PizzaOrder", pizzaOrder);

            String options = request.getParameter("pickupOrDelievery");
            pizzaOrder.setDelivery(options.equalsIgnoreCase("delivery"));

            String size = request.getParameter("size");
            pizzaOrder.setSize(size);

            String[] toppings = new String[]{};
            if (request.getParameterValues("toppings") == null) {
                toppings = new String[0];
            } else {
                toppings = request.getParameterValues("toppings");
            }

            pizzaOrder.setToppings(toppings);
            request.setAttribute("toppings", toppings);

            RequestDispatcher rd = request.getRequestDispatcher("displayOrder.jsp");
            rd.forward(request, response);

            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title></title>");
            out.println("</head>");
            out.println("<body>");
            out.println("</body>");
            out.println("</html>");
            


 

}}
}
