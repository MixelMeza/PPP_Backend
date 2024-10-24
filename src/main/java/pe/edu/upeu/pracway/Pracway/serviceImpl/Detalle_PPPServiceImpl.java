package pe.edu.upeu.pracway.Pracway.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import pe.edu.upeu.pracway.Pracway.dao.Detalle_PPPDao;
import pe.edu.upeu.pracway.Pracway.entity.Detalle_PPP;
import pe.edu.upeu.pracway.Pracway.service.Detalle_PPPService;

public class Detalle_PPPServiceImpl implements Detalle_PPPService{
@Autowired
private Detalle_PPPDao detalle_PPPDao;
	@Override
	public Detalle_PPP create(Detalle_PPP d) {
		// TODO Auto-generated method stub
		return detalle_PPPDao.create(d);
	}

	@Override
	public Detalle_PPP update(Detalle_PPP d) {
		// TODO Auto-generated method stub
		return detalle_PPPDao.update(d);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		detalle_PPPDao.delete(id);
		
	}

	@Override
	public Optional<Detalle_PPP> read(Long id) {
		// TODO Auto-generated method stub
		return detalle_PPPDao.read(id);
	}

	@Override
	public List<Detalle_PPP> readAll() {
		// TODO Auto-generated method stub
		return detalle_PPPDao.readAll();
	}

}
