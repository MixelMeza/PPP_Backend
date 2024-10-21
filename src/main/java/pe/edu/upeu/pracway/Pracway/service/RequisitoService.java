package pe.edu.upeu.pracway.Pracway.service;

import java.util.List;
import java.util.Optional;

import pe.edu.upeu.pracway.Pracway.entity.Requisito;

public interface RequisitoService {
	void create(Requisito r);
	void update(Requisito r);
	void delete(Long id);
	Optional<Requisito> read(Long id);
	List<Requisito> readAll();
}
