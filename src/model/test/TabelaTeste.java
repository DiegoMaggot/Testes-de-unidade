package model.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import model.Jogo;
import model.Tabela;
import model.Time;

public class TabelaTeste {
	Tabela tabela = new Tabela();
	Time flamengo = new Time("Flamengo");
	Time sport = new Time("Sport");
	Time real = new Time("Real Madrid");
	Time barcelona = new Time("Barcelona");
	Time santos = new Time("Santos");
	
	public Tabela getTabela() {
		if(tabela.getTabela().isEmpty()) {
			Jogo jogo1 = new Jogo(sport, barcelona);
			jogo1.setResultado(0,5);
			Jogo jogo2 = new Jogo(sport, flamengo);
			jogo2.setResultado(4,1);
			Jogo jogo3 = new Jogo(sport, real);
			jogo3.setResultado(0,5);
			Jogo jogo4 = new Jogo(sport, santos);
			jogo4.setResultado(0,2);
			Jogo jogo5 = new Jogo(flamengo, barcelona);
			jogo5.setResultado(2,6);
			Jogo jogo6 = new Jogo(flamengo, real);
			jogo6.setResultado(1,5);
			Jogo jogo7 = new Jogo(flamengo, santos);
			jogo7.setResultado(2,3);
			Jogo jogo8 = new Jogo(barcelona, santos);
			jogo8.setResultado(7,1);
			Jogo jogo9 = new Jogo(barcelona, real);
			jogo9.setResultado(6,3);
			Jogo jogo10 = new Jogo(real, santos);
			jogo10.setResultado(5,2);
			
			tabela.addJogo(jogo1);
			tabela.addJogo(jogo2);
			tabela.addJogo(jogo3);
			tabela.addJogo(jogo4);
			tabela.addJogo(jogo5);
			tabela.addJogo(jogo6);
			tabela.addJogo(jogo7);
			tabela.addJogo(jogo8);
			tabela.addJogo(jogo9);
			tabela.addJogo(jogo10);
		}
		return tabela;
	}
	
	@Test
	public void getLider() {
		assertEquals("Barcelona", getTabela().getLider().getNome());
	}
	
	@Test
	public void getLanterna() {
		assertEquals("Flamengo", getTabela().getLanterna().getNome());
	}
	
	@Test
	public void getZonaRebaixamento() {
		assertEquals("Flamengo" , getTabela().getZonaRebaixamento().get(0).getNome());
		assertEquals("Sport" , getTabela().getZonaRebaixamento().get(1).getNome());
		assertEquals("Santos" , getTabela().getZonaRebaixamento().get(2).getNome());
		assertEquals("Real Madrid" , getTabela().getZonaRebaixamento().get(3).getNome());
	}
}
