package pe.edu.upeu.pracway.Pracway.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
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
@Table(name = "Carrera")

public class Carrera {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sq_carrera")
	@SequenceGenerator(name = "sq_carrera", sequenceName = "sq_carrera", allocationSize = 1)
	private Long id;
	private String nombre;
	private char estado;
	
}