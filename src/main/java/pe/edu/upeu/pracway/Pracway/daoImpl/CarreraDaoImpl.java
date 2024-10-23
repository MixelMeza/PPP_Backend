package pe.edu.upeu.pracway.Pracway.daoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.pracway.Pracway.dao.CarreraDao;
import pe.edu.upeu.pracway.Pracway.entity.Carrera;
import pe.edu.upeu.pracway.Pracway.repository.CarreraRepository;


@Repository
public class CarreraDaoImpl implements CarreraDao {

	@Autowired
	private CarreraRepository carreraRepository;
	
	@Override
	public void create(Carrera c) {
        carreraRepository.insertarCarrera(c.getNombre(), c.getEstado());
		
	}

	@Override
	public void update(Carrera c) {
        carreraRepository.actualizarCarrera(c.getId(), c.getNombre(), c.getEstado());
		
	}

	@Override
	public void delete(Long id) {
        carreraRepository.eliminarCarrera(id);
		
	}

	@Override
	public Optional<Carrera> read(Long id) {
        return carreraRepository.findById(id); 

	}

	@Override
	public List<Carrera> readAll() {
		return carreraRepository.findAll();
	}

}
