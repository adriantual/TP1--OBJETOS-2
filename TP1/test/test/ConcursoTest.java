package test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import Clases.Concurso;
import Clases.Participante;

class ConcursoTest {

	@Test
	public void UnParticipanteSeInscribeEnUnConcursotest() {

		LocalDate fecha1 = LocalDate.of(2023, 03, 01);
		// LocalDate fecha1 = LocalDate.now();
		LocalDate fecha2 = LocalDate.of(2023, 03, 31);
		Concurso primerConcurso = new Concurso("ejemplo", fecha1, fecha2);
		Participante unParticipante = new Participante("Adrian", "Antual", 25896325);
		primerConcurso.inscribirParticipante(unParticipante);
		assertTrue(primerConcurso.estaInscripto(unParticipante));

		// assert (verifica si el participante esta en el concurso hace buleano en clase
		// concurso
	}

	@Test

	public void UnParticipanteSeInscribeEnUnConcursoElPrimerDíaDeAbiertaLaInscripción() {
		LocalDate fecha1 = LocalDate.now();
		LocalDate fecha2 = LocalDate.parse("2023-03-31");
		Concurso primerConcurso = new Concurso("ejemplo", fecha1, fecha2);
		Participante unParticipante1 = new Participante("Adriaan", "Antuaal", 25996325);
		primerConcurso.inscribirParticipante(unParticipante1);
		assertTrue(primerConcurso.InscriptoElMismoDia(unParticipante1));

	}

	@Test
	public void UnParticipanteIntentaInscribirseFueraDelRangoDeInscripción() {
		LocalDate fecha1 = LocalDate.of(2023, 4, 5);
		LocalDate fecha2 = LocalDate.parse("2023-03-31");
		Concurso primerConcurso = new Concurso("ejemplo", fecha1, fecha2);
		Participante unParticipante = new Participante("Adrian", "Antual", 25896325);
		assertFalse(primerConcurso.estaInscripto(unParticipante));
	}

}
