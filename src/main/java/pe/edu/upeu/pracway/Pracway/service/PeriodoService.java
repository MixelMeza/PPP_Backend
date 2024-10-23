package pe.edu.upeu.pracway.Pracway.service;

import java.util.List;

import java.util.Optional;

import pe.edu.upeu.pracway.Pracway.entity.Periodo;



public interface PeriodoService {
	void create(Periodo p);
	void update(Periodo p);
    void delete(Long id);
    Optional<Periodo> read(Long id);
    List<Periodo> readAll();
}
