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
public class AgeCalculatorServlet extends HttpServlet {
    /**
     * 
     */
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        request.setAttribute("arithpage", "/CPRG#%@_Lab03/arithmetic);");
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
    }
    
    /**
     * 
     */
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String age = request.getParameter("age");
        request.setAttribute("arithpage", "/CPRG352_Lab03/arithmetic");
        if (age == null || age.trim().equals("")) {
            request.setAttribute("ageOfNextYear", "you must give your current age");        
            getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
            return;
        }else {
            try {
                int ageNum =Integer.parseInt(age);
                int ageNextYearNum = ageNum + 1;
                String ageOfNextYear = "Your age next birthday will be " + ageNextYearNum;
                request.setAttribute("ageOfNextYear", ageOfNextYear);
                getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
            }catch (Exception e){
                request.setAttribute("ageOfNextYear", "You must enter a number.");
                getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
                return;
            }
        }
    }
}