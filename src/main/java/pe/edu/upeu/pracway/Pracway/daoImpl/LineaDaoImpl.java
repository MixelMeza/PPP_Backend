package pe.edu.upeu.pracway.Pracway.daoImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.pracway.Pracway.dao.LineaDao;
import pe.edu.upeu.pracway.Pracway.entity.Linea;
import pe.edu.upeu.pracway.Pracway.repository.LineaRepository;

import java.util.List;
import java.util.Optional;

@Repository
public class LineaDaoImpl implements LineaDao {
    
	@Autowired
    private LineaRepository lineaRepository;
	@Override
	public void create(Linea l) {
        lineaRepository.insertarLinea(l.getNombre(), l.getEstado());
		
	}

	@Override
	public void update(Linea l) {
        lineaRepository.actualizarLinea(l.getId(), l.getNombre(), l.getEstado());
		
	}

	@Override
	public void delete(Long id) {
        lineaRepository.eliminarLinea(id);
		
	}

	@Override
	public Optional<Linea> read(Long id) {
        return lineaRepository.findById(id); 

	}

	@Override
	public List<Linea> readAll() {
		// TODO Auto-generated method stub
		return lineaRepository.findAll();
	}
}
