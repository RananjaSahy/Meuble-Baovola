/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller.insertion;

import connexion.Connexion;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import models.Categorie;
import models.Matiere;
import models.Style;
import models.Volume;

/**
 *
 * @author Sahy
 */
public class PreInsertionQuantiteMatiere extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        Connexion co = new Connexion();
        try{
            co.openAll();
            Categorie[] categories =new Categorie().find("idcategorie>0", co.getConnectionPostgres());
            Style[] styles =new Style().find("idstyle>0", co.getConnectionPostgres());
            Volume[] volumes =new Volume().find("idvolume>0", co.getConnectionPostgres());
            Matiere[] matieres = new Matiere().find("idmatiere>0", co.getConnectionPostgres());
                        
            request.setAttribute("categories", categories);
            request.setAttribute("styles", styles);
            request.setAttribute("volumes", volumes);
            request.setAttribute("matieres", matieres);
            this.getServletContext().getRequestDispatcher("/Insertion/quantiteMatiere.jsp").forward(request, response);
        }catch(Exception ex){
            ex.printStackTrace();
            out.print(ex);
            out.print("<a href='Layout/index.jsp'>Retour a l'accueil</a>");
        }finally{
            try{
                co.closeAll();
            }catch(Exception e){
                e.printStackTrace();
                out.print(e);
            }
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
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
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
