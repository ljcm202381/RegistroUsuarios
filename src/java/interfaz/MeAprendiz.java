
package interfaz;

import java.util.List;
import model.Aprendiz;


public interface MeAprendiz 
{
    
    public Aprendiz list(int id);
    public List listadoA();
    public boolean registraap(Aprendiz ap);
    public boolean actualizarap(Aprendiz ap);
    public boolean eliminarap(int id);
    
}
