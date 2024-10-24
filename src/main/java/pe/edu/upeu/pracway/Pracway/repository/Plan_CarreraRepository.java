package pe.edu.upeu.pracway.Pracway.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.pracway.Pracway.entity.Plan_Carrera;

@Repository
public interface Plan_CarreraRepository extends JpaRepository<Plan_Carrera, Long> {

}
