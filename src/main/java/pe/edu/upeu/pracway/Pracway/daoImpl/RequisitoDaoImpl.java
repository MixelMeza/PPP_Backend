package pe.edu.upeu.pracway.Pracway.daoImpl;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import pe.edu.upeu.pracway.Pracway.dao.RequisitoDao;
import pe.edu.upeu.pracway.Pracway.entity.Requisito;
import pe.edu.upeu.pracway.Pracway.repository.RequisitoRepository;


@Component
public class RequisitoDaoImpl implements RequisitoDao {

	@Autowired
	private RequisitoRepository repository;
	
	@Override
	public void create(Requisito r) {
		// TODO Auto-generated method stub
	repository.insertarRequisito(r.getN_orden(),r.getNombre(),r.getTipo(),r.getEstado());
	}

	@Override
	public void update(Requisito r) {
		// TODO Auto-generated method stub
	repository.actualizarRequisito(r.getId(),r.getN_orden(),r.getNombre(),r.getTipo(),r.getEstado());
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		repository.eliminarRequisito(id);
	}

	@Override
	public Optional<Requisito> read(Long id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	@Override
	public List<Requisito> readAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

}
