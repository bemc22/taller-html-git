package bemc.spa;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaServiceImp implements PersonaService{
    
    @Autowired
    private PersonaRepositorio repositorio;

    @Override
    public List<Persona> listar() {
        return repositorio.findAll(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Persona listarId(int id) {
       return repositorio.findById(id);  //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Persona add(Persona p) {
        return repositorio.save(p); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Persona editar(Persona p) {
        return repositorio.save(p); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Persona delete(int id) {
        
        Persona p = repositorio.findById(id);
        if(p != null){
            repositorio.delete(p);
        }
        return p;
    }  
}
