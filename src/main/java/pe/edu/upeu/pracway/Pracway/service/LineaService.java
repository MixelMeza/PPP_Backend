package pe.edu.upeu.pracway.Pracway.service;

import java.util.List;
import java.util.Optional;

import pe.edu.upeu.pracway.Pracway.entity.Linea;



public interface LineaService {
	void create(Linea l);
	void update(Linea l);
	void delete(Long id);
	Optional<Linea> read(Long id);
	List<Linea> readAll();

}
