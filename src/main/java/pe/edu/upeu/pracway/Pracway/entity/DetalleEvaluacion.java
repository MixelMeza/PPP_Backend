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
@Table(name = "DetallesEvaluacion")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DetalleEvaluacion {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sq_detalle_evaluacion")
	@SequenceGenerator(name = "sq_detalle_evaluacion", sequenceName = "sq_detalle_evaluacion", allocationSize = 1)
	private Long id;
	private int porcentaje;
	private char estado;
	
	@ManyToOne 
	@JoinColumn(name = "tipo_id", nullable = false)
	private Tipo tipo;
	
	@ManyToOne
	@JoinColumn(name = "plan_carrera_id", nullable = false)
	private Plan_Carrera plan_carrera;
}
