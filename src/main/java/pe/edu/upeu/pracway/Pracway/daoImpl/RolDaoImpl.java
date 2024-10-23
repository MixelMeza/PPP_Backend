package pe.edu.upeu.pracway.Pracway.daoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import pe.edu.upeu.pracway.Pracway.dao.RolDao;
import pe.edu.upeu.pracway.Pracway.entity.Rol;
import pe.edu.upeu.pracway.Pracway.repository.RolRepository;

@Component
public class RolDaoImpl implements RolDao{
	@Autowired
	private RolRepository rolRepository;
	@Override
	public void create(Rol r) {
		// TODO Auto-generated method stub
		rolRepository.insertarRol(r.getRol(), r.getEstado());
	}

	@Override
	public void update(Rol r) {
		// TODO Auto-generated method stub
		rolRepository.actualizarRol(r.getId(), r.getRol(), r.getEstado());
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		rolRepository.eliminarRol(id);
	}

	@Override
	public Optional<Rol> read(Long id) {
		// TODO Auto-generated method stub
		return rolRepository.findById(id);
	}

	@Override
	public List<Rol> readAll() {
		// TODO Auto-generated method stub
		return rolRepository.findAll();
	}

}
