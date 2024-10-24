package pe.edu.upeu.pracway.Pracway.dao;

import java.util.List;
import java.util.Optional;

import pe.edu.upeu.pracway.Pracway.entity.Proceso;

public interface ProcesoDao {
	void create(Proceso a);
	void update(Proceso a);
	void delete(Long id);
	Optional<Proceso> read(Long id);
	List<Proceso> readAll();
}

