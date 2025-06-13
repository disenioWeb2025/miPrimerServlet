package com.mycompany.primerservlet.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;
import logica.Usuario;

@WebServlet(name = "SvUsuarios", urlPatterns = {"/SvUsuarios"})
public class SvUsuarios extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        List<Usuario> listaUsuarios = new ArrayList<>();
        listaUsuarios.add(new Usuario("1546","Pepe","Perez","123"));
        listaUsuarios.add(new Usuario("2484","Paco","Rodriguez","321"));
        listaUsuarios.add(new Usuario("3475","Leo","Cuenca","345"));
        HttpSession miSesion = request.getSession();
        miSesion.setAttribute("listaUsuarios", listaUsuarios);
        response.sendRedirect("mostrarUsuarios.jsp");
       
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
       String ci = request.getParameter("ci");
       String nombre = request.getParameter("nombre");
       String apellido = request.getParameter("apellido");
       String telefono = request.getParameter("telefono");
       
        System.out.println("ci:"+ci );
        System.out.println("nombre: "+nombre);
        System.out.println("apellido: "+apellido);
        System.out.println("teléfono: "+telefono);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
