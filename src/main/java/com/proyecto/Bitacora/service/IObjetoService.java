
package com.proyecto.Bitacora.service;

import com.proyecto.Bitacora.model.Objeto;
import java.util.List;

public interface IObjetoService {
    public List<Objeto> traerTodos();
    
    public void crear(Objeto obj);
    
    public Objeto traerUno(Long id);
    
    public void borrar(Long id);
}
