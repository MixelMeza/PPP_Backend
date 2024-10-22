package pe.edu.upeu.linea.service;

import java.util.List;
import java.util.Optional;

import pe.edu.upeu.linea.entity.Linea;

public interface LineaService {
	void create(Linea l);
	void update(Linea l);
	void delete(Long id);
	Optional<Linea> read(Long id);
	List<Linea> readAll();

}
