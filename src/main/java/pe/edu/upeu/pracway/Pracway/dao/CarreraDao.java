package pe.edu.upeu.carrera.dao;

import java.util.List;
import java.util.Optional;

import pe.edu.upeu.carrera.entity.Carrera;

public interface CarreraDao {
	void create(Carrera c);
	void update(Carrera c);
	void delete(Long id);
	Optional<Carrera> read(Long id);
	List<Carrera> readAll();
}

