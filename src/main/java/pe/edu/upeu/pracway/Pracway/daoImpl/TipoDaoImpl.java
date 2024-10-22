package pe.edu.upeu.pracway.Pracway.daoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import pe.edu.upeu.pracway.Pracway.dao.TipoDao;
import pe.edu.upeu.pracway.Pracway.entity.Tipo;
import pe.edu.upeu.pracway.Pracway.repository.TipoRepository;


@Component
public class TipoDaoImpl implements TipoDao{
	@Autowired
	private TipoRepository tipoRepository;
	
	 @Override
	    public void create(Tipo t) {
	        tipoRepository.insertarTipo(t.getNombre(),  t.getEstado());
	    }

	    @Override
	    public void update(Tipo t) {
	        tipoRepository.actualizarTipo(t.getId(), t.getNombre(), t.getEstado());
	    }

     @Override
	    public void delete(Long id) {
	        tipoRepository.eliminarTipo(id);
	    }

	    @Override
	    public Optional<Tipo> read(Long id) {
	        return tipoRepository.findById(id); 
	    }
	
	@Override
	public List<Tipo> readAll() {
		// TODO Auto-generated method stub
		return tipoRepository.findAll();
	}
}
