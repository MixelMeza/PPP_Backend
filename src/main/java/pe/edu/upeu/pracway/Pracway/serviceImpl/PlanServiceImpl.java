package pe.edu.upeu.plan.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import pe.edu.upeu.plan.dao.PlanDao;
import pe.edu.upeu.plan.entity.Plan;
import pe.edu.upeu.plan.service.PlanService;

public class PlanServiceImpl implements PlanService{
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
