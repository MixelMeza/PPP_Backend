package pe.edu.upeu.pracway.Pracway.serviceImpl;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.pracway.Pracway.dao.TipoDao;
import pe.edu.upeu.pracway.Pracway.entity.Tipo;
import pe.edu.upeu.pracway.Pracway.service.TipoService;

@Service
public class TipoServiceImpl implements TipoService {

	@Autowired
	private TipoDao dao;

	@Override
	public void create(Tipo t) {
		// TODO Auto-generated method stub
		dao.create(t);
	}

	@Override
	public void update(Tipo t) {
		// TODO Auto-generated method stub
		dao.update(t);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		dao.delete(id);
	}

	@Override
	public Optional<Tipo> read(Long id) {
		// TODO Auto-generated method stub
		return dao.read(id);
	}

	@Override
	public List<Tipo> readAll() {
		// TODO Auto-generated method stub
		return dao.readAll();
	}

}
