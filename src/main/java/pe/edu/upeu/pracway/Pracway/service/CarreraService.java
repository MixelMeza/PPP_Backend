package pe.edu.upeu.pracway.Pracway.service;


import java.util.List;
import java.util.Optional;

import pe.edu.upeu.pracway.Pracway.entity.Carrera;

public interface CarreraService {
	void create(Carrera c);
	void update(Carrera c);
	void delete(Long id);
	Optional<Carrera> read(Long id);
	List<Carrera> readAll();
}
