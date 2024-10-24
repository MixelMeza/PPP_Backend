package pe.edu.upeu.pracway.Pracway.entity;

import java.util.Date;

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
@Table(name = "Evaluacion")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Evaluacion {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sq_evaluacion")
	@SequenceGenerator(name = "sq_evaluacion", sequenceName = "sq_evaluacion", allocationSize = 1)
	private Long id;
	private Date fecha;
	private String link;
	private double nota;
	private String comentario;
	private char estado;
	
	
	@ManyToOne
	@JoinColumn(name = "tipo_id", nullable = false)
	private Tipo tipo;
	
	@ManyToOne
	@JoinColumn(name = "ppp_id", nullable = false)
	private PPP ppp;
}
