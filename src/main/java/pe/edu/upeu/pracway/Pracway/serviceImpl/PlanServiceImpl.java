package pe.edu.upeu.pracway.Pracway.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.pracway.Pracway.dao.PlanDao;
import pe.edu.upeu.pracway.Pracway.entity.Plan;
import pe.edu.upeu.pracway.Pracway.service.PlanService;

@Service
public class PlanServiceImpl implements PlanService {

	@Autowired
	private PlanDao dao;

	@Override
	public void create(Plan p) {
		// TODO Auto-generated method stub
		dao.create(p);
	}

	@Override
	public void update(Plan p) {
		// TODO Auto-generated method stub
		dao.update(p);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		dao.delete(id);
	}

	@Override
	public Optional<Plan> read(Long id) {
		// TODO Auto-generated method stub
		return dao.read(id);
	}

	@Override
	public List<Plan> readAll() {
		// TODO Auto-generated method stub
		return dao.readAll();
	}

}
