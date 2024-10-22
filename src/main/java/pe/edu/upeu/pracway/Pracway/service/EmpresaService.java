package pe.edu.upeu.pracway.Pracway.service;

import java.util.List;

import java.util.Optional;

import pe.edu.upeu.pracway.Pracway.entity.Empresa;


public interface EmpresaService {
	void create(Empresa e);
	void update(Empresa e);
    void delete(Long id);
    Optional<Empresa> read(Long id);
    List<Empresa> readAll();
}
