package bemc.spa;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface PersonaRepositorio extends CrudRepository<Persona, Integer>{
    @Override
    List<Persona>findAll();
    Persona findById(int id);    
    @Override
    Persona save(Persona p);
    @Override
    void delete(Persona p);  
    
}
