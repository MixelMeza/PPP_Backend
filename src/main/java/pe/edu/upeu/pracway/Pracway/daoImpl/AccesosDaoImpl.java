package pe.edu.upeu.pracway.Pracway.daoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import pe.edu.upeu.pracway.Pracway.dao.AccesosDao;
import pe.edu.upeu.pracway.Pracway.entity.Accesos;
import pe.edu.upeu.pracway.Pracway.repository.AccesosRepository;


@Component
public class AccesosDaoImpl implements AccesosDao{
	@Autowired
	private AccesosRepository accesosRepository;
	
	@Override
	public void create(Accesos a) {
		// TODO Auto-generated method stub
		accesosRepository.insertarAccesos(a.getAcceso(), a.getEstado());
	}

	@Override
	public void update(Accesos a) {
		// TODO Auto-generated method stub
		accesosRepository.actualizarAccesos(a.getId(), a.getAcceso(), a.getEstado());
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		accesosRepository.eliminarAccesos(id);
	}

	@Override
	public Optional<Accesos> read(Long id) {
		// TODO Auto-generated method stub
		return accesosRepository.findById(id);
	}

	@Override
	public List<Accesos> readAll() {
		// TODO Auto-generated method stub
		return accesosRepository.findAll();
	}
}
