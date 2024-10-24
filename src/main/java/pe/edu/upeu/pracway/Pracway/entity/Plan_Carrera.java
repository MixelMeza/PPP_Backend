package pe.edu.upeu.pracway.Pracway.entity;
import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
@Data
@Table(name = "plan_carrera")
public class Plan_Carrera {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	private String codigo;
	private char estado;

	@ManyToOne
	@JoinColumn(name = "plan_id", nullable = false)
	private Plan plan;
	
	@ManyToOne
	@JoinColumn(name = "carrera_id", nullable = false)
	private Carrera carrera;
	
	@ManyToMany
	@JsonIgnore
	@JoinTable(
				name = "matricula", 
				joinColumns = @JoinColumn(name="plan_carrera_id", referencedColumnName = "id"),
				inverseJoinColumns = @JoinColumn(name="estudiante_id", referencedColumnName = "id")
			)
	private Set<Estudiante> estudiantes = new HashSet<>();
	
}

