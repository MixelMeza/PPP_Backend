package pe.edu.upeu.pracway.Pracway.daoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import pe.edu.upeu.pracway.Pracway.dao.PPPDao;
import pe.edu.upeu.pracway.Pracway.entity.PPP;
import pe.edu.upeu.pracway.Pracway.repository.PPPRepository;

public class PPPDaoImpl implements PPPDao{
@Autowired
private PPPRepository pppRepository;
	@Override
	public PPP create(PPP p) {
		// TODO Auto-generated method stub
		return pppRepository.save(p);
	}

	@Override
	public PPP update(PPP p) {
		// TODO Auto-generated method stub
		return pppRepository.save(p);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		pppRepository.deleteById(id);
		
	}

	@Override
	public Optional<PPP> read(Long id) {
		// TODO Auto-generated method stub
		return pppRepository.findById(id);
	}

	@Override
	public List<PPP> readAll() {
		// TODO Auto-generated method stub
		return pppRepository.findAll();
	}

}
