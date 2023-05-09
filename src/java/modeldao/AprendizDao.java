
package modeldao;

import config.Conexion;
import interfaz.MeAprendiz;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.Aprendiz;


public class AprendizDao implements MeAprendiz{
Conexion cn=new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Aprendiz usu=new Aprendiz();
    @Override
    public Aprendiz list(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List listadoA() {
        ArrayList<Aprendiz> lista = new ArrayList<Aprendiz>();
        String sql = "select * from aprendiz";
        try{
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next())
            {
                Aprendiz usu = new Aprendiz();
                usu.setId(rs.getInt("id"));
                usu.setCodapred(rs.getInt("Docu"));
                usu.setNombreap(rs.getString("Nombrea"));
                usu.setApellidoap(rs.getString("Apellidoa"));
                usu.setEmailap(rs.getString("Correoa"));
                usu.setTeleap(rs.getInt("Numcontacto"));
                lista.add(usu);
                
            }
        }catch(Exception e)
        {
        }
        return lista;
    }   
public boolean registraap(Aprendiz ap) {
       String sql="insert into Aprendiz(Docu,Nombrea,Apellidoa,Correoa,Numcontacto)values('"+ap.getCodapred()+"','"+ap.getNombreap()+"','"+ap.getApellidoap()+"','"+ap.getEmailap()+"','"+ap.getTeleap()+"')"; 
        try{
          con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null,"Usuario registrado");
        }catch(Exception e)
        {
           JOptionPane.showMessageDialog(null,"Usuario ya esta registrado");
        }
        return false;
    }

    @Override
    public boolean actualizarap(Aprendiz ap) {
        String sql = "update Aprendiz set Docu='"+usu.getCodapred()+"',Nombrea='"+usu.getNombreap()+"',Apellidoa='"+usu.getApellidoap()+"',Correoa='"+usu.getEmailap()+"',Numcontacto='"+usu.getTeleap()+"' where id="+usu.getId();
        try{
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        }  catch (Exception e)  {
        }
        return false;  
    
    }

    @Override
    public boolean eliminarap(int id) {
        String sql="delete from aprendiz where id="+id;
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return false;
    
    }
    
    
}
