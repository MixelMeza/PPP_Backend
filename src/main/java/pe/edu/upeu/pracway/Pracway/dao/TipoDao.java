package pe.edu.upeu.pracway.Pracway.dao;

import java.util.List;
import java.util.Optional;

import pe.edu.upeu.pracway.Pracway.entity.Tipo;



public interface TipoDao {
	void create(Tipo t);
	void update(Tipo t);
	void delete(Long id);
	Optional<Tipo> read(Long id);
	List<Tipo> readAll();
}
