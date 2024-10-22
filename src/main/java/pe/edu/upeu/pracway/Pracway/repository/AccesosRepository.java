package pe.edu.upeu.pracway.Pracway.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.pracway.Pracway.entity.Accesos;



@Repository
public interface AccesosRepository extends JpaRepository<Accesos, Long> {
	
	@Procedure(procedureName = "sp_insertar_accesos")
    void insertarAccesos(String p_acceso, char p_estado);

    @Procedure(procedureName = "sp_editar_accesos")
    void actualizarAccesos(Long p_id, String p_acceso, char p_estado);

    @Procedure(procedureName = "sp_eliminar_accesos")
    void eliminarAccesos(Long p_id);
}
