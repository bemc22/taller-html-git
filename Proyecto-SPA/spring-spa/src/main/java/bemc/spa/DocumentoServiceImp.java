package bemc.spa;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DocumentoServiceImp implements DocumentoService{
    
    @Autowired
    private DocumentoRepositorio repositorio;

    @Override
    public List<Documento> listar() {
        return repositorio.findAll(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Documento listarId(int id) {
       return repositorio.findById(id);  //To change body of generated methods, choose Tools | Templates.
    }
}