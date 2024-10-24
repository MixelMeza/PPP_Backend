package pe.edu.upeu.pracway.Pracway.dao;

import java.util.List;
import java.util.Optional;

import pe.edu.upeu.pracway.Pracway.entity.Linea;

public interface LineaDao {
    void create(Linea l);
    void update(Linea l);
    void delete(Long id);
    Optional<Linea> read(Long id);
    List<Linea> readAll();
}
