package pe.edu.upeu.pracway.Pracway.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.pracway.Pracway.dao.AccesoDao;
import pe.edu.upeu.pracway.Pracway.entity.Acceso;
import pe.edu.upeu.pracway.Pracway.service.AccesoService;

@Service
public class AccesoServiceImpl implements AccesoService {

	@Autowired
	private AccesoDao accesoDao;

	@Override
	public void create(Acceso a) {
		// TODO Auto-generated method stub
		accesoDao.create(a);
	}

	@Override
	public void update(Acceso a) {
		// TODO Auto-generated method stub
		accesoDao.update(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		accesoDao.delete(id);
	}

	@Override
	public Optional<Acceso> read(Long id) {
		// TODO Auto-generated method stub
		return accesoDao.read(id);
	}

	@Override
	public List<Acceso> readAll() {
		// TODO Auto-generated method stub
		return accesoDao.readAll();
	}

	@Override
	public List<Acceso> findByRolNombre(String rol) {
		return accesoDao.findByRolNombre(rol);
	}

	@Override
	public boolean userHasAccessToUrl(String username, String url) {
		return accesoDao.userHasAccessToUrl(username, url);
	}
}
