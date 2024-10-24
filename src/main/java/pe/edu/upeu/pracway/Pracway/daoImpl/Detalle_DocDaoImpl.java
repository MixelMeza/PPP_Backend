package pe.edu.upeu.pracway.Pracway.daoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import pe.edu.upeu.pracway.Pracway.entity.Detalle_Doc;
import pe.edu.upeu.pracway.Pracway.repository.Detalle_DocRepository;
import pe.edu.upeu.pracway.Pracway.dao.Detalle_DocDao;

@Component
public class Detalle_DocDaoImpl implements Detalle_DocDao{

	@Autowired
	private Detalle_DocRepository detalle_docRepository;
	
	@Override
	public Detalle_Doc create(Detalle_Doc d) {
		// TODO Auto-generated method stub
		return detalle_docRepository.save(d);
	}

	@Override
	public Detalle_Doc update(Detalle_Doc d) {
		// TODO Auto-generated method stub
		return detalle_docRepository.save(d);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		detalle_docRepository.deleteById(id);
	}

	@Override
	public Optional<Detalle_Doc> read(Long id) {
		// TODO Auto-generated method stub
		return detalle_docRepository.findById(id);
	}

	@Override
	public List<Detalle_Doc> readAll() {
		// TODO Auto-generated method stub
		return detalle_docRepository.findAll();
	}

}
