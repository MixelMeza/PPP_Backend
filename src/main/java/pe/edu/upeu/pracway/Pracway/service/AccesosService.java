package pe.edu.upeu.pracway.Pracway.service;

import java.util.List;
import java.util.Optional;

import pe.edu.upeu.pracway.Pracway.entity.Accesos;

public interface AccesosService {
	void create(Accesos a);
	void update(Accesos a);
	void delete(Long id);
	Optional<Accesos> read(Long id);
	List<Accesos> readAll();
}
