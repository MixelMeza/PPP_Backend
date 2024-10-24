package pe.edu.upeu.pracway.Pracway.service;

import java.util.List;
import java.util.Optional;

import pe.edu.upeu.pracway.Pracway.entity.Solicitud_PPP;

public interface Solicitud_PPPService {
	void create(Solicitud_PPP s);
	void update(Solicitud_PPP s);
	void delete(Long id);
	Optional<Solicitud_PPP> read(Long id);
	List<Solicitud_PPP> readAll();
}
