
package com.proyecto.Bitacora.controller;

import com.proyecto.Bitacora.model.Objeto;
import com.proyecto.Bitacora.service.ObjetoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/objeto")
public class ObjetivoController {
    @Autowired 
    private ObjetoService objService; 
    
    @GetMapping("/traer")
    public List<Objeto> traerTodos(){
        return objService.traerTodos();
    }
    
    @PostMapping("/guardar")
    public void guardar(@RequestBody Objeto obj){
        objService.crear(obj);
    }
    
    @DeleteMapping("/borrar/{id}")
    public void borrar(@PathVariable Long id){
        objService.borrar(id);
    }
    
    @PutMapping("/editar/{id}")
    public void  editar(@PathVariable Long id,
                        @RequestBody Objeto obj){
        
        Objeto objeto = objService.traerUno(id);
        
        objeto = obj;
        
        objService.crear(objeto);
        
    }
}
