package pe.edu.upeu.pracway.Pracway.daoImpl;
import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import pe.edu.upeu.pracway.Pracway.dao.Plan_CarreraDao;
import pe.edu.upeu.pracway.Pracway.entity.Plan_Carrera;
import pe.edu.upeu.pracway.Pracway.repository.Plan_CarreraRepository;

@Component
public class Plan_CarreraDaoImpl implements Plan_CarreraDao{
	
	@Autowired
	private Plan_CarreraRepository plan_carreraRepository;
	
	@Override
	public Plan_Carrera create(Plan_Carrera p) {
		// TODO Auto-generated method stub
		return plan_carreraRepository.save(p);
	}

	@Override
	public Plan_Carrera update(Plan_Carrera p) {
		// TODO Auto-generated method stub
		return plan_carreraRepository.save(p);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		plan_carreraRepository.deleteById(id);
	}

	@Override
	public Optional<Plan_Carrera> read(Long id) {
		// TODO Auto-generated method stub
		return plan_carreraRepository.findById(id);
	}

	@Override
	public List<Plan_Carrera> readAll() {
		// TODO Auto-generated method stub
		return plan_carreraRepository.findAll();
	}

}
