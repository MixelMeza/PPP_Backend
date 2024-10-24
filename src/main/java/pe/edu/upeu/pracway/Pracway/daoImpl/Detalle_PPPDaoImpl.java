package pe.edu.upeu.pracway.Pracway.daoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import pe.edu.upeu.pracway.Pracway.dao.Detalle_PPPDao;
import pe.edu.upeu.pracway.Pracway.entity.Detalle_PPP;
import pe.edu.upeu.pracway.Pracway.repository.Detalle_PPPRepository;

public class Detalle_PPPDaoImpl implements Detalle_PPPDao{
@Autowired
private Detalle_PPPRepository detalle_PPPRepository;
	@Override
	public Detalle_PPP create(Detalle_PPP d) {
		// TODO Auto-generated method stub
		return detalle_PPPRepository.save(d);
	}

	@Override
	public Detalle_PPP update(Detalle_PPP d) {
		// TODO Auto-generated method stub
		return detalle_PPPRepository.save(d);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		detalle_PPPRepository.deleteById(id);
	}

	@Override
	public Optional<Detalle_PPP> read(Long id) {
		// TODO Auto-generated method stub
		return detalle_PPPRepository.findById(id);
	}

	@Override
	public List<Detalle_PPP> readAll() {
		// TODO Auto-generated method stub
		return detalle_PPPRepository.findAll();
	}

}
