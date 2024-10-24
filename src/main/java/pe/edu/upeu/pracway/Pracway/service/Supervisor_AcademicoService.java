package pe.edu.upeu.pracway.Pracway.service;

import java.util.List;
import java.util.Optional;

import pe.edu.upeu.pracway.Pracway.entity.Supervisor_Academico;

public interface Supervisor_AcademicoService {
	Supervisor_Academico create(Supervisor_Academico s);
	Supervisor_Academico update(Supervisor_Academico s);
	void delete(Long id);
	Optional<Supervisor_Academico> read(Long id);
	List<Supervisor_Academico> readAll();
}
