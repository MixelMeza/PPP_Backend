package pe.edu.upeu.pracway.Pracway.daoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import pe.edu.upeu.pracway.Pracway.dao.Proceso_RequisitoDao;
import pe.edu.upeu.pracway.Pracway.entity.Proceso_Requisito;
import pe.edu.upeu.pracway.Pracway.repository.Proceso_RequisitoRepository;

@Component
public class Proceso_RequisitoDaoImpl implements Proceso_RequisitoDao {

    @Autowired
    private Proceso_RequisitoRepository procesoRequisitoRepository;

    @Override
    public Proceso_Requisito create(Proceso_Requisito p) {
        return procesoRequisitoRepository.save(p);
    }

    @Override
    public Proceso_Requisito update(Proceso_Requisito p) {
        return procesoRequisitoRepository.save(p);
    }

    @Override
    public void delete(Long id) {
        procesoRequisitoRepository.deleteById(id);
    }

    @Override
    public Optional<Proceso_Requisito> read(Long id) {
        return procesoRequisitoRepository.findById(id);
    }

    @Override
    public List<Proceso_Requisito> readAll() {
        return procesoRequisitoRepository.findAll();
    }
}
