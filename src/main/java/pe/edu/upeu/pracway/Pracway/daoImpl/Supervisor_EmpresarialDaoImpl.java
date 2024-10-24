package pe.edu.upeu.pracway.Pracway.daoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import pe.edu.upeu.pracway.Pracway.dao.Supervisor_EmpresarialDao;
import pe.edu.upeu.pracway.Pracway.entity.Supervisor_Empresarial;
import pe.edu.upeu.pracway.Pracway.repository.Supervisor_EmpresarialRepository;


@Component
public class Supervisor_EmpresarialDaoImpl implements Supervisor_EmpresarialDao {
	@Autowired 
	private Supervisor_EmpresarialRepository supervisor_empresarialRepository;
	@Override
	public Supervisor_Empresarial create(Supervisor_Empresarial s) {
		// TODO Auto-generated method stub
		return supervisor_empresarialRepository.save(s);
	}

	@Override
	public Supervisor_Empresarial update(Supervisor_Empresarial s) {
		// TODO Auto-generated method stub
		return supervisor_empresarialRepository.save(s);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		supervisor_empresarialRepository.deleteById(id);
	}

	@Override
	public Optional<Supervisor_Empresarial> read(Long id) {
		// TODO Auto-generated method stub
		return supervisor_empresarialRepository.findById(id);
	}

	@Override
	public List<Supervisor_Empresarial> readAll() {
		// TODO Auto-generated method stub
		return supervisor_empresarialRepository.findAll();
	}

}
