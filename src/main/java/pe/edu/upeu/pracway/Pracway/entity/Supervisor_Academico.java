package pe.edu.upeu.pracway.Pracway.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Entity
@Data
@Table(name = "SUPERVISOR_ACADEMICO")
public class Supervisor_Academico {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	@Column(name="estado")
	private char estado;
	
	@ManyToOne
	@JoinColumn(name="linea_id", nullable = false)
	private Linea linea;
	
	@ManyToOne
	@JoinColumn(name="persona_id", nullable = false)
	private Persona persona;
}
