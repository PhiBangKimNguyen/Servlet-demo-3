/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Phi N
 */
@WebServlet(name = "ArithmeticCalculatorServlet", urlPatterns = {"/ArithmeticCalculatorServlet"})
public class ArithmeticCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                .forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String first = request.getParameter("firstNumber");
        String second = request.getParameter("secondNumber");
        
        if (first == null || first.isEmpty() || second == null || second.isEmpty() 
                || !first.contains("[0-9]") || !second.contains("[0-9]")) {
            request.setAttribute("wrongResult", "invalid");
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                        .forward(request, response);
            return;
        }
        
        String choice = request.getParameter("button");
        int firstNumber = Integer.parseInt(first);
        int secondNumber = Integer.parseInt(second);
        int result;

        
        switch (choice) {
            case "+":
                result = firstNumber + secondNumber;
                request.setAttribute("result", result);
                getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                        .forward(request, response);
                break;               
            case "-":
                result = firstNumber - secondNumber;
                request.setAttribute("result", result);
                getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                        .forward(request, response);
                break;          
            case "*":
                result = firstNumber * secondNumber;
                request.setAttribute("result", result);
                getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                        .forward(request, response);
                break;               
            case "%":
                result = firstNumber / secondNumber;
                request.setAttribute("result", result);
                getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                        .forward(request, response);
                break;
        }
    }
}
