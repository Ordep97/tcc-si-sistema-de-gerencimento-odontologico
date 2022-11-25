package tcc.si.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tcc.si.model.DadoUsuario;


@Repository
public interface DadoUsuarioRepository extends JpaRepository<DadoUsuario, Integer> {

}