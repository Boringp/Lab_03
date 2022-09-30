package servlet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.Integer.parseInt;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author bo
 */
public class AgeCalculatorServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
     return;
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String message="";
       String num=request.getParameter("ages");
       if(num== null || num.equals("")){
            message="You must give your current age";
       }
       else{
       try{ int age =parseInt(num);
       message="Your age next birthday will be "+ (age+1);
       
       }
       catch(Exception e){
         message="You must enter a number.";
       }}
     
                  request.setAttribute("message", message);
            
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
        return;
    }

}
