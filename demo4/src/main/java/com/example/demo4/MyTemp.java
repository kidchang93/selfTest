package com.example.demo4;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "MyTemp", value = "/MyTemp")
public class MyTemp extends HttpServlet{

  public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {


  }


}
