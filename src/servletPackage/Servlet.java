package servletPackage;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Servlet", urlPatterns = {"/Servlet"})
public class Servlet extends HttpServlet implements javax.servlet.Servlet
{
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        response.setContentType("text/html");

        String result = "Wrong username or password !!!";

        if(request.getParameter("userName").equals("Nikolay") && request.getParameter("password").equals("1234"))
        {
            result = "You are logged in";
        }


        PrintWriter writer = response.getWriter();

        writer.println("<!DOCTYPE html>\n" +
                "\n" +
                "<html lang=\"en\">\n" +
                "\n" +
                "    <head>\n" +
                "        <meta charset=\"UTF-8\">\n" +
                "        <title>My Chat</title>\n" +
                "        <link href=\"css/styles.css\" rel=\"stylesheet\" type=\"text/css\">\n" +
                "    </head>\n" +
                "\n" +
                "    <body>\n" +
                "        <h1> Welcome to MY CHAT</h1>\n" +
                "        <br/><br/><br/><br/>\n" +
                "        <h2> "+ result +" </h2>" +
                "        <br/><br/><br/><br/><br/><br/>\n" +
                "        <foter>Copyright 2017. Made by Nikolay Kanchev</foter>\n" +
                "\n" +
                "    </body>\n" +
                "\n" +
                "</html>");
        writer.flush();

//                String city = request.getParameter("city");
//        String country = request.getParameter("country");
//
//        response.sendRedirect("https://www.google.dk/maps/place/"+ city +",+"+ country +"");

    }

//    public void doGet(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        response.setContentType("text/html");
//        PrintWriter out = response.getWriter();
//        out.println("<html>" +
//                "<head><title>My own Live-HTTP application</title></head>\n" +
//                "<center> <h1>Request Header<h1></center>" +
//                "<b>Request type: </b>" + request.getMethod() + "<br>\n" +
//                "<b>Request URI: </b>" + request.getRequestURI() + "<BR>\n" +
//                "<b>Request Protocol: </b>" + request.getProtocol() + "<br><br>");
//
//        Enumeration headerNames = request.getHeaderNames();
//        while(headerNames.hasMoreElements()) {
//            String headerName = (String) headerNames.nextElement();
//            out.println("<li><b>" + headerName + ": </b>" + request.getHeader(headerName));
//        }
//        out.println("</body></html>");
//    }
}