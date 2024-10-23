package pe.edu.upeu.pracway.Pracway.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.pracway.Pracway.entity.Supervisor_Academico;
@Repository
public interface Supervisor_AcademicoRepository extends JpaRepository<Supervisor_Academico, Long> {

}
