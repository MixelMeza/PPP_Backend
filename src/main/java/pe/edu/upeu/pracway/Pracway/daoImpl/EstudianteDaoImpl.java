package pe.edu.upeu.pracway.Pracway.daoImpl;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import pe.edu.upeu.pracway.Pracway.dao.EstudianteDao;
import pe.edu.upeu.pracway.Pracway.entity.Estudiante;
import pe.edu.upeu.pracway.Pracway.repository.EstudianteRepository;

@Component
public class EstudianteDaoImpl implements EstudianteDao{
@Autowired
private EstudianteRepository estudianteRepository;
	@Override
	public Estudiante create(Estudiante e) {
		// TODO Auto-generated method stub
		return estudianteRepository.save(e);
	}

	@Override
	public Estudiante update(Estudiante e) {
		// TODO Auto-generated method stub
		return estudianteRepository.save(e);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		estudianteRepository.deleteById(id);
		
	}

	@Override
	public Optional<Estudiante> read(Long id) {
		// TODO Auto-generated method stub
		return estudianteRepository.findById(id);
	}

	@Override
	public List<Estudiante> readAll() {
		// TODO Auto-generated method stub
		return estudianteRepository.findAll();
	}

	
	

}
