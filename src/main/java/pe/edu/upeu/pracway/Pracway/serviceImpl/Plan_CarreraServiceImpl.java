package pe.edu.upeu.pracway.Pracway.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.pracway.Pracway.dao.Plan_CarreraDao;
import pe.edu.upeu.pracway.Pracway.entity.Plan_Carrera;
import pe.edu.upeu.pracway.Pracway.service.Plan_CarreraService;

@Service
public class Plan_CarreraServiceImpl implements Plan_CarreraService{
	
	@Autowired
	private Plan_CarreraDao plan_carreraDao;
	
	@Override
	public Plan_Carrera create(Plan_Carrera p) {
		// TODO Auto-generated method stub
		return plan_carreraDao.create(p);
	}

	@Override
	public Plan_Carrera update(Plan_Carrera p) {
		// TODO Auto-generated method stub
		return plan_carreraDao.update(p);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		plan_carreraDao.delete(id);
	}

	@Override
	public Optional<Plan_Carrera> read(Long id) {
		// TODO Auto-generated method stub
		return plan_carreraDao.read(id);
	}

	@Override
	public List<Plan_Carrera> readAll() {
		// TODO Auto-generated method stub
		return plan_carreraDao.readAll();
	}

}
