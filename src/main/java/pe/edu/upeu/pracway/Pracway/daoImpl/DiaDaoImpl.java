package pe.edu.upeu.pracway.Pracway.daoImpl;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import pe.edu.upeu.pracway.Pracway.dao.DiaDao;
import pe.edu.upeu.pracway.Pracway.entity.Dia;
import pe.edu.upeu.pracway.Pracway.repository.DiaRepository;

@Component
public class DiaDaoImpl implements DiaDao{

	@Autowired
	private DiaRepository diaRepository;

	@Override
	public Dia create(Dia d) {
		// TODO Auto-generated method stub
		return diaRepository.save(d);
	}

	@Override
	public Dia update(Dia d) {
		// TODO Auto-generated method stub
		return diaRepository.save(d);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		diaRepository.deleteById(id);
	}

	@Override
	public Optional<Dia> read(Long id) {
		// TODO Auto-generated method stub
		return diaRepository.findById(id);
	}

	@Override
	public List<Dia> readAll() {
		// TODO Auto-generated method stub
		return diaRepository.findAll();
	}
	
	
}
