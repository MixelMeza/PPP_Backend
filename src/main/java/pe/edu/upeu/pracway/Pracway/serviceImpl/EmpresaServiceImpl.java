	package pe.edu.upeu.pracway.Pracway.serviceImpl;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.pracway.Pracway.dao.EmpresaDao;
import pe.edu.upeu.pracway.Pracway.entity.Empresa;
import pe.edu.upeu.pracway.Pracway.service.EmpresaService;



@Service
public class EmpresaServiceImpl implements EmpresaService {

    @Autowired
    private EmpresaDao dao;

    @Override
    public void create(Empresa e) {
        dao.create(e);
    }

    @Override
    public void update(Empresa e) {
        dao.update(e);
    }

    @Override
    public void delete(Long id) {
        dao.delete(id);
    }

    @Override
    public Optional<Empresa> read(Long id) {
        return dao.read(id);
    }

    @Override
    public List<Empresa> readAll() {
        return dao.readAll();
    }
}
