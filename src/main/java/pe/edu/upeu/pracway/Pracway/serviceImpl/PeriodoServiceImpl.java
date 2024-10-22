package pe.edu.upeu.pracway.Pracway.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.pracway.Pracway.dao.PeriodoDao;
import pe.edu.upeu.pracway.Pracway.entity.Periodo;
import pe.edu.upeu.pracway.Pracway.service.PeriodoService;

@Service
public class PeriodoServiceImpl implements PeriodoService {

    @Autowired
    private PeriodoDao dao;

    @Override
    public void create(Periodo p) {
        dao.create(p);
    }

    @Override
    public void update(Periodo p) {
        dao.update(p);
    }

    @Override
    public void delete(Long id) {
        dao.delete(id);
    }

    @Override
    public Optional<Periodo> read(Long id) {
        return dao.read(id);
    }

    @Override
    public List<Periodo> readAll() {
        return dao.readAll();
    }
}
