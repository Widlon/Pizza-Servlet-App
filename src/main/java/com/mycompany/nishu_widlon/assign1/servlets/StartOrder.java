/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.nishu_widlon.assign1.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class StartOrder extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
  response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
//           String name = request.getParameter("name");
//        String phone = request.getParameter("phone");
        
   HttpSession session = request.getSession();
       session.setAttribute("name",request.getParameter("name"));
       session.setAttribute("phone",request.getParameter("phone"));
       

        
        
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title></title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Hi"+"  "+session.getAttribute("name")+"</h1>");
            out.println("<h2>"+session.getAttribute("phone")+"</h2>");
            
            out.println("<form action='PlaceOrder' method='POST'>");
            
            out.println("Pick Up or Delivery <select name='pickupOrDelievery'>");
            out.println("<option value='Delivery'required>Delivery</option>");
            out.println("<option value='PickUp' required>Pick Up</option>");
            out.println("</select><br><br>");
            
            
            out.println("<input type='radio' name='size' value='Small' required> Small($5)");
            out.println("<input type='radio' name='size' value='Medium'required> Medium($7)");
            out.println("<input type='radio' name='size' value='Large' required> Large($9)<br><br>");
        
            out.println("<input type='checkbox' name='toppings' value='Pepporni'>Pepporni<br>");
            out.println("<input type='checkbox' name='toppings' value='Sausage'>Sausage<br>");
            out.println("<input type='checkbox' name='toppings' value='Baby Spinach'>Baby Spinach<br>");
            out.println("<input type='checkbox' name='toppings' value='Pepper'>Pepper<br>");
            out.println("<h1><input type='submit' value='Place Order'></h1>");

            out.println("</form>");
            out.println("</body>");
            out.println("</html>");    }

    }
}

