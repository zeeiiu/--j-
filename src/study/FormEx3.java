package study;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloWorld
 */
@WebServlet("/FormEx3") //@WebServlet ������ �ּ�
public class FormEx3 extends HttpServlet {
   private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FormEx3() {
        super();
        // TODO Auto-generated constructor stub
    }

   /**
    * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
    */
    //method="get"�� ��
   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      // TODO Auto-generated method stub
//      response.getWriter().append("Served at: ").append(request.getContextPath());
//      System.out.println("doGet() ..");
//      System.out.println(request.getRemoteAddr());
//      System.out.println(request.getRemoteHost());
//      
//      request.setCharacterEncoding("EUC-KR");
//      
//      //request ��û
//      String name = request.getParameter("name");
//      System.out.println(name);
//      
//      String id = request.getParameter("id");
//      System.out.println(id);
//      
//      //response ����
//      response.setContentType("text/html;, charset=EUC_KR");
//      PrintWriter writer = response.getWriter();
//      writer.println("<html><head></head><body>");
//      writer.println("���̵�: " + id + "<br>");
//      writer.println("�̸�: " + name + "<br>");
//      writer.println("</body></html>");
   }

   /**
    * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
    */
   //method="post"�� ��
   protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      System.out.println("doPost() ..");
      System.out.println(request.getRemoteAddr());
      System.out.println(request.getRemoteHost());
      
      request.setCharacterEncoding("UTF-8");
      
      //request ��û
      String name = request.getParameter("name");
      System.out.println(name);
      
      String id = request.getParameter("id");
      System.out.println(id);
      
      String[] hobbys = request.getParameterValues("hobby");
      String major = request.getParameter("major");
      
      //response ����
      response.setContentType("text/html; charset=UTF-8");
      PrintWriter writer = response.getWriter();
      writer.println("<html><head></head><body>");
      writer.println("���̵�: " + id + "<br>");
      writer.println("���: " + Arrays.toString(hobbys) + "<br>");
      writer.println("�̸�: " + name + "<br>");
      writer.println("����: " + major + "<br>");
      writer.println("</body></html>");
      
      doGet(request, response);
      
      
   }

}