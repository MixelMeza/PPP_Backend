package pe.edu.upeu.pracway.Pracway.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.pracway.Pracway.entity.Rol;
@Repository
public interface RolRepository extends JpaRepository<Rol, Long>{
	
	@Procedure(procedureName = "sp_insertar_rol")
    void insertarRol(String r_rol, char a_estado);

    @Procedure(procedureName = "sp_editar_rol")
    void actualizarRol(Long r_id, String r_rol, char a_estado);

    @Procedure(procedureName = "sp_eliminar_rol")
    void eliminarRol(Long r_id);
}
