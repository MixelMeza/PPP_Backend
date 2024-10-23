package pe.edu.upeu.pracway.Pracway.dao;

import java.util.List;
import java.util.Optional;

import pe.edu.upeu.pracway.Pracway.entity.Rol;
import pe.edu.upeu.pracway.Pracway.entity.Usuario;

public interface UsuarioDao {
    Usuario create(Usuario usuario);  
    Usuario update(Usuario usuario);      
    void delete(Long id);
    Optional<Usuario> read(Long id);  
    List<Usuario> readAll();        
    
    void asignarRolAUsuario(Long idUsuario, Long idRol);
    void eliminarRolDeUsuario(Long idUsuario, Long idRol);
    List<Rol> obtenerRolesDeUsuario(Long idUsuario);
    void eliminarTodosLosRolesDeUsuario(Long idUsuario);
}
