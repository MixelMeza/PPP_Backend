package pe.edu.upeu.pracway.Pracway.service;

import java.util.List;
import java.util.Optional;

import pe.edu.upeu.pracway.Pracway.entity.Detalle_PPP;

public interface Detalle_PPPService {
	Detalle_PPP create(Detalle_PPP d);
	Detalle_PPP update(Detalle_PPP d);
	void delete(Long id);
	Optional<Detalle_PPP> read(Long id);
	List<Detalle_PPP> readAll();
}
