package pe.edu.upeu.pracway.Pracway.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.pracway.Pracway.dao.Proceso_RequisitoDao;
import pe.edu.upeu.pracway.Pracway.entity.Proceso_Requisito;
import pe.edu.upeu.pracway.Pracway.service.Proceso_RequisitoService;

@Service
public class Proceso_RequisitoServiceImpl implements Proceso_RequisitoService {

	@Autowired
	private Proceso_RequisitoDao procesoRequisitoDao;

	@Override
	public Proceso_Requisito create(Proceso_Requisito p) {
		return procesoRequisitoDao.create(p);
	}

	@Override
	public Proceso_Requisito update(Proceso_Requisito p) {
		return procesoRequisitoDao.update(p);
	}

	@Override
	public void delete(Long id) {
		procesoRequisitoDao.delete(id);
	}

	@Override
	public Optional<Proceso_Requisito> read(Long id) {
		return procesoRequisitoDao.read(id);
	}

	@Override
	public List<Proceso_Requisito> readAll() {
		return procesoRequisitoDao.readAll();
	}
}
