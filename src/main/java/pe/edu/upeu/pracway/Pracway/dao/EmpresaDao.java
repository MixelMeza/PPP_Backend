package pe.edu.upeu.pracway.Pracway.dao;

import java.util.List;


import java.util.Optional;

import pe.edu.upeu.pracway.Pracway.entity.Empresa;





public interface EmpresaDao {
    void create(Empresa e);
    void update(Empresa e);
    void delete(Long id);
    Optional<Empresa> read(Long id);
    List<Empresa> readAll();
}

