package com.codegym.model;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ProductDiscount extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String message;
        message = "\n" +
                "<html>\n" +
                "    <head>\n" +
                "        <title>Product Discount Calculator</title>\n" +
                "        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\" />\n" +
                "    </head>\n" +
                "    <body>\n" +
                "        <div id=\"content\">\n" +
                "            <h1>Product Discount Calculator</h1>\n" +
                "            <form method=\"post\" action=\"display\">\n" +
                "                <div id=\"data\">\n" +
                "                    <label>Product Description:</label>\n" +
                "                    <input type=\"text\" name=\"description\"/><br/>\n" +
                "                    <label>List Price:</label>\n" +
                "                    <input type=\"text\" value = \"0\" name=\"price\"/><br/>\n" +
                "                    <label>Discount Percent:</label>\n" +
                "                    <input type=\"text\" value = \"0\" name=\"discount_percent\"/>(%)<br/>\n" +
                "                </div>\n" +
                "                <div id=\"buttons\">\n" +
                "                    <label>&nbsp;</label>\n" +
                "                    <input type=\"submit\" value=\"Calculate Discount\"/>\n" +
                "                </div>\n" +
                "            </form>\n" +
                "        </div>\n" +
                "    </body>\n" +
                "</html>";
        resp.getOutputStream().println(message);
    }
}
