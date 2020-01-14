package com.oracle.controllers;

import java.io.IOException;
import javax.servlet.*;
import javax.servlet.http.*;
import com.oracle.models.HelloWorldModel;

public class HelloWorldController extends HttpServlet {
  private static final long serialVersionUID = 1L;
       
    public HelloWorldController() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       // Modelの生成
       HelloWorldModel model = new HelloWorldModel();
       model.setMessage("Hello World !");

       // ViewへModelデータを渡す準備
       request.setAttribute("model", model);
    
       // Viewを表示
       getServletContext()
          .getRequestDispatcher("/HelloWorldView.jsp")
          .forward(request, response);
    }
}
