package controlador;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import modelos.Clientes;
import servicios.ClientesServiceImplement;
import servicios.ClientesServices;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

//Anotación
@WebServlet({"/producto.xls","/productohtml"})

public class ClientesXls extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        ClientesServices servicios= new ClientesServiceImplement();
        List<Clientes> clientes= servicios.listar();
        resp.setContentType("text/html;charset=UTF-8");
        //OBTENER EL SERVLET PATH
        String servletpath = req.getServletPath();
        //crear una ariable de tipo booleano para ver que pat estoy obteniendo
        boolean xls=servletpath.equals(".xls");
        if (xls){
            resp.setContentType("application/vnd.ms-excel");
            resp.setHeader("Content-disposition", "attachment; filename=clientes.xls");
        }

        PrintWriter out = resp.getWriter();
        //ecribimos la respuesta en htnl
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<meta charset ='UTF-8'>");
        out.println("<title>Listado de Clientes</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Listado de Clientes</h1>");
        out.println("<p><a href=\""+req.getContextPath()+"/clientes.xls"+"\">Descargar.xls</a></p>");
        out.println("<table>");
        out.println("<tr>");
        out.println("<th>ID CLIENTE</th>");
        out.println("<th>NOMBRE</th>");
        out.println("<th>APELLIDO</th>");
        out.println("<th>EDAD</th>");
        out.println("<th>TELEFONO</th>");
        out.println("<th>GENERO</th>");
        out.println("</tr>");
        clientes.forEach(p->{
            out.println("<tr>");
            out.println("<td>" +p.getIdcliente()+"</td>");
            out.println("<td>" +p.getNombre()+"</td>");
            out.println("<td>" +p.getapellido()+"</td>");
            out.println("<td>" +p.getTelefono()+"</td>");
            out.println("</tr>");

        });
        out.println("</table>");
        out.println("</body>");
        out.println("</html>");

    }
}