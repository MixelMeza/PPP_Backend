package pe.edu.upeu.pracway.Pracway.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.pracway.Pracway.dao.Supervisor_AcademicoDao;
import pe.edu.upeu.pracway.Pracway.entity.Supervisor_Academico;
import pe.edu.upeu.pracway.Pracway.service.Supervisor_AcademicoService;

@Service
public class Supervisor_AcademicoServiceImpl implements Supervisor_AcademicoService {

	@Autowired
	private Supervisor_AcademicoDao dao;

	@Override
	public Supervisor_Academico create(Supervisor_Academico s) {
		return dao.create(s);
	}

	@Override
	public Supervisor_Academico update(Supervisor_Academico s) {
		return dao.update(s);
	}

	@Override
	public void delete(Long id) {
		dao.delete(id);
	}

	@Override
	public Optional<Supervisor_Academico> read(Long id) {
		return dao.read(id);
	}

	@Override
	public List<Supervisor_Academico> readAll() {
		return dao.readAll();
	}
}
