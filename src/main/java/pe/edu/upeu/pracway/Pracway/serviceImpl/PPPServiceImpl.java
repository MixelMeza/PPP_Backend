package pe.edu.upeu.pracway.Pracway.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.pracway.Pracway.dao.PPPDao;
import pe.edu.upeu.pracway.Pracway.entity.PPP;
import pe.edu.upeu.pracway.Pracway.service.PPPService;

@Service
public class PPPServiceImpl implements PPPService {

	@Autowired
	private PPPDao pppDao;

	@Override
	public PPP create(PPP p) {
		// TODO Auto-generated method stub
		return pppDao.create(p);
	}

	@Override
	public PPP update(PPP p) {
		// TODO Auto-generated method stub
		return pppDao.update(p);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		pppDao.delete(id);

	}

	@Override
	public Optional<PPP> read(Long id) {
		// TODO Auto-generated method stub
		return pppDao.read(id);
	}

	@Override
	public List<PPP> readAll() {
		// TODO Auto-generated method stub
		return pppDao.readAll();
	}

}
