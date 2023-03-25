package Clases;

import java.time.LocalDate;
import java.util.ArrayList;

public class Concurso {

	private String nombre;
	private LocalDate fechaIncio;
	private LocalDate fechaFinalizacion;
	private ArrayList<Participante> participantes;

	public Concurso(String nombre, LocalDate fechaIncio, LocalDate fechaFinalizacion) {
		super();
		this.nombre = nombre;
		this.fechaIncio = fechaIncio;
		this.fechaFinalizacion = fechaFinalizacion;
		this.participantes = new ArrayList<Participante>();
	}

	public void inscribirParticipante(Participante unParticipante) {
		LocalDate hoy = LocalDate.now();
		if (hoy.equals(fechaIncio)) {
			this.participantes.add(unParticipante);
			unParticipante.asignarPuntos(10);
		} else if (hoy.isAfter(fechaIncio) && hoy.isBefore(fechaFinalizacion)) {

			this.participantes.add(unParticipante);
			System.out.println();
		}

		// throw new RuntimeException("fuera de fecha");

	}

	public boolean estaInscripto(Participante unParticipante) {

		if (participantes.contains(unParticipante)) {
			return true;
		}
		return false;
	}

	public boolean InscriptoElMismoDia(Participante unParticipante) {

		if (participantes.contains(unParticipante) && (unParticipante.tienePuntos())) {

			return true;
		}
		return false;
	}

}
