package pe.edu.upeu.pracway.Pracway.service;

import java.util.List;
import java.util.Optional;

import pe.edu.upeu.pracway.Pracway.entity.Persona;



public interface PersonaService {
	void create(Persona p);
	void update(Persona p);
	void delete(Long id);
	Optional<Persona> read(Long id);
	List<Persona> readAll();
}