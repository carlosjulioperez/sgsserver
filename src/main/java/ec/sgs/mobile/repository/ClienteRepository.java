package ec.sgs.mobile.repository;

import ec.sgs.mobile.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long>{
}
