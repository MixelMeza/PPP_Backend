package pe.edu.upeu.pracway.Pracway.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.pracway.Pracway.dao.Supervisor_EmpresarialDao;
import pe.edu.upeu.pracway.Pracway.entity.Supervisor_Empresarial;
import pe.edu.upeu.pracway.Pracway.service.Supervisor_EmpresarialService;

@Service
public class Supervisor_EmpresarialServiceImpl implements Supervisor_EmpresarialService {

	@Autowired
	private Supervisor_EmpresarialDao supervisor_empresarialDao;

	@Override
	public Supervisor_Empresarial create(Supervisor_Empresarial s) {
		// TODO Auto-generated method stub
		return supervisor_empresarialDao.create(s);
	}

	@Override
	public Supervisor_Empresarial update(Supervisor_Empresarial s) {
		// TODO Auto-generated method stub
		return supervisor_empresarialDao.update(s);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		supervisor_empresarialDao.delete(id);
	}

	@Override
	public Optional<Supervisor_Empresarial> read(Long id) {
		// TODO Auto-generated method stub
		return supervisor_empresarialDao.read(id);
	}

	@Override
	public List<Supervisor_Empresarial> readAll() {
		// TODO Auto-generated method stub
		return supervisor_empresarialDao.readAll();
	}

}
