package pe.edu.upeu.pracway.Pracway.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.pracway.Pracway.entity.Representante;

@Repository
public interface RepresentanteRepository extends JpaRepository<Representante, Long> {

}
