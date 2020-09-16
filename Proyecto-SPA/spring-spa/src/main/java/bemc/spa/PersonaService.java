
package bemc.spa;
import java.util.List;

public interface PersonaService {
    List<Persona>listar();
    Persona listarId(int id);
    Persona add(Persona p);
    Persona editar(Persona p);
    Persona delete(int id);    
    
}
