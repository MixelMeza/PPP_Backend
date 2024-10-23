package pe.edu.upeu.pracway.Pracway.entity;

import java.util.Date;

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
@Table(name = "DetalleDoc")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Detalle_Doc {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sq_detalle_doc")
	@SequenceGenerator(name = "sq_detalle_doc", sequenceName = "sq_detalle_doc", allocationSize = 1)
	private Long id;
	private String nombre;
	private String url;
	private Date fechalim;
	private String plantilla;
	private char estado;
}
