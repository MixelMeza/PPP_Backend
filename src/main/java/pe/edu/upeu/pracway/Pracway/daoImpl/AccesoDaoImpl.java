package pe.edu.upeu.pracway.Pracway.daoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import pe.edu.upeu.pracway.Pracway.dao.AccesoDao;
import pe.edu.upeu.pracway.Pracway.entity.Acceso;
import pe.edu.upeu.pracway.Pracway.repository.AccesoRepository;

@Component
public class AccesoDaoImpl implements AccesoDao{
	
	@Autowired
	private AccesoRepository accesoRepository;
	@Override
	public void create(Acceso a) {
		// TODO Auto-generated method stub
		accesoRepository.insertarAcceso(a.getAcceso(), a.getUrl(), a.getIcono(), a.getEstado());
	}

	@Override
	public void update(Acceso a) {
		// TODO Auto-generated method stub
		accesoRepository.actualizarAcceso(a.getId(),a.getAcceso(), a.getUrl(), a.getIcono(), a.getEstado());
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		accesoRepository.eliminarAcceso(id);
	}

	@Override
	public Optional<Acceso> read(Long id) {
		// TODO Auto-generated method stub
		return accesoRepository.findById(id);
	}

	@Override
	public List<Acceso> readAll() {
		// TODO Auto-generated method stub
		return accesoRepository.findAll();
	}

}
