package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Tabela {
	private List<Jogo> jogos;
	private List<Time> times; 
	
	public Tabela() {
		this.jogos = new ArrayList<>();
		this.times = new ArrayList<>();
	}
	
	public void addJogo(Jogo jogo) {
		jogos.add(jogo);
		adicionarTimes(jogo);
	}
	
	public List<Jogo> getTabela(){
		return jogos;
	}
	
	public Time getLanterna() {
		Collections.sort(times);
		return times.get(0);
	}
	
	public Time getLider() {
		Collections.sort(times);
		return times.get(times.size() - 1);
	}
	
	public List<Time> getZonaRebaixamento(){
		List<Time> zona = new ArrayList<>();
		for(int i = 0; i < 4; i++) {
			zona.add(getTimes().get(i));
		} 
		Collections.sort(zona);
		return zona;
	}
	
	public List<Time> getTimes(){
		Collections.sort(times);
		return times;
	}
	
	public void adicionarTimes(Jogo jogo) {
		if(!jaExiste(jogo.getTime1())) {
			times.add(jogo.getTime1());
		}
		if(!jaExiste(jogo.getTime2())) {
			times.add(jogo.getTime2());
		}
	}
	
	public boolean jaExiste(Time time) {
		for(Time t : times) {
			if(t.getNome().equals(time.getNome())){
				return true;
			}
		}
		return false;
	}
}
