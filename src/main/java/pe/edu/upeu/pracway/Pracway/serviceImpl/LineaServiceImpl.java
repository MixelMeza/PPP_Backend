package pe.edu.upeu.pracway.Pracway.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.pracway.Pracway.dao.LineaDao;
import pe.edu.upeu.pracway.Pracway.entity.Linea;
import pe.edu.upeu.pracway.Pracway.service.LineaService;

@Service
public class LineaServiceImpl implements LineaService {

	@Autowired
	private LineaDao dao;

	@Override
	public void create(Linea l) {
		// TODO Auto-generated method stub
		dao.create(l);

	}

	@Override
	public void update(Linea l) {
		// TODO Auto-generated method stub
		dao.update(l);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		dao.delete(id);
	}

	@Override
	public Optional<Linea> read(Long id) {
		// TODO Auto-generated method stub
		return dao.read(id);
	}

	@Override
	public List<Linea> readAll() {
		// TODO Auto-generated method stub
		return dao.readAll();
	}

}
