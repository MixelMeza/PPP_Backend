package pe.edu.upeu.pracway.Pracway.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.pracway.Pracway.entity.Carrera;

@Repository
public interface CarreraRepository extends JpaRepository<Carrera, Long> {
	
	@Procedure(procedureName = "sp_insertar_carrera")
    void insertarCarrera(String c_nombre, char c_estado);

    @Procedure(procedureName = "sp_editar_carrera")
    void actualizarCarrera(Long c_id, String c_nombre, char c_estado);

    @Procedure(procedureName = "sp_eliminar_carrera")
    void eliminarCarrera(Long c_id);
    
}
