package pe.edu.upeu.pracway.Pracway.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.pracway.Pracway.dao.EstudianteDao;
import pe.edu.upeu.pracway.Pracway.entity.Estudiante;
import pe.edu.upeu.pracway.Pracway.service.EstudianteService;

@Service
public class EstudianteServiceImpl implements EstudianteService {

	@Autowired
	private EstudianteDao estudianteDao;

	@Override
	public Estudiante create(Estudiante e) {
		// TODO Auto-generated method stub
		return estudianteDao.create(e);
	}

	@Override
	public Estudiante update(Estudiante e) {
		// TODO Auto-generated method stub
		return estudianteDao.update(e);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		estudianteDao.delete(id);
	}

	@Override
	public Optional<Estudiante> read(Long id) {
		// TODO Auto-generated method stub
		return estudianteDao.read(id);
	}

	@Override
	public List<Estudiante> readAll() {
		// TODO Auto-generated method stub
		return estudianteDao.readAll();
	}

}
