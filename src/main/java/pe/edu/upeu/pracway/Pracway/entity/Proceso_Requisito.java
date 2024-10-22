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
@Table(name = "Proceso_Requisito")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Proceso_Requisito {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sq_proceso_requisito")
	@SequenceGenerator(name = "sq_proceso_requisito", sequenceName = "sq_proceso_requisito", allocationSize = 1)
	private Long id;
	private char estado;
	
	
	@ManyToOne
	@JoinColumn(name="requisito_id", nullable = false)
	private Requisito requisito;
	
	@ManyToOne
	@JoinColumn(name="proceso_id", nullable = false)
	private Proceso proceso;
	
	//@ManyToOne
	//@JoinColumn(name="linea_id", nullable = false)
	//private Linea linea;
	
}
