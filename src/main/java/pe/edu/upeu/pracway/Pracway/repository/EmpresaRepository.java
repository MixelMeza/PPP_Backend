package pe.edu.upeu.pracway.Pracway.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.pracway.Pracway.entity.Empresa;

@Repository
public interface EmpresaRepository extends JpaRepository<Empresa, Long>{

    @Procedure(procedureName = "sp_insertar_empresa")
    void insertarEmpresa(String p_razonsocial, String p_direccion, String p_sector, Boolean p_convenio, String p_estado);

    @Procedure(procedureName = "sp_editar_empresa")
    void actualizarEmpresa(Long p_id, String p_razonsocial, String p_direccion, String p_sector, Boolean p_convenio, String p_estado);

    @Procedure(procedureName = "sp_eliminar_empresa")
    void eliminarEmpresa(Long p_id);
    
}
