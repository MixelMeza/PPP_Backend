package pe.edu.upeu.pracway.Pracway.entity;

import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Requisito")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Requisito {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sq_requisito")
	@SequenceGenerator(name = "sq_requisito", sequenceName = "sq_requisito", allocationSize = 1)
	private Long id;
	private String n_orden;
	private String nombre;
	private String tipo;
	private char estado;
	
	@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy = "requisito")
	@JsonIgnore
	private Set<Proceso_Requisito> proceso_requisito;
	
	@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy = "requisito")
	@JsonIgnore
	private Set<Detalle_PPP> detalle_ppp;

}
