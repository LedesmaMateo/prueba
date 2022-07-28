
package com.proyecto.Bitacora.repository;

import com.proyecto.Bitacora.model.Usuario;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
    public Optional<Usuario> findByUsernameOrEmail(String username, String email);
}
