/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Programa;
import modeldao.ProgramaDao;

/**
 *
 * @author APRENDIZ
 */
@WebServlet(name = "ControladorPrograma", urlPatterns = {"/ControladorPrograma"})
public class ControladorPrograma extends HttpServlet {

  String agregapro = "view/FPrograma.jsp";
  String listarpro = "view/Listarpro.jsp";
  Programa p = new Programa();
  ProgramaDao pdao = new ProgramaDao();
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ControladorPrograma</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ControladorPrograma at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String acceso="";
        String action=request.getParameter("accion");
        if(action.equalsIgnoreCase("listarpro"))
        {
            acceso=listarpro;
        }else if(action.equalsIgnoreCase("agregapro"))
        {
          acceso=agregapro;
        }
        if(action.equalsIgnoreCase("AgregarPro"))
        {
            int codp = Integer.parseInt(request.getParameter("txtcodpro"));
            String nompro = request.getParameter("txtnompro");
            p.setCodprograma(codp);
            p.setNomprograma(nompro);
            pdao.registrarpro(p);
            
            
        RequestDispatcher view=request.getRequestDispatcher(acceso);
        view.forward(request, response);
        }
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
