package bemc.spa;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface DocumentoRepositorio extends CrudRepository<Documento, Integer>{
    @Override
    List<Documento>findAll();
    Documento findById(int id);       
}

