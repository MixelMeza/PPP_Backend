package pe.edu.upeu.pracway.Pracway.service;

import java.util.List;
import java.util.Optional;

import pe.edu.upeu.pracway.Pracway.entity.Estudiante;

public interface EstudianteService {
	Estudiante create(Estudiante e);
	Estudiante update(Estudiante e);
	void delete(Long id);
	Optional<Estudiante> read(Long id);
	List<Estudiante> readAll();
}
