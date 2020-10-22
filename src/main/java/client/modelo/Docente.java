package client.modelo;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name="docentes")
public class Docente {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_docente")
	private Long idDocente;
	
	@Column(name="nombre")
	private String nombreDocente;
	
	@Column(name="apellidos")
	private String apellidosDocente;
	
	@JsonProperty("fechaDocente")
	@Column(name="fecha_nac")
	@JsonFormat(pattern="dd/MM/yyyy")   
	private Date fechaDocente;
	
	
	@Column(name="telefono")
	private String telefonoDocente;
	
	@Column(name="departamento")
	private String departamentoDocente;
	
	
	public Docente() {
		
		
	}
	
	public Docente(Long idDocente, String nombreDocente, String apellidosDocente, Date fechaDocente, String telefonoDocente, 
			String departamentoDocente) {
		
		this.idDocente = idDocente;
		this.nombreDocente =nombreDocente;
		this.apellidosDocente = apellidosDocente;
		this.fechaDocente = fechaDocente;
		this.telefonoDocente = telefonoDocente;
		this.departamentoDocente = departamentoDocente;
		
		
	}

	public Long getIdDocente() {
		return idDocente;
	}

	public void setIdDocente(Long idDocente) {
		this.idDocente = idDocente;
	}

	public String getNombreDocente() {
		return nombreDocente;
	}

	public void setNombreDocente(String nombreDocente) {
		this.nombreDocente = nombreDocente;
	}

	public String getApellidosDocente() {
		return apellidosDocente;
	}

	public void setApellidosDocente(String apellidosDocente) {
		this.apellidosDocente = apellidosDocente;
	}

	public Date getFechaDocente() {
		return fechaDocente;
	}

	public void setFechaDocente(Date fechaDocente) {
		this.fechaDocente = fechaDocente;
	}

	public String getTelefonoDocente() {
		return telefonoDocente;
	}

	public void setTelefonoDocente(String telefonoDocente) {
		this.telefonoDocente = telefonoDocente;
	}

	public String getDepartamentoDocente() {
		return departamentoDocente;
	}

	public void setDepartamentoDocente(String departamentoDocente) {
		this.departamentoDocente = departamentoDocente;
	}
	
	
	
	

}
