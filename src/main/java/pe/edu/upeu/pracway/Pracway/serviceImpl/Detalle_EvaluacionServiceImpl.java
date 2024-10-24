package pe.edu.upeu.pracway.Pracway.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.pracway.Pracway.dao.Detalle_EvaluacionDao;
import pe.edu.upeu.pracway.Pracway.entity.DetalleEvaluacion;
import pe.edu.upeu.pracway.Pracway.service.Detalle_EvaluacionService;

@Service
public class Detalle_EvaluacionServiceImpl implements Detalle_EvaluacionService {

    @Autowired
    private Detalle_EvaluacionDao detalleEvaluacionDao;

    @Override
    public DetalleEvaluacion create(DetalleEvaluacion d) {
        return detalleEvaluacionDao.create(d);
    }

    @Override
    public DetalleEvaluacion update(DetalleEvaluacion d) {
        return detalleEvaluacionDao.update(d);
    }

    @Override
    public void delete(Long id) {
        detalleEvaluacionDao.delete(id);
    }

    @Override
    public Optional<DetalleEvaluacion> read(Long id) {
        return detalleEvaluacionDao.read(id);
    }

    @Override
    public List<DetalleEvaluacion> readAll() {
        return detalleEvaluacionDao.readAll();
    }
}
