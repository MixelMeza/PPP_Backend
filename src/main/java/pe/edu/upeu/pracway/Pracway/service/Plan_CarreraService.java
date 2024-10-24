package pe.edu.upeu.pracway.Pracway.service;

import java.util.List;
import java.util.Optional;

import pe.edu.upeu.pracway.Pracway.entity.Plan_Carrera;

public interface Plan_CarreraService {
	Plan_Carrera create(Plan_Carrera p);
	Plan_Carrera update(Plan_Carrera p);
	void delete(Long id);
	Optional<Plan_Carrera> read(Long id);
	List<Plan_Carrera> readAll();
}
