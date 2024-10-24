package pe.edu.upeu.pracway.Pracway.entity;
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
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
@Table(name="tipo")
public class Tipo {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="sq_tipo")
	@SequenceGenerator(name = "sq_tipo", sequenceName = "sq_tipo", allocationSize = 1)
	private Long id;
	private String nombre;
	private char estado;
	@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy = "tipo")
	@JsonIgnore
	private Proceso_Requisito proceso_requisito;
}
