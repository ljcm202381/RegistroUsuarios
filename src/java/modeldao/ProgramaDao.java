/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modeldao;

import config.Conexion;
import interfaz.MePrograma;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import javax.swing.JOptionPane;
import model.Programa;

public class ProgramaDao implements MePrograma{
        Conexion cn = new Conexion();
        Programa po = new Programa();
        Connection con;
        PreparedStatement ps;
        ResultSet rs;
    @Override
    public Programa list(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List listadopro() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean registrarpro(Programa pro) {
       String sql= "insert into programa(codpro,nompro)values('"+pro.getCodprograma()+"','"+pro.getNomprograma()+"')";
       try{
          con=cn.getConnection();
          ps=con.prepareStatement(sql);
          ps.executeUpdate();
          JOptionPane.showMessageDialog(null,"Programa registrado");
       }catch(Exception e)
       {
           JOptionPane.showMessageDialog(null,"Programa no registrado");
       } 
       return false;
    }

    @Override
    public boolean actualizarpro(Programa pro) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean eliminarpro(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
