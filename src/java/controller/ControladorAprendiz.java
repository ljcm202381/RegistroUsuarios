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
import model.Aprendiz;
import modeldao.AprendizDao;


@WebServlet(name = "ControladorAprendiz", urlPatterns = {"/ControladorAprendiz"})
public class ControladorAprendiz extends HttpServlet {

  String agregarapre = "index.jsp";
  String listarapre = "view/ListarA.jsp";
  String editarapre = "view/EditarA.jsp";
  
  
  Aprendiz ape = new Aprendiz();
  AprendizDao apedao = new AprendizDao();
  int id;
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ControladorAprendiz</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ControladorAprendiz at " + request.getContextPath() + "</h1>");
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
        if(action.equalsIgnoreCase("listar"))
        {
            acceso=listarapre;
        }else if(action.equalsIgnoreCase("agregarapre"))
        {
          acceso=agregarapre;
        }
       else if(action.equalsIgnoreCase("Agregar"))
        {
            int codapre = Integer.parseInt(request.getParameter("txtdoc"));
            String nombreapre = request.getParameter("txtNom");
            String apellidoapre = request.getParameter("txtApe");
            String emailapre = request.getParameter("txtemail");
            int teleapre = Integer.parseInt(request.getParameter("txttel"));
            ape.setCodapred(codapre);
            ape.setNombreap(nombreapre);
            ape.setApellidoap(apellidoapre);
            ape.setEmailap(emailapre);
            ape.setTeleap(teleapre);
            apedao.registraap(ape);
            acceso=listarapre;
        }else if(action.equalsIgnoreCase("eliminar")){  
            id=Integer.parseInt(request.getParameter("id"));
            ape.setId(id);
            apedao.eliminarap(id);
            acceso=listarapre;
        }else if(action.equalsIgnoreCase("editar"))
        {
            acceso=editarapre;
            
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
