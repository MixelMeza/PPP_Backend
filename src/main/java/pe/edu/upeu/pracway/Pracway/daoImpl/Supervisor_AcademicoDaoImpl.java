package pe.edu.upeu.pracway.Pracway.daoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import pe.edu.upeu.pracway.Pracway.dao.Supervisor_AcademicoDao;
import pe.edu.upeu.pracway.Pracway.entity.Supervisor_Academico;
import pe.edu.upeu.pracway.Pracway.repository.Supervisor_AcademicoRepository;

@Component
public class Supervisor_AcademicoDaoImpl implements Supervisor_AcademicoDao {

    @Autowired
    private Supervisor_AcademicoRepository supervisor_AcademicoRepository;

    @Override
    public Supervisor_Academico create(Supervisor_Academico s) {
        return supervisor_AcademicoRepository.save(s);
    }

    @Override
    public Supervisor_Academico update(Supervisor_Academico s) {
        return supervisor_AcademicoRepository.save(s);
    }

    @Override
    public void delete(Long id) {
        supervisor_AcademicoRepository.deleteById(id);
    }

    @Override
    public Optional<Supervisor_Academico> read(Long id) {
        return supervisor_AcademicoRepository.findById(id);
    }

    @Override
    public List<Supervisor_Academico> readAll() {
        return supervisor_AcademicoRepository.findAll();
    }
}
