package pe.edu.upeu.pracway.Pracway.daoImpl;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import pe.edu.upeu.pracway.Pracway.dao.EmpresaDao;
import pe.edu.upeu.pracway.Pracway.entity.Empresa;
import pe.edu.upeu.pracway.Pracway.repository.EmpresaRepository;

@Component
public class EmpresaDaoImpl implements EmpresaDao {

    @Autowired
    private EmpresaRepository empresaRepository;

    @Override
    public void create(Empresa e) {
        empresaRepository.insertarEmpresa(e.getRazonsocial(), e.getDireccion(), e.getSector(), e.getConvenio(), e.getEstado());
    }

    @Override
    public void update(Empresa e) {
        empresaRepository.actualizarEmpresa(e.getId(), e.getRazonsocial(), e.getDireccion(), e.getSector(), e.getConvenio(), e.getEstado());
    }

    @Override
    public void delete(Long id) {
        empresaRepository.eliminarEmpresa(id);
    }

    @Override
    public Optional<Empresa> read(Long id) {
        return empresaRepository.findById(id);
    }

    @Override
    public List<Empresa> readAll() {
        return empresaRepository.findAll();
    }
}
