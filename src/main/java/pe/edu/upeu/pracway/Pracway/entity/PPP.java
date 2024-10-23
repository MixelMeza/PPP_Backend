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
}
