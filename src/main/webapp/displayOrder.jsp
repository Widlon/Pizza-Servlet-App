<%-- 
    Document   : displayOrder
    Created on : May 28, 2020, 5:54:01 PM
    Author     : nishu
--%>

<%@page import="com.mycompany.nishu_widlon.assign1.model.PizzaOrder"%>
<%@page import="java.util.jar.Attributes.Name"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>


        <%  String name = (String) session.getAttribute("name"); %>
        <%  String phone = (String) session.getAttribute("phone"); %>

        <% PizzaOrder pizzaOrder = (PizzaOrder) request.getAttribute("PizzaOrder"); %> 

        <% out.println("<h1>Pizza Order for"+" " + name + "</h1>"); %>
        <% out.println("<h1>" + phone +" "+ "total"+" " + pizzaOrder.getPrice() + "</h1>"); %>
        <% String[] toppings = (String[]) request.getAttribute("toppings"); %>
        <% if (pizzaOrder.isDelivery()) { %>
        <% out.println("Your Pizza will be delivered within 40 minutes <br><br> "); %>
        <% } else {
                      out.println("Your Pizza will be ready for pickup in 20 minutes<br><br>");
                  }%>
        <% out.println(pizzaOrder.getSize()+" " + "with<br><br>"); %>

        <% for (int i = 0; i < toppings.length; i++) { %>
        <% out.print(toppings[i].toString()+"<br><br>");
                 }%>

        <% if (pizzaOrder.getToppings() == null) {%>
        <% out.println("No Toppings");
                  }%>

    </body>
</html>
