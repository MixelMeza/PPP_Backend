package pe.edu.upeu.pracway.Pracway.entity;

import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "PPP")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PPP {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sq_ppp")
	@SequenceGenerator(name = "sq_ppp", sequenceName = "sq_ppp", allocationSize = 1)
	private Long id;
	private Long horas;
	private double promedio;
	private char estado;
	
	
	@OneToOne(mappedBy = "ppp")
    private Periodo periodo;
	
	@ManyToOne
	@JoinColumn(name = "estudiante_id", nullable=false)
	private Estudiante estudiante;
	
	@ManyToOne
	@JoinColumn(name = "supervisor_empresarial_id", nullable=false)
	private Supervisor_Empresarial supervisor_Empresarial;
	
	@ManyToOne
	@JoinColumn(name = "supervisor_academico_id", nullable=false)
	private Supervisor_Academico supervisor_Academico;
	
	@ManyToOne
	@JoinColumn(name = "linea_id", nullable=false)
	private Linea linea;
	
	@ManyToOne
	@JoinColumn(name = "plan_carrera_id", nullable=false)
	private Plan_Carrera plan_carrera;
	
	@ManyToOne
	@JoinColumn(name = "empresa_id", nullable=false)
	private Empresa empresa;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "solicitudppp_id", referencedColumnName = "id")
    private SolicitudPPP solicitud_ppp;
	
	@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.EAGER, mappedBy = "ppp")
	@JsonIgnore
	private Set<Evaluacion> evaluacion;
	
	@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.EAGER, mappedBy = "ppp")
	@JsonIgnore
	private Set<Detalle_PPP> detalle_ppp;
}
