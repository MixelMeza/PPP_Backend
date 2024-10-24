package pe.edu.upeu.pracway.Pracway.daoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import pe.edu.upeu.pracway.Pracway.dao.EvaluacionDao;
import pe.edu.upeu.pracway.Pracway.entity.Evaluacion;
import pe.edu.upeu.pracway.Pracway.repository.EvaluacionRepository;

@Component
public class EvaluacionDaoImpl implements EvaluacionDao{
	
	@Autowired
	private EvaluacionRepository evaluacionRepository;
	
	@Override
	public Evaluacion create(Evaluacion e) {
		// TODO Auto-generated method stub
		return evaluacionRepository.save(e);
	}

	@Override
	public Evaluacion update(Evaluacion e) {
		// TODO Auto-generated method stub
		return evaluacionRepository.save(e);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		evaluacionRepository.deleteById(id);
	}

	@Override
	public Optional<Evaluacion> read(Long id) {
		// TODO Auto-generated method stub
		return evaluacionRepository.findById(id);
	}

	@Override
	public List<Evaluacion> readAll() {
		// TODO Auto-generated method stub
		return evaluacionRepository.findAll();
	}
}
