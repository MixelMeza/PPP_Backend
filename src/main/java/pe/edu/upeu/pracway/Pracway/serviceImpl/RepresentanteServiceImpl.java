package pe.edu.upeu.pracway.Pracway.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.pracway.Pracway.dao.RepresentanteDao;
import pe.edu.upeu.pracway.Pracway.entity.Representante;
import pe.edu.upeu.pracway.Pracway.service.RepresentanteService;

@Service
public class RepresentanteServiceImpl implements RepresentanteService {

	@Autowired
	private RepresentanteDao representanteDao;

	@Override
	public Representante create(Representante r) {
		// TODO Auto-generated method stub
		return representanteDao.create(r);
	}

	@Override
	public Representante update(Representante r) {
		// TODO Auto-generated method stub
		return representanteDao.update(r);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		representanteDao.delete(id);
	}

	@Override
	public Optional<Representante> read(Long id) {
		// TODO Auto-generated method stub
		return representanteDao.read(id);
	}

	@Override
	public List<Representante> readAll() {
		// TODO Auto-generated method stub
		return representanteDao.readAll();
	}
}
