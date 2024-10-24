package pe.edu.upeu.pracway.Pracway.daoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import pe.edu.upeu.pracway.Pracway.dao.Solicitud_PPPDao;
import pe.edu.upeu.pracway.Pracway.entity.Solicitud_PPP;
import pe.edu.upeu.pracway.Pracway.repository.Solicitud_PPPRepository;

@Component
public class SolicitudDaoImpl implements Solicitud_PPPDao{

	@Autowired
	private Solicitud_PPPRepository solicitud_PPPRepository;
	
	@Override
	public Solicitud_PPP create(Solicitud_PPP s) {
		// TODO Auto-generated method stub
		return solicitud_PPPRepository.save(s);
	}

	@Override
	public Solicitud_PPP update(Solicitud_PPP s) {
		// TODO Auto-generated method stub
		return solicitud_PPPRepository.save(s);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		solicitud_PPPRepository.deleteById(id);
	}

	@Override
	public Optional<Solicitud_PPP> read(Long id) {
		// TODO Auto-generated method stub
		return solicitud_PPPRepository.findById(id);
	}

	@Override
	public List<Solicitud_PPP> readAll() {
		// TODO Auto-generated method stub
		return solicitud_PPPRepository.findAll();
	}

}
