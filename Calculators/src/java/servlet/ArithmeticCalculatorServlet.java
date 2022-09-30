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
public class ArithmeticCalculatorServlet extends HttpServlet {
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setAttribute("message", "---");
    getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
     return;
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String message="---";
        String num1=request.getParameter("first");
        String num2=request.getParameter("second");
        
        int c;
       String num=request.getParameter("btnsubmit");
       
       if( num1 == null || num1.equals("") || num2 == null || num2.equals("") ){
           message="---";
       }else{
           try{
        int a=parseInt(num1);
        int b=parseInt(num2);
       if(num.equals("+")){
           c=a+b;
       }
       else if(num.equals("-")){
           c=a-b;
       }
       else if(num.equals("*")){
           c=a*b;
       }
       else{
           c=a%b;
       }
     message= Integer.toString(c);
       }
           catch(Exception e){
               message="invalid";
           }}
                  request.setAttribute("message", message);
                  request.setAttribute("First", num1);
                  request.setAttribute("Second", num2);
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
        return;
    }

}
