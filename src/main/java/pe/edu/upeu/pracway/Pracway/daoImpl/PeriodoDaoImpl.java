package pe.edu.upeu.pracway.Pracway.daoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import pe.edu.upeu.pracway.Pracway.dao.PeriodoDao;
import pe.edu.upeu.pracway.Pracway.entity.Periodo;
import pe.edu.upeu.pracway.Pracway.repository.PeriodoRepository;

@Component
public class PeriodoDaoImpl implements PeriodoDao {

    @Autowired
    private PeriodoRepository periodoRepository;

    @Override
    public void create(Periodo p) {
        periodoRepository.insertarPeriodo(p.getFecha_inicio(), p.getFecha_fin(), p.getHora_inicio(), p.getHora_fin());
    }

    @Override
    public void update(Periodo p) {
        periodoRepository.actualizarPeriodo(p.getId(), p.getFecha_inicio(), p.getFecha_fin(), p.getHora_inicio(), p.getHora_fin());
    }

    @Override
    public void delete(Long id) {
        periodoRepository.eliminarPeriodo(id);
    }

    @Override
    public Optional<Periodo> read(Long id) {
        return periodoRepository.findById(id);
    }

    @Override
    public List<Periodo> readAll() {
        return periodoRepository.findAll();
    }
}
