package pe.edu.upeu.pracway.Pracway.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
@Table(name="accesos")
public class Accesos {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sq_accesos")
	@SequenceGenerator(name = "sq_accesos", sequenceName = "sq_accesos", allocationSize = 1)
	@Column(name="id")
	private Long id;
	@Column(name="acceso" , length = 15)
	private String acceso;
	@Column(name="estado", length = 1)
	private char estado;
}
