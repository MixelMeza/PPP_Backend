package pe.edu.upeu.pracway.Pracway.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.pracway.Pracway.dao.UsuarioDao;
import pe.edu.upeu.pracway.Pracway.entity.Persona;
import pe.edu.upeu.pracway.Pracway.entity.Rol;
import pe.edu.upeu.pracway.Pracway.entity.Usuario;
import pe.edu.upeu.pracway.Pracway.repository.PersonaRepository;
import pe.edu.upeu.pracway.Pracway.service.UsuarioService;

@Service
public class UsuarioServiceImpl implements UsuarioService {

	@Autowired
	private UsuarioDao usuarioDao;

	@Autowired
	private PersonaRepository personaRepository;

	@Override
	public Usuario create(Usuario usuario) {
		try {
			// Verifica si ya existe un usuario con el mismo nombre de usuario
			Optional<Usuario> existingUsuario = usuarioDao.findByUsuario(usuario.getUsuario());
			if (existingUsuario.isPresent()) {
				throw new RuntimeException("El nombre de usuario ya existe.");
			}

			if (usuario.getPersona() != null && usuario.getPersona().getId() != null) {
				Persona persona = personaRepository.findById(usuario.getPersona().getId())
						.orElseThrow(() -> new RuntimeException("Persona no encontrada"));
				usuario.setPersona(persona);
			}

			// Guardar el nuevo usuario
			return usuarioDao.create(usuario);
		} catch (Exception e) {
			throw new RuntimeException("Error al crear el usuario.", e);
		}
	}

	@Override
	public Usuario update(Usuario usuario) {
		return usuarioDao.update(usuario);
	}

	@Override
	public void delete(Long id) {
		usuarioDao.delete(id);
	}

	@Override
	public Optional<Usuario> read(Long id) {
		return usuarioDao.read(id);
	}

	@Override
	public List<Usuario> readAll() {
		return usuarioDao.readAll();
	}

	// Métodos relacionados con roles
	@Override
	public void asignarRolAUsuario(Long idUsuario, Long idRol) {
		usuarioDao.asignarRolAUsuario(idUsuario, idRol);
	}

	@Override
	public void eliminarRolDeUsuario(Long idUsuario, Long idRol) {
		usuarioDao.eliminarRolDeUsuario(idUsuario, idRol);
	}

	@Override
	public List<Rol> obtenerRolesDeUsuario(Long idUsuario) {
		return usuarioDao.obtenerRolesDeUsuario(idUsuario);
	}

	@Override
	public void eliminarTodosLosRolesDeUsuario(Long idUsuario) {
		usuarioDao.eliminarTodosLosRolesDeUsuario(idUsuario);
	}

	@Override
	public Optional<Usuario> findByUsuario(String usuario) {
		// TODO Auto-generated method stub
		return usuarioDao.findByUsuario(usuario);
	}

}
