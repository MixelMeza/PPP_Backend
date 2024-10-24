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
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Detalle_PPP")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Detalle_PPP {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sq_detalle_ppp")
	@SequenceGenerator(name = "sq_detalle_ppp", sequenceName = "sq_detalle_ppp", allocationSize = 1)
	private Long id;
	private char estado;
	
	@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.EAGER, mappedBy = "detalle_ppp")
	@JsonIgnore
	private Set<Detalle_Doc> detalle_doc;
	
	@ManyToOne
	@JoinColumn(name = "ppp_id", nullable = false)
	private PPP ppp;
	
	@ManyToOne
	@JoinColumn(name = "requisito_id", nullable = false)
	private Requisito requisito;
	
	@ManyToOne
	@JoinColumn(name = "proceso_id", nullable = false)
	private Proceso proceso;
	
	@ManyToOne
	@JoinColumn(name = "persona_id", nullable = false)
	private Persona persona;
	
}
