package pe.edu.upeu.pracway.Pracway.dao;

import java.util.List;
import java.util.Optional;

import pe.edu.upeu.pracway.Pracway.entity.PPP;

public interface PPPDao {
	PPP create(PPP p);
	PPP update(PPP p);
	void delete(Long id);
	Optional<PPP> read(Long id);
	List<PPP> readAll();
}
