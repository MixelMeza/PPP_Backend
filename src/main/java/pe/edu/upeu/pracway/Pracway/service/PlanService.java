package pe.edu.upeu.plan.service;

import java.util.List;
import java.util.Optional;

import pe.edu.upeu.plan.entity.Plan;


public interface PlanService {
	void create(Plan p);
	void update(Plan p);
	void delete(Long id);
	Optional<Plan> read(Long id);
	List<Plan> readAll();
}
