package pe.edu.upeu.pracway.Pracway.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Solictud_PPP")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SolicitudPPP {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sq_solicitud_ppp")
	@SequenceGenerator(name = "sq_solicitud_ppp", sequenceName = "sq_solicitud_ppp", allocationSize = 1)
	private Long id;
	private String url;
	private String motivo;
	private Date fecha;
	private char estado;
	
	
	@ManyToOne
	@JoinColumn(name = "estudiante_id", nullable=false)
	private Estudiante estudiante;
	
	@ManyToOne
	@JoinColumn(name = "linea_id", nullable=false)
	private Linea linea;
	
	@ManyToOne
	@JoinColumn(name = "empresa_id", nullable=false)
	private Empresa empresa;
	
	@OneToOne(mappedBy = "solicitudppp")
    private PPP ppp;
}
