package pe.edu.upeu.pracway.Pracway.service;

import java.util.List;
import java.util.Optional;

import pe.edu.upeu.pracway.Pracway.entity.Evaluacion;

public interface EvaluacionService {
	Evaluacion create(Evaluacion e);
	Evaluacion update(Evaluacion e);
	void delete(Long id);
	Optional<Evaluacion> read(Long id);
	List<Evaluacion> readAll();
}
