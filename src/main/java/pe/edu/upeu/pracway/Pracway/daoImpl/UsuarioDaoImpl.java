package pe.edu.upeu.pracway.Pracway.daoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import pe.edu.upeu.pracway.Pracway.dao.UsuarioDao;
import pe.edu.upeu.pracway.Pracway.entity.Rol;
import pe.edu.upeu.pracway.Pracway.entity.Usuario;
import pe.edu.upeu.pracway.Pracway.repository.UsuarioRepository;

@Component
public class UsuarioDaoImpl implements UsuarioDao {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
	public Usuario create(Usuario usuario) {
		// TODO Auto-generated method stub
		return usuarioRepository.save(usuario);
	}

    @Override
    public Usuario update(Usuario usuario) {
        return usuarioRepository.save(usuario); 
    }

    @Override
    public void delete(Long id) {
        usuarioRepository.deleteById(id);  
    }

    @Override
    public Optional<Usuario> read(Long id) {
        return usuarioRepository.findById(id); 
    }

    @Override
    public List<Usuario> readAll() {
        return usuarioRepository.findAll(); 
    }

    @Override
    public void asignarRolAUsuario(Long idUsuario, Long idRol) {
        usuarioRepository.asignarRolAUsuario(idUsuario, idRol);
    }

    @Override
    public void eliminarRolDeUsuario(Long idUsuario, Long idRol) {
        usuarioRepository.eliminarRolDeUsuario(idUsuario, idRol);
    }

    @Override
    public List<Rol> obtenerRolesDeUsuario(Long idUsuario) {
        return usuarioRepository.obtenerRolesDeUsuario(idUsuario);  
    }

    @Override
    public void eliminarTodosLosRolesDeUsuario(Long idUsuario) {
        usuarioRepository.eliminarTodosLosRolesDeUsuario(idUsuario);
    }

	@Override
	public Optional<Usuario> findByUsuario(String usuario) {
		// TODO Auto-generated method stub
		return usuarioRepository.findByUsuario(usuario);
	}

	
}
