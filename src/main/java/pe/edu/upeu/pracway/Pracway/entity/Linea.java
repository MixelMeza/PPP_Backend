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
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Entity
@Data
@Table(name = "Linea")
public class Linea {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sq_linea")
	@SequenceGenerator(name = "sq_linea", sequenceName = "sq_linea", allocationSize = 1)
    private Long id;
    private String nombre;
    private char estado;
    
    @OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy = "linea")
	@JsonIgnore
	private Set<PPP> ppp;
	@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy = "linea")
	@JsonIgnore
	private Set<Supervisor_Academico> supervisor_academico;
	@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy = "linea")
	@JsonIgnore
	private Set<SolicitudPPP> solicitudppp;
}

