package pe.edu.upeu.linea.dao;

import pe.edu.upeu.linea.entity.Linea;

import java.util.List;
import java.util.Optional;

public interface LineaDao {
    void create(Linea l);
    void update(Linea l);
    void delete(Long id);
    Optional<Linea> read(Long id);
    List<Linea> readAll();
}
