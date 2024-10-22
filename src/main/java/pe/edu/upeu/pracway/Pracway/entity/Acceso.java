package pe.edu.upeu.pracway.Pracway.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "Acceso")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Acceso {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sq_acceso")
	@SequenceGenerator(name = "sq_acceso", sequenceName = "sq_acceso", allocationSize = 1)
	private Long id;
	private String acceso;
	private String url;
	private String icono;
	private char estado;
}
