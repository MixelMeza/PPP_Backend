package pe.edu.upeu.pracway.Pracway.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.pracway.Pracway.dao.PersonaDao;
import pe.edu.upeu.pracway.Pracway.entity.Persona;
import pe.edu.upeu.pracway.Pracway.service.PersonaService;

@Service
public class PersonaServiceImpl implements PersonaService {

	@Autowired
	private PersonaDao dao;

	@Override
	public void create(Persona p) {
		// TODO Auto-generated method stub
		dao.create(p);
	}

	@Override
	public void update(Persona p) {
		// TODO Auto-generated method stub
		dao.update(p);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		dao.delete(id);
	}

	@Override
	public Optional<Persona> read(Long id) {
		// TODO Auto-generated method stub
		return dao.read(id);
	}

	@Override
	public List<Persona> readAll() {
		// TODO Auto-generated method stub
		return dao.readAll();
	}

}
