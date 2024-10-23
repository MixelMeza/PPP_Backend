package pe.edu.upeu.pracway.Pracway.dao;

import java.util.List;
import java.util.Optional;

import pe.edu.upeu.pracway.Pracway.entity.Representante;

public interface RepresentanteDao {
	Representante create(Representante r);
	Representante update(Representante r);
	void delete(Long id);
	Optional<Representante> read(Long id);
	List<Representante> readAll();
}
