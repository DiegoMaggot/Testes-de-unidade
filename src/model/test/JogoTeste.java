package model.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import model.Jogo;
import model.Time;

public class JogoTeste {
	Jogo jogo = new Jogo(new Time("Barcelona"), new Time("Real Madrid"));
	
	@Test
	public void getVitoria() {
		jogo.setResultado(6, 3);

		assertEquals(1 , jogo.getTime1().getQntVitorias());
		assertEquals(0 , jogo.getTime2().getQntVitorias());
	}
	
	@Test
	public void getEmpate() {
		jogo.setResultado(5, 5);

		assertEquals(1 , jogo.getTime1().getEmpates());
		assertEquals(1, jogo.getTime2().getEmpates()); 
	}
	
	@Test
	public void getDerrota() {
		jogo.setResultado(5, 6);

		assertEquals(1 , jogo.getTime1().getDerrotas());
		assertEquals(0, jogo.getTime2().getDerrotas()); 
	}
	
}
