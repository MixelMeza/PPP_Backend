package pe.edu.upeu.pracway.Pracway.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.pracway.Pracway.dao.ProcesoDao;
import pe.edu.upeu.pracway.Pracway.entity.Proceso;
import pe.edu.upeu.pracway.Pracway.service.ProcesoService;


@Service
public class ProcesoServiceImpl implements ProcesoService {

	@Autowired
	private ProcesoDao dao;
	
	@Override
	public void create(Proceso u) {
		// TODO Auto-generated method stub
		 dao.create(u);
	}

	@Override
	public void update(Proceso u) {
		// TODO Auto-generated method stub
		 dao.update(u);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		dao.delete(id);
	}

	@Override
	public Optional<Proceso> read(Long id) {
		// TODO Auto-generated method stub
		return dao.read(id);
	}

	@Override
	public List<Proceso> readAll() {
		// TODO Auto-generated method stub
		return dao.readAll();
	}

}