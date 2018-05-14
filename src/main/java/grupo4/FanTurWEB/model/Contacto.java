package grupo4.FanTurWEB.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Entity
public class Contacto {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private String email;
	
	private String pagina;
	
	@NotNull
	@Min(000000)
	@Max(999999)
	private int CodPaisyArea;
	
	@NotNull
	@Min(000000)
	@Max(999999)
	private int telefono;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getCodPaisyArea() {
		return CodPaisyArea;
	}

	public void setCodPaisyArea(int codPaisyArea) {
		CodPaisyArea = codPaisyArea;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	
	public String getPagina() {
		return pagina;
	}

	public void setPagina(String pagina) {
		this.pagina = pagina;
	}
	
	public int getId() {
		return id;
	}
	
	public Contacto() {
		
	}
	
	public Contacto(String email, int codPaisyArea, int telefono, String pagina) {
		this.setEmail(email);
		this.setCodPaisyArea(codPaisyArea);
		this.setTelefono(telefono);
		this.setPagina(pagina);
	}
	
}