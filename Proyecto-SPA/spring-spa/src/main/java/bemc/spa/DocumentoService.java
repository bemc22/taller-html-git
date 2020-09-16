package bemc.spa;
import java.util.List;

public interface DocumentoService {
    List<Documento>listar();   
    Documento listarId(int id);
    
}
