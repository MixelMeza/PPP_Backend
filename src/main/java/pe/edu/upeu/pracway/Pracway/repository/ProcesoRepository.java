package pe.edu.upeu.pracway.Pracway.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.pracway.Pracway.entity.Proceso;

@Repository
public interface ProcesoRepository extends JpaRepository<Proceso, Long>{

    @Procedure(procedureName = "sp_insertar_proceso")
    void insertarProceso(String p_nombre, String p_tipo, String p_estado);

    @Procedure(procedureName = "sp_editar_proceso")
    void actualizarProceso(Long p_id, String p_nombre, String p_tipo, String p_estado);

    @Procedure(procedureName = "sp_eliminar_proceso")
    void eliminarProceso(Long p_id);

   
}
