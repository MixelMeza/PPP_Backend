package pe.edu.upeu.pracway.Pracway.entity;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Rol")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Rol {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sq_rol")
	@SequenceGenerator(name = "sq_rol", sequenceName = "sq_rol", allocationSize = 1)
	private Long id;
	private String rol;
	private char estado;
	
	@ManyToMany(mappedBy = "roles")
	private Set<Acceso> accesos = new HashSet<>();
	
	@ManyToMany(mappedBy = "roles")
	private Set<Usuario> usuarios = new HashSet<>();
}
