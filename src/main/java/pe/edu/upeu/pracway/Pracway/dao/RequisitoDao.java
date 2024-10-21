package pe.edu.upeu.pracway.Pracway.dao;

import java.util.List;
import java.util.Optional;

import pe.edu.upeu.pracway.Pracway.entity.Requisito;

public interface RequisitoDao {
	void create(Requisito r);
	void update(Requisito r);
	void delete(Long id);
	Optional<Requisito> read(Long id);
	List<Requisito> readAll();
}