package model.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import model.Time;

public class TimeTeste {
	Time time = new Time("Barcelona");
	
	@Test
	public void getPontosAposDerrota() {
		time.derrota();
		assertEquals(0, time.getPontos());
	}
	
	@Test
	public void getPontosAposVitoria() {
		time.vitoria();
		assertEquals(3, time.getPontos());
	}
	
	@Test
	public void getPontosAposEmpate() {
		time.empate();
		assertEquals(1, time.getPontos());
	}
	
}
