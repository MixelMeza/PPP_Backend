package pe.edu.upeu.pracway.Pracway.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.pracway.Pracway.dao.Solicitud_PPPDao;
import pe.edu.upeu.pracway.Pracway.entity.Solicitud_PPP;
import pe.edu.upeu.pracway.Pracway.service.Solicitud_PPPService;

@Service
public class Solicitud_PPPServiceImpl implements Solicitud_PPPService {

	@Autowired
	private Solicitud_PPPDao solicitud_PPPDao;
	
	@Override
	public void create(Solicitud_PPP s) {
		// TODO Auto-generated method stub
		solicitud_PPPDao.create(s);
	}

	@Override
	public void update(Solicitud_PPP s) {
		// TODO Auto-generated method stub
		solicitud_PPPDao.update(s);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		solicitud_PPPDao.delete(id);
	}

	@Override
	public Optional<Solicitud_PPP> read(Long id) {
		// TODO Auto-generated method stub
		return solicitud_PPPDao.read(id);
	}

	@Override
	public List<Solicitud_PPP> readAll() {
		// TODO Auto-generated method stub
		return solicitud_PPPDao.readAll();
	}

}
