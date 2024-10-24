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
@Table(name = "Solicitud_de_PPP")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Solicitud_PPP {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sq_solicitud")
	@SequenceGenerator(name = "sq_solicitud", sequenceName = "sq_solicitud", allocationSize = 1)
	private Long id;
	private String url;
	private String motivo;
	private String fecha;
	private char estado;
	
	@ManyToOne
	@JoinColumn(name="linea_id", nullable = false)
	private Linea linea;
	
	@ManyToOne
	@JoinColumn(name="empresa_id", nullable = false)
	private Empresa empresa;
	
	@ManyToOne
	@JoinColumn(name="estudiante_id", nullable = false)
	private Estudiante estudiante;
}	
