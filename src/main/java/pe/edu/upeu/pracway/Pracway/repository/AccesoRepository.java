package pe.edu.upeu.pracway.Pracway.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.pracway.Pracway.entity.Acceso;
@Repository
public interface AccesoRepository extends JpaRepository<Acceso, Long> {

	@Procedure(procedureName = "sp_insertar_acceso")
    void insertarAcceso(String a_acceso, String a_url, String a_icono, char a_estado);

    @Procedure(procedureName = "sp_editar_acceso")
    void actualizarAcceso(Long p_id, String a_acceso, String a_url, String a_icono, char a_estado);

    @Procedure(procedureName = "sp_eliminar_acceso")
    void eliminarAcceso(Long p_id);
}