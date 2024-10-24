package pe.edu.upeu.pracway.Pracway.dao;

import java.util.List;
import java.util.Optional;

import pe.edu.upeu.pracway.Pracway.entity.Proceso_Requisito;

public interface Proceso_RequisitoDao {
	Proceso_Requisito create(Proceso_Requisito p);
    Proceso_Requisito update(Proceso_Requisito p);
    void delete(Long id);
    Optional<Proceso_Requisito> read(Long id);
    List<Proceso_Requisito> readAll();
}
