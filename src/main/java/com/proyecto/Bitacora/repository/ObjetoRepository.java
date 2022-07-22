
package com.proyecto.Bitacora.repository;

import com.proyecto.Bitacora.model.Objeto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ObjetoRepository extends JpaRepository<Objeto, Long>{
    
}
