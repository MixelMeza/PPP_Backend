package pe.edu.upeu.pracway.Pracway.service;

import java.util.List;
import java.util.Optional;

import pe.edu.upeu.pracway.Pracway.entity.Supervisor_Empresarial;

public interface Supervisor_EmpresarialService {
	Supervisor_Empresarial create(Supervisor_Empresarial s);
	Supervisor_Empresarial update(Supervisor_Empresarial s);
	void delete(Long id);
	Optional<Supervisor_Empresarial> read(Long id);
	List<Supervisor_Empresarial> readAll();
}
