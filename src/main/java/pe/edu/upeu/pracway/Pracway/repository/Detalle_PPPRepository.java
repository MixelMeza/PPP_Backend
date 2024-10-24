package pe.edu.upeu.pracway.Pracway.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.pracway.Pracway.entity.Detalle_PPP;

@Repository
public interface Detalle_PPPRepository extends JpaRepository<Detalle_PPP, Long> {

}
