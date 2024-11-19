package controlador;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

//Implementamos el path
@WebServlet("/servlet")

public class Servlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/html; charset=UTF-8");
        //obtenemos el metodo para realizar la peticion
        String metodoHttp = req.getMethod();
        //Obtenemos la Uri contextPath+servletPath
        String requestURI = req.getRequestURI();
        //obtenemos la URL completa
        String requestURL = req.getRequestURL().toString();
        //Obtenemos el nombre del proyecto
        String contextPath = req.getContextPath();
        //Obtenemos el path del servlet
        String servletPath = req.getServletPath();
        String ip = req.getLocalAddr();
        int port = req.getServerPort();
        String scheme = req.getScheme();
        String host=req.getHeader("host");
        String uel1="://"+host+":"+port+contextPath+servletPath;


        PrintWriter out = resp.getWriter();
        //Creo la plantilla html
        out.print("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<meta charset=\"utf-8\">");
        out.println("<title>Cabeceros</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Manejo Cabeceros </h1>");
        out.println("<ul>");
        out.println("<li>Método utilizado para la petición"+metodoHttp+"</li>");
        out.println("<li>Uri: "+requestURI+"</li>");
        out.println("<li>Uri: "+requestURI+"</li>");
        out.println("<li>Uri: "+requestURL+"</li>");
        out.println("<li>Uri: "+contextPath+"</li>");
        out.println("<li>Uri: "+ip+"</li>");
        out.println("<li>Uri: "+port+"</li>");
        out.println("<li>Uri: "+scheme+"</li>");
        out.println("<li>Uri: "+host+"</li>");
        out.println("<li>Uri: "+uel1+"</li>");
        out.println("</ul>");
        out.println("</body>");
        out.println("</html>");

    }
}
