package pe.edu.upeu.plan.daoImpl;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pe.edu.upeu.plan.dao.PlanDao;
import pe.edu.upeu.plan.entity.Plan;
import pe.edu.upeu.plan.repository.PlanRepository;



@Component
public class PlanDaoImpl implements PlanDao {

	@Autowired
	private PlanRepository planRepository;
	
	 @Override
	    public void create(Plan p) {
	        planRepository.insertarPlan(p.getPlan(),  p.getEstado());
	    }

	    @Override
	    public void update(Plan p) {
	        planRepository.actualizarPlan(p.getId(), p.getPlan(), p.getEstado());
	    }

        @Override
	    public void delete(Long id) {
	        planRepository.eliminarPlan(id);
	    }

	    @Override
	    public Optional<Plan> read(Long id) {
	        return planRepository.findById(id); 
	    }
	
	@Override
	public List<Plan> readAll() {
		// TODO Auto-generated method stub
		return planRepository.findAll();
	}

}