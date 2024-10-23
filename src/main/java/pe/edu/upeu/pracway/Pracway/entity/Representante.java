package pe.edu.upeu.pracway.Pracway.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "representante")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Representante {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sq_representante")
	@SequenceGenerator(name = "sq_representante", sequenceName = "sq_representante", allocationSize = 1)
	private Long id;
	private String cargo;
	private char estado;
	
	@ManyToOne
	@JoinColumn(name="persona_id", nullable = false)
	private Persona persona;
	
	@ManyToOne
	@JoinColumn(name="empresa_id", nullable = false)
	private Empresa empresa;
}
