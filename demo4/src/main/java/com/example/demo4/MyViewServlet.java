package com.example.demo4;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name="MyViewServlet" ,value ="/myView.do")
public class MyViewServlet extends HttpServlet {

  protected void doGet(HttpServletRequest request, HttpServletResponse response)
          throws ServletException, IOException {
    String url = "myViewPage.jsp";  // forward할 url

    // 사용자 처리

    RequestDispatcher rd = request.getRequestDispatcher(url);
    rd.forward(request, response);
  }

}
