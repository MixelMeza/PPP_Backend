package pe.edu.upeu.pracway.Pracway.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.pracway.Pracway.entity.Requisito;

@Repository
public interface RequisitoRepository extends JpaRepository<Requisito, Long>{

	@Procedure(procedureName = "sp_insertar_requisito")
    void insertarRequisito(String p_n_orden, String p_nombre, String p_tipo, char p_estado);

    @Procedure(procedureName = "sp_editar_requisito")
    void actualizarRequisito(Long p_id, String p_n_orden, String p_nombre, String p_tipo, char p_estado);

    @Procedure(procedureName = "sp_eliminar_requisito")
    void eliminarRequisito(Long p_id);

}
