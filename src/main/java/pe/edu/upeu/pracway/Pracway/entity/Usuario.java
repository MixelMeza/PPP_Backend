package pe.edu.upeu.pracway.Pracway.entity;

import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
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
@Table(name="usuario")
public class Usuario {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="sq_tipo")
	@SequenceGenerator(name = "sq_tipo", sequenceName = "sq_tipo", allocationSize = 1)
	private Long id;

    private String usuario;

    private String contrasena;

    private String icono;
   		
	@OneToOne
    @JoinColumn(name = "persona_id", referencedColumnName = "id")
    private Persona persona;

 
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
        name = "Usuario_Rol",
        joinColumns = @JoinColumn(name = "usuario_id"),
        inverseJoinColumns = @JoinColumn(name = "rol_id")
    )
    private Set<Rol> roles;
}
