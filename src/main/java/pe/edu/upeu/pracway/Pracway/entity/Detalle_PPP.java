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
}
