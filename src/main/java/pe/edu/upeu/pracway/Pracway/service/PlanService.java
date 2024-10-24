package pe.edu.upeu.pracway.Pracway.service;

import java.util.List;
import java.util.Optional;

import pe.edu.upeu.pracway.Pracway.entity.Plan;

public interface PlanService {
	void create(Plan p);
	void update(Plan p);
	void delete(Long id);
	Optional<Plan> read(Long id);
	List<Plan> readAll();
}
