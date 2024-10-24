package pe.edu.upeu.pracway.Pracway.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.pracway.Pracway.entity.Detalle_Doc;

@Repository
public interface Detalle_DocRepository extends JpaRepository<Detalle_Doc, Long> {

}
