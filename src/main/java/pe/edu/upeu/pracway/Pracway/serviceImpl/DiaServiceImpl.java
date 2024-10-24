package pe.edu.upeu.pracway.Pracway.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.pracway.Pracway.dao.DiaDao;
import pe.edu.upeu.pracway.Pracway.entity.Dia;
import pe.edu.upeu.pracway.Pracway.service.DiaService;

@Service
public class DiaServiceImpl implements DiaService {

	@Autowired
	private DiaDao diaDao;

	@Override
	public Dia create(Dia d) {
		// TODO Auto-generated method stub
		return diaDao.create(d);
	}

	@Override
	public Dia update(Dia d) {
		// TODO Auto-generated method stub
		return diaDao.update(d);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		diaDao.delete(id);
	}

	@Override
	public Optional<Dia> read(Long id) {
		// TODO Auto-generated method stub
		return diaDao.read(id);
	}

	@Override
	public List<Dia> readAll() {
		// TODO Auto-generated method stub
		return diaDao.readAll();
	}

}
