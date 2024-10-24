package pe.edu.upeu.pracway.Pracway.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.pracway.Pracway.entity.Proceso_Requisito;

@Repository
public interface Proceso_RequisitoRepository extends JpaRepository<Proceso_Requisito, Long> {

}
