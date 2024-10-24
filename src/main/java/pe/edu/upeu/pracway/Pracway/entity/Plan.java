package pe.edu.upeu.pracway.Pracway.entity;




import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
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
@Table(name="plan")
public class Plan {
	
		@Id
		@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="sq_plan")
		@SequenceGenerator(name = "sq_plan", sequenceName = "sq_plan", allocationSize = 1)
		private Long id;
		private String plan;
		private char estado;
		
		@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy = "plan")
		@JsonIgnore
		private Set<Plan_Carrera>  plan_carrera;
}
