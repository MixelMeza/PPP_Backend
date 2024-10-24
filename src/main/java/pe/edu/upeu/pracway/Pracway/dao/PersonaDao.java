package pe.edu.upeu.pracway.Pracway.dao;

import java.util.List;
import java.util.Optional;

import pe.edu.upeu.pracway.Pracway.entity.Persona;

public interface PersonaDao {
	void create(Persona p);
	void update(Persona p);
	void delete(Long id);
	Optional<Persona> read(Long id);
	List<Persona> readAll();
}
