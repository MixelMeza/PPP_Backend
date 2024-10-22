package pe.edu.upeu.pracway.Pracway.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.pracway.Pracway.entity.Periodo;

import java.time.LocalDate;
import java.time.LocalTime;

@Repository
public interface PeriodoRepository extends JpaRepository<Periodo, Long>{

    @Procedure(procedureName = "sp_insertar_periodo")
    void insertarPeriodo(LocalDate p_fecha_inicio, LocalDate p_fecha_fin, LocalTime p_hora_inicio, LocalTime p_hora_fin);

    @Procedure(procedureName = "sp_editar_periodo")
    void actualizarPeriodo(Long p_id, LocalDate p_fecha_inicio, LocalDate p_fecha_fin, LocalTime p_hora_inicio, LocalTime p_hora_fin);

    @Procedure(procedureName = "sp_eliminar_periodo")
    void eliminarPeriodo(Long p_id);
}
