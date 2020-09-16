package bemc.spa;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface LugarRepositorio extends CrudRepository<Lugar, Integer>{
    @Override
    List<Lugar>findAll();
    Lugar findById(int id);       
}
