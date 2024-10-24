package pe.edu.upeu.pracway.Pracway.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.pracway.Pracway.entity.Tipo;

@Repository
public interface TipoRepository extends JpaRepository<Tipo, Long>{
	
	@Procedure(procedureName = "sp_insertar_tipo")
    void insertarTipo(String t_nombre, char t_estado);

    @Procedure(procedureName = "sp_editar_tipo")
    void actualizarTipo(Long t_id, String t_nombre, char t_estado);

    @Procedure(procedureName = "sp_eliminar_tipo")
    void eliminarTipo(Long t_id);
    
}
