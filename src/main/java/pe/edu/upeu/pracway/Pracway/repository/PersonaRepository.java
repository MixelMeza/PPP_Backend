package pe.edu.upeu.pracway.Pracway.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.pracway.Pracway.entity.Persona;

@Repository
public interface PersonaRepository extends JpaRepository<Persona, Long> {

	@Procedure(procedureName = "sp_insertar_persona")
	void insertarPersona(String p_nombre, String p_apellido, String p_correo, String p_telefono, String p_dni,
			char p_estado);

	@Procedure(procedureName = "sp_editar_persona")
	void actualizarPersona(Long p_id, String p_nombre, String p_apellido, String p_correo, String p_telefono,
			String p_dni, char p_estado);

	@Procedure(procedureName = "sp_eliminar_persona")
	void eliminarPersona(Long p_id);

}
