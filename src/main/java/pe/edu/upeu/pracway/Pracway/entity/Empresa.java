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
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Empresa")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Empresa {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sq_empresa")
    @SequenceGenerator(name = "sq_empresa", sequenceName = "sq_empresa", allocationSize = 1)
    private Long id;
    
    private String razonsocial;
    private String direccion;
    private String sector;
    private Boolean convenio;
    private String estado;
    
    
    @OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy = "empresa")
	@JsonIgnore
	private Set<Supervisor_Empresarial> supervisor_empresarial;
	
	@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy = "empresa")
	@JsonIgnore
	private Set<PPP> ppp;
	
	@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy = "empresa")
	@JsonIgnore
	private Set<Representante> representante;
	
	@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy = "empresa")
	@JsonIgnore
	private Set<SolicitudPPP> solicitudppp;
}
