package tcc.si.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tcc.si.model.Consulta;

@Repository
public interface ConsultaRepository extends JpaRepository<Consulta, Integer> {
}
