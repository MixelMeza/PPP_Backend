package pe.edu.upeu.pracway.Pracway.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.pracway.Pracway.dao.CarreraDao;
import pe.edu.upeu.pracway.Pracway.entity.Carrera;
import pe.edu.upeu.pracway.Pracway.service.CarreraService;

@Service
public class CarreraServiceImpl implements CarreraService {

	@Autowired
	private CarreraDao dao;

	@Override
	public void create(Carrera c) {
		// TODO Auto-generated method stub
		dao.create(c);
	}

	@Override
	public void update(Carrera c) {
		// TODO Auto-generated method stub
		dao.update(c);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		dao.delete(id);
	}

	@Override
	public Optional<Carrera> read(Long id) {
		// TODO Auto-generated method stub
		return dao.read(id);
	}

	@Override
	public List<Carrera> readAll() {
		// TODO Auto-generated method stub
		return dao.readAll();
	}

}
