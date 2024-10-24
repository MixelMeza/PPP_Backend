package pe.edu.upeu.pracway.Pracway.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.pracway.Pracway.dao.EvaluacionDao;
import pe.edu.upeu.pracway.Pracway.entity.Evaluacion;
import pe.edu.upeu.pracway.Pracway.service.EvaluacionService;

@Service
public class EvaluacionServiceImpl implements EvaluacionService {

	@Autowired
	private EvaluacionDao evaluacionDao;

	@Override
	public Evaluacion create(Evaluacion e) {
		// TODO Auto-generated method stub
		return evaluacionDao.create(e);
	}

	@Override
	public Evaluacion update(Evaluacion e) {
		// TODO Auto-generated method stub
		return evaluacionDao.update(e);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		evaluacionDao.delete(id);
	}

	@Override
	public Optional<Evaluacion> read(Long id) {
		// TODO Auto-generated method stub
		return evaluacionDao.read(id);
	}

	@Override
	public List<Evaluacion> readAll() {
		// TODO Auto-generated method stub
		return evaluacionDao.readAll();
	}
}
