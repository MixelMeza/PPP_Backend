package pe.edu.upeu.pracway.Pracway.entity;

import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
@Table(name="persona")
public class Persona {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sq_persona")
	@SequenceGenerator(name = "sq_persona", sequenceName = "sq_persona", allocationSize = 1)
	@Column(name="id")
	private Long id;
	@Column(name="nombre" , length = 255)
	private String nombre;
	@Column(name="apellido", length = 255)
	private String apellido;
	@Column(name="correo", length = 255)
	private String correo;
	@Column(name="telefono", length = 9)
	private String telefono;
	@Column(name="dni", length = 8)
	private String dni;
	@Column(name="estado", length = 1)
	private char estado;
	
	@OneToOne(mappedBy = "persona")
    private Usuario usuario;
	
	@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy = "persona")
	@JsonIgnore
	private Set<Supervisor_Empresarial> supervisor_empresarial;
	
	@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy = "persona")
	@JsonIgnore
	private Set<Supervisor_Academico> supervisor_academico;
	
	@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy = "persona")
	@JsonIgnore
	private Set<Representante> representante;
	
	@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy = "persona")
	@JsonIgnore
	private Set<Estudiante> estudiante;
	
	
	
	
	
}
