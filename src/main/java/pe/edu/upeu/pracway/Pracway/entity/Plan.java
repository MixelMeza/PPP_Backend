package pe.edu.upeu.plan.entity;




import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
@Table(name="planes")
public class Plan {
	
		@Id
		@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="sq_plan")
		@SequenceGenerator(name = "sq_plan", sequenceName = "sq_plan", allocationSize = 1)
		private Long id;
		private String plan;
		private char estado;
}
