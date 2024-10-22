package pe.edu.upeu.plan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;

import pe.edu.upeu.plan.entity.Plan;

public interface PlanRepository extends JpaRepository<Plan, Long>{
	 @Procedure(procedureName = "sp_insertar_plan")
	    void insertarPlan(String p_plan, char p_estado);

	    @Procedure(procedureName = "sp_editar_plan")
	    void actualizarPlan(Long p_id, String p_plan, char p_estado);

	    @Procedure(procedureName = "sp_eliminar_plan")
	    void eliminarPlan(Long p_id);

}
