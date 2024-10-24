package pe.edu.upeu.pracway.Pracway.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.pracway.Pracway.entity.Solicitud_PPP;

@Repository
public interface Solicitud_PPPRepository extends JpaRepository<Solicitud_PPP, Long>{

}
