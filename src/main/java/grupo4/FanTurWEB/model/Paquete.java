package grupo4.FanTurWEB.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.JoinColumn;

@Entity
@Table(name="paquete",schema="fantur")
public class Paquete {
	
	@Id
	private int id;
	private double precio;
	private int cantPaquete;
	@OneToMany(mappedBy="paquete")
	private List<Pasaje> pasajes;
	@ManyToOne
	@JoinColumn(name = "alojamientoId")
	private Alojamiento alojamiento;
	@ManyToMany
	@JoinTable(name="Paquete_Evento",
	 joinColumns=@JoinColumn(name="idPaquete"),
	 inverseJoinColumns=@JoinColumn(name="nroEvento"))
	private List<Evento> evento;
	@OneToOne
	@JoinColumn(name="idReserva")
	private Reserva reserva;
	private String autorizado;
	
	//private Admin administrador
		
	public Paquete() {}

	public Paquete(int id, double precio, int cantPaquete, List<Pasaje> pasajes, Alojamiento alojamiento,
			List<Evento> evento, Reserva reserva) {
		super();
		this.id = id;
		this.precio = precio;
		this.cantPaquete = cantPaquete;
		this.pasajes = pasajes;
		this.alojamiento = alojamiento;
		this.evento = evento;
		this.reserva = reserva;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getCantPaquete() {
		return cantPaquete;
	}

	public void setCantPaquete(int cantPaquete) {
		this.cantPaquete = cantPaquete;
	}

	public List<Pasaje> getPasajes() {
		return pasajes;
	}

	public void setPasajes(List<Pasaje> pasajes) {
		this.pasajes = pasajes;
	}

	public Alojamiento getAlojamiento() {
		return alojamiento;
	}

	public void setAlojamiento(Alojamiento alojamiento) {
		this.alojamiento = alojamiento;
	}

	public List<Evento> getEvento() {
		return evento;
	}

	public void setEvento(List<Evento> evento) {
		this.evento = evento;
	}

	public Reserva getReserva() {
		return reserva;
	}

	public void setReserva(Reserva reserva) {
		this.reserva = reserva;
	}

}
