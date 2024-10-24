package pe.edu.upeu.pracway.Pracway.service;

import java.util.List;
import java.util.Optional;

import pe.edu.upeu.pracway.Pracway.entity.PPP;

public interface PPPService {
	PPP create(PPP p);
	PPP update(PPP p);
	void delete(Long id);
	Optional<PPP> read(Long id);
	List<PPP> readAll();
}
