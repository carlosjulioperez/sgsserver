package ec.sgs.mobile.repository;

import ec.sgs.mobile.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
}
