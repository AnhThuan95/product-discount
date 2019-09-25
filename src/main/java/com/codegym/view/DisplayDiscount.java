package com.codegym.view;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class DisplayDiscount extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String description = req.getParameter("description");
        float price = Float.parseFloat(req.getParameter("price"));
        float discount_percent = Float.parseFloat(req.getParameter("discount_percent"));

        float discount_amount = (float) (price * discount_percent * 0.01);
        float discount_price = price - discount_amount;
        String percent = "%";

        String message = String.format("<html>\n" +
                "<head>\n" +
                "    <title>Product Discount Calculator</title>\n" +
                "    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\" />\n" +
                "</head>\n" +
                "<body>\n" +
                "<div id=\"content\">\n" +
                "    <h1>Product Discount Calculator</h1>\n" +
                "    <label>Product Description: </label>\n" +
                "    <span>%s</span><br/>\n" +
                "    <label>Price: </label>\n" +
                "    <span>%.1f $</span><br/>\n" +
                "    <label>Discount Percent: </label>\n" +
                "    <span>%.2f %s</span><br/>\n" +
                "    <label>Discount Amount: </label>\n" +
                "    <span>%.1f $</span><br/>\n" +
                "    <label>Discount Price: </label>\n" +
                "    <span>%.1f $</span><br/>\n" +
                "</div>\n" +
                "</body>\n" +
                "</html>", description, price, discount_percent, percent, discount_amount, discount_price);
        resp.getOutputStream().println(message);
    }
}
