package pe.edu.upeu.pracway.Pracway.daoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import pe.edu.upeu.pracway.Pracway.dao.Detalle_EvaluacionDao;
import pe.edu.upeu.pracway.Pracway.entity.DetalleEvaluacion;
import pe.edu.upeu.pracway.Pracway.repository.Detalle_EvaluacionRepository;

@Component
public class Detalle_EvaluacionDaoImpl implements Detalle_EvaluacionDao {

    @Autowired
    private Detalle_EvaluacionRepository detalleEvaluacionRepository;

    @Override
    public DetalleEvaluacion create(DetalleEvaluacion d) {
        return detalleEvaluacionRepository.save(d);
    }

    @Override
    public DetalleEvaluacion update(DetalleEvaluacion d) {
        return detalleEvaluacionRepository.save(d);
    }

    @Override
    public void delete(Long id) {
        detalleEvaluacionRepository.deleteById(id);
    }

    @Override
    public Optional<DetalleEvaluacion> read(Long id) {
        return detalleEvaluacionRepository.findById(id);
    }

    @Override
    public List<DetalleEvaluacion> readAll() {
        return detalleEvaluacionRepository.findAll();
    }
}
