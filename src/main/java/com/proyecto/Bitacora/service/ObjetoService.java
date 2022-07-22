
package com.proyecto.Bitacora.service;

import com.proyecto.Bitacora.model.Objeto;
import com.proyecto.Bitacora.repository.ObjetoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ObjetoService implements IObjetoService{
    @Autowired
    private ObjetoRepository objetivoRepository;
    
    @Override
    public List<Objeto> traerTodos() {
        return objetivoRepository.findAll();
    }

    @Override
    public void crear(Objeto obj) {
        objetivoRepository.save(obj);
    }

    @Override
    public Objeto traerUno(Long id) {
        return objetivoRepository.findById(id).orElse(null);
    }

    @Override
    public void borrar(Long id) {
        objetivoRepository.deleteById(id);
    }
    
}
