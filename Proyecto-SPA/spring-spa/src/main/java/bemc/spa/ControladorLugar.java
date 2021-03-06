package bemc.spa;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200" , maxAge = 3600)
@RestController
@RequestMapping({"/lugares"})  
public class ControladorLugar {    
    @Autowired
    LugarService service;    
    @GetMapping
    
    public List<Lugar>listar(){
        return service.listar();
        
    }    
    @PostMapping
    @GetMapping(path = {"/{id}"})
    
    public Lugar listarId(@PathVariable("id") int id){
        return service.listarId(id);
    }

}