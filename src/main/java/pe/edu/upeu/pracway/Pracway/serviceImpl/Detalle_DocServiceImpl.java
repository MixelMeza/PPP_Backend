package pe.edu.upeu.pracway.Pracway.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.pracway.Pracway.dao.Detalle_DocDao;
import pe.edu.upeu.pracway.Pracway.entity.Detalle_Doc;
import pe.edu.upeu.pracway.Pracway.service.Detalle_DocService;

@Service
public class Detalle_DocServiceImpl implements Detalle_DocService {

	@Autowired
	private Detalle_DocDao detalle_docDao;

	@Override
	public Detalle_Doc create(Detalle_Doc d) {
		// TODO Auto-generated method stub
		return detalle_docDao.create(d);
	}

	@Override
	public Detalle_Doc update(Detalle_Doc d) {
		// TODO Auto-generated method stub
		return detalle_docDao.update(d);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		detalle_docDao.delete(id);
	}

	@Override
	public Optional<Detalle_Doc> read(Long id) {
		// TODO Auto-generated method stub
		return detalle_docDao.read(id);
	}

	@Override
	public List<Detalle_Doc> readAll() {
		// TODO Auto-generated method stub
		return detalle_docDao.readAll();
	}
	

}
