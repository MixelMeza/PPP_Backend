package pe.edu.upeu.pracway.Pracway.service;

import java.util.List;
import java.util.Optional;

import pe.edu.upeu.pracway.Pracway.entity.Dia;

public interface DiaService {
	Dia create(Dia d);
    Dia update(Dia d);
	void delete(Long id);
	Optional<Dia> read(Long id);
	List<Dia> readAll();
}
