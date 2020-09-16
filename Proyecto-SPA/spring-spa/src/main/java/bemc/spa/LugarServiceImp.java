package bemc.spa;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LugarServiceImp implements LugarService{
    
    @Autowired
    private LugarRepositorio repositorio;

    @Override
    public List<Lugar> listar() {
        return repositorio.findAll(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Lugar listarId(int id) {
       return repositorio.findById(id);  //To change body of generated methods, choose Tools | Templates.
    }
}