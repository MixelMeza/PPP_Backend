package pe.edu.upeu.pracway.Pracway.daoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import pe.edu.upeu.pracway.Pracway.dao.PersonaDao;
import pe.edu.upeu.pracway.Pracway.entity.Persona;
import pe.edu.upeu.pracway.Pracway.repository.PersonaRepository;



@Component
public class PersonaDaoImpl implements PersonaDao{
	
	@Autowired
	private PersonaRepository personaRepository;
	
	@Override
	public void create(Persona p) {
		// TODO Auto-generated method stub
		personaRepository.insertarPersona(p.getNombre(), p.getApellido(), p.getCorreo(), p.getTelefono(), p.getDni(), p.getEstado());
	}

	@Override
	public void update(Persona p) {
		// TODO Auto-generated method stub
		personaRepository.actualizarPersona(p.getId(), p.getNombre(), p.getApellido(), p.getCorreo(), p.getTelefono(), p.getDni(), p.getEstado());;
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		personaRepository.eliminarPersona(id);;
	}

	@Override
	public Optional<Persona> read(Long id) {
		// TODO Auto-generated method stub
		return personaRepository.findById(id);
	}

	@Override
	public List<Persona> readAll() {
		// TODO Auto-generated method stub
		return personaRepository.findAll();
	}
}
