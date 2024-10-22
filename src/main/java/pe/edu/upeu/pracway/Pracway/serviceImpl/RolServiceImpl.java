package pe.edu.upeu.pracway.Pracway.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.pracway.Pracway.dao.RolDao;
import pe.edu.upeu.pracway.Pracway.entity.Rol;
import pe.edu.upeu.pracway.Pracway.service.RolService;

@Service
public class RolServiceImpl implements RolService{

	@Autowired
	private RolDao rolDao;
	@Override
	public void create(Rol r) {
		// TODO Auto-generated method stub
		rolDao.create(r);
	}

	@Override
	public void update(Rol r) {
		// TODO Auto-generated method stub
		rolDao.update(r);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		rolDao.delete(id);
	}

	@Override
	public Optional<Rol> read(Long id) {
		// TODO Auto-generated method stub
		return rolDao.read(id);
	}

	@Override
	public List<Rol> readAll() {
		// TODO Auto-generated method stub
		return rolDao.readAll();
	}

}
