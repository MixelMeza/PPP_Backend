package pe.edu.upeu.pracway.Pracway.daoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import pe.edu.upeu.pracway.Pracway.dao.RepresentanteDao;
import pe.edu.upeu.pracway.Pracway.entity.Representante;
import pe.edu.upeu.pracway.Pracway.repository.RepresentanteRepository;

@Component
public class RepresentanteDaoImpl implements RepresentanteDao{
	
	@Autowired
	private RepresentanteRepository representanteRepository;
	
	@Override
	public Representante create(Representante r) {
		// TODO Auto-generated method stub
		return representanteRepository.save(r);
	}

	@Override
	public Representante update(Representante r) {
		// TODO Auto-generated method stub
		return representanteRepository.save(r);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		representanteRepository.deleteById(id);
	}

	@Override
	public Optional<Representante> read(Long id) {
		// TODO Auto-generated method stub
		return representanteRepository.findById(id);
	}

	@Override
	public List<Representante> readAll() {
		// TODO Auto-generated method stub
		return representanteRepository.findAll();
	}
}
