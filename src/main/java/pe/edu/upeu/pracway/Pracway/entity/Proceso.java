package pe.edu.upeu.pracway.Pracway.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Proceso")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Proceso {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sq_proceso")
	@SequenceGenerator(name = "sq_proceso", sequenceName = "sq_proceso", allocationSize = 1)
	private Long id;
	private String nombre;
	private String tipo;
	private String estado;
}