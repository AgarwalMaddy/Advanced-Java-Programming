import java.io.IOException;

import java.io.PrintWriter;


import javax.servlet.ServletException;

import javax.servlet.annotation.WebServlet;

import javax.servlet.http.HttpServlet;

import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletResponse;




/**

 * Servlet implementation class LoginServlet

 */

@WebServlet("Java Resources/src/main/java/default package/File2.java")

public class File2 extends HttpServlet {

    private static final long serialVersionUID = 1L;




    /**

     * Default constructor.

     */

    public File2() {

        // TODO Auto-generated constructor stub

    }




    /**

     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)

     */

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // TODO Auto-generated method stub

        response.getWriter().append("Served at: ").append(request.getContextPath());

    }




    /**

     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)

     */

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // TODO Auto-generated method stub

        // read form fields

        String username = request.getParameter("pName");

        String password = request.getParameter("pPassword");



        System.out.println("Username: " + username);

        System.out.println("Password: " + password);



        // do some processing here...



        // get response writer

        PrintWriter writer = response.getWriter();



        // build HTML code

        String htmlRespone = "<html>";

        htmlRespone += "<h2>Your username is: " + username + "<br/>";

        htmlRespone += "Your password is: " + password + "</h2>";

        htmlRespone += "</html>";



        // return response

        writer.println(htmlRespone);

        doGet(request, response);

    }




}

