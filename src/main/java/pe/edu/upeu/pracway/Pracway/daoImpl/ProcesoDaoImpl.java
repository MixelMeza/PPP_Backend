package pe.edu.upeu.pracway.Pracway.daoImpl;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import pe.edu.upeu.pracway.Pracway.dao.ProcesoDao;
import pe.edu.upeu.pracway.Pracway.entity.Proceso;
import pe.edu.upeu.pracway.Pracway.repository.ProcesoRepository;


@Component
public class ProcesoDaoImpl implements ProcesoDao {

	@Autowired
	private ProcesoRepository procesoRepository;
	
	 @Override
	    public void create(Proceso p) {
	        procesoRepository.insertarProceso(p.getNombre(), p.getTipo(), p.getEstado());
	    }

	    @Override
	    public void update(Proceso p) {
	        procesoRepository.actualizarProceso(p.getId(), p.getNombre(), p.getTipo(), p.getEstado());
	    }

        @Override
	    public void delete(Long id) {
	        procesoRepository.eliminarProceso(id);
	    }

	    @Override
	    public Optional<Proceso> read(Long id) {
	        return procesoRepository.findById(id); 
	    }
	
	@Override
	public List<Proceso> readAll() {
		// TODO Auto-generated method stub
		return procesoRepository.findAll();
	}

}
