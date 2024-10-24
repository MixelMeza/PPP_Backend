package pe.edu.upeu.pracway.Pracway.dao;

import java.util.List;
import java.util.Optional;

import pe.edu.upeu.pracway.Pracway.entity.Detalle_Doc;

public interface Detalle_DocDao {

	Detalle_Doc create(Detalle_Doc d);
	Detalle_Doc update(Detalle_Doc d);
	void delete(Long id);
	Optional<Detalle_Doc> read(Long id);
	List<Detalle_Doc> readAll();
}
