package pe.edu.upeu.pracway.Pracway.dao;

import java.util.List;
import java.util.Optional;

import pe.edu.upeu.pracway.Pracway.entity.DetalleEvaluacion;

public interface Detalle_EvaluacionDao {
	DetalleEvaluacion create(DetalleEvaluacion d);
    DetalleEvaluacion update(DetalleEvaluacion d);
    void delete(Long id);
    Optional<DetalleEvaluacion> read(Long id);
    List<DetalleEvaluacion> readAll();
}
