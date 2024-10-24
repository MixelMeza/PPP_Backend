package pe.edu.upeu.pracway.Pracway.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.pracway.Pracway.entity.Supervisor_Empresarial;

@Repository
public interface Supervisor_EmpresarialRepository extends JpaRepository<Supervisor_Empresarial,Long>{
	

}
