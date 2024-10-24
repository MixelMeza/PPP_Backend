package pe.edu.upeu.pracway.Pracway.service;

import java.util.List;
import java.util.Optional;

import pe.edu.upeu.pracway.Pracway.entity.Acceso;

public interface AccesoService {
	void create(Acceso a);
	void update(Acceso a);
	void delete(Long id);
	Optional<Acceso> read(Long id);
	List<Acceso> readAll();
	
	List<Acceso> findByRolNombre(String rol);
	boolean userHasAccessToUrl(String username, String url);
}
