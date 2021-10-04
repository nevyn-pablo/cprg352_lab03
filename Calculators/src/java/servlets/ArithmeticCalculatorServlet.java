/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 *
 * @author 849961
 */
public class ArithmeticCalculatorServlet extends HttpServlet {
    /**
     * 
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException 
     */
    
    @Overrride
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("otherpage", "/CPRG352_Lab03/age");
        getServletContext().getRequestDispatcher("/WEB-INF/arhimeticcalculator.jsp").forward(request, response);
    }
    
    /**
     * 
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException 
     */
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String first = request.getParameter("first");
        String second = request.getParameter("second");
        String method = request.getParameter("calculate");
        String resultText = "Result: ";
        String result = "---";
        request.setAttribute("otherpage", "/CPRG352_Lab03/age");
        double num = 0;
        try{
            double firstNum = Double.parseDouble(first);
            double secondNum = Double.parseDouble(second);
            
            if(method.equals("+")){
                num =firstNum + secondNum;
            }else if(method.equals("-")){
                num=firstNum - secondNum;
            }else if(method.equals("*")){
                num=firstNum * secondNum;
            }else if(method.equals("%")){
                num=firstNum % secondNum;
            }
            result = resultText + num;
            request.setAttribute("result", result);
        }
        catch(Exception e){
            request.setAttribute("result", "Result: invalid");
        }
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
        
    }
}