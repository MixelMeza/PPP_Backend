package pe.edu.upeu.linea.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;
import pe.edu.upeu.linea.entity.Linea;

@Repository
public interface LineaRepository extends JpaRepository<Linea, Long> {
	
	@Procedure(procedureName = "sp_insertar_linea")
    void insertarLinea(String l_nombre, char l_estado);

    @Procedure(procedureName = "sp_editar_linea")
    void actualizarLinea(Long l_id, String l_nombre, char l_estado);

    @Procedure(procedureName = "sp_eliminar_linea")
    void eliminarLinea(Long l_id);


}
