package application;

import java.util.List;
import java.util.Random;

import model.Jogo;
import model.Tabela;
import model.Time;

public class Program {

	public static void main(String[] args) {
		Tabela t = new Tabela();
		Time flamengo = new Time("Flamengo");
		Time sport = new Time("Sport");
		
		Jogo jogo1 = new Jogo(sport, flamengo);
		jogo1.setResultado(getGols(), getGols());
		Jogo jogo2 = new Jogo(sport, flamengo);
		jogo2.setResultado(getGols(),getGols());
		Jogo jogo3 = new Jogo(sport, flamengo);
		jogo3.setResultado(getGols(),getGols());
		
		t.addJogo(jogo1);
		t.addJogo(jogo2);
		t.addJogo(jogo3);
		
		List<Jogo> jogos = t.getTabela();
		
		for(Jogo j : jogos) {
			System.out.println(j.getPlacar());
		}
		System.out.println();
		
		System.out.println(jogos.get(0).getTime1());
		System.out.println(jogos.get(0).getTime2());
		
		System.out.println("Lider " + t.getLider().getNome());
		System.out.println("Lanterna " + t.getLanterna().getNome());
	}
	
	public static int getGols() {
		return new Random().nextInt(10) + 0;
	}
}
