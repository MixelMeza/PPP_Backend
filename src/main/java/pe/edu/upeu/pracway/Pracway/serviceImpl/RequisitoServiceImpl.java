package pe.edu.upeu.pracway.Pracway.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.pracway.Pracway.dao.RequisitoDao;
import pe.edu.upeu.pracway.Pracway.entity.Requisito;
import pe.edu.upeu.pracway.Pracway.service.RequisitoService;

@Service
public class RequisitoServiceImpl implements RequisitoService {

	@Autowired
	private RequisitoDao dao;

	@Override
	public void create(Requisito r) {
		// TODO Auto-generated method stub
		dao.create(r);
	}

	@Override
	public void update(Requisito r) {
		// TODO Auto-generated method stub
		dao.update(r);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		dao.delete(id);
	}

	@Override
	public Optional<Requisito> read(Long id) {
		// TODO Auto-generated method stub
		return dao.read(id);
	}

	@Override
	public List<Requisito> readAll() {
		// TODO Auto-generated method stub
		return dao.readAll();
	}

}