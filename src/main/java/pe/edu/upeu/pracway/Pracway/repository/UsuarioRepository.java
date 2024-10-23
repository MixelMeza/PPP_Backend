package pe.edu.upeu.pracway.Pracway.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.pracway.Pracway.entity.Rol;
import pe.edu.upeu.pracway.Pracway.entity.Usuario;
@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
    
    
    @Procedure(procedureName = "asignarRolAUsuario")
    void asignarRolAUsuario(@Param("p_usuario_id") Long idUsuario, @Param("p_rol_id") Long idRol);


    @Procedure(procedureName = "eliminarRolDeUsuario")
    void eliminarRolDeUsuario(@Param("p_usuario_id") Long idUsuario, @Param("p_rol_id") Long idRol);


    @Query("SELECT r FROM Usuario u JOIN u.roles r WHERE u.id = :usuarioId")
    List<Rol> obtenerRolesDeUsuario(@Param("usuarioId") Long usuarioId);

    @Procedure(procedureName = "eliminarTodosLosRolesDeUsuario")
    void eliminarTodosLosRolesDeUsuario(@Param("p_usuario_id") Long idUsuario);
}
