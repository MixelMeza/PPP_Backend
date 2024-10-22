package pe.edu.upeu.pracway.Pracway.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.pracway.Pracway.dao.AccesosDao;
import pe.edu.upeu.pracway.Pracway.entity.Accesos;
import pe.edu.upeu.pracway.Pracway.service.AccesosService;



@Service
public class AccesosServiceImpl implements AccesosService{
	@Autowired
	private AccesosDao dao;
	
	@Override
	public void create(Accesos a) {
		// TODO Auto-generated method stub
		dao.create(a);
	}

	@Override
	public void update(Accesos a) {
		// TODO Auto-generated method stub
		dao.update(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		dao.delete(id);
	}

	@Override
	public Optional<Accesos> read(Long id) {
		// TODO Auto-generated method stub
		return dao.read(id);
	}

	@Override
	public List<Accesos> readAll() {
		// TODO Auto-generated method stub
		return dao.readAll();
	}

}
