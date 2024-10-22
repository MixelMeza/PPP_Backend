package pe.edu.upeu.carrera.service;


import java.util.List;
import java.util.Optional;

import pe.edu.upeu.carrera.entity.Carrera;

public interface CarreraService {
	void create(Carrera c);
	void update(Carrera c);
	void delete(Long id);
	Optional<Carrera> read(Long id);
	List<Carrera> readAll();
}
