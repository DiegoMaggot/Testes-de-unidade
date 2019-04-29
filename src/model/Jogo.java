package model;

public class Jogo {
	private Time time1;
	private Time time2;
	private int golsTime1;
	private int golsTime2;
	private String placar;
	
	public Jogo(Time time1, Time time2) {
		this.time1 = time1;
		this.time2 = time2;
		this.golsTime1 = 0;
		this.golsTime2 = 0;
	}
	
	public void setResultado(int golsT1, int golsT2) {
		golsTime1 = golsT1;
		golsTime2 = golsT2;
		
		if(golsTime1 > golsTime2) {
			time1.vitoria()
			.golsMarcados(golsTime1)
			.golsSofridos(golsTime2);
			 
			time2.derrota()
			.golsMarcados(golsTime2)
			.golsSofridos(golsTime1);
		} else if (golsTime2 > golsTime1) {
			time1.derrota()
			.golsMarcados(golsTime1)
			.golsSofridos(golsTime2);
			
			time2.vitoria()
			.golsMarcados(golsTime2)
			.golsSofridos(golsTime1);
		} else {
			time1.empate()
			.golsMarcados(golsTime1)
			.golsSofridos(golsTime2);
			
			time2.empate()
			.golsMarcados(golsTime2)
			.golsSofridos(golsTime1);
		}
		this.placar = String.format("%s %d-%d %s ", time1.getNome(), golsTime1, golsTime2, time2.getNome());
	}
	
	public String getPlacar() {
		return this.placar;
	}
	
	public int getGolsTime1() {
		return golsTime1;
	}
	
	public Time getTime1() {
		return this.time1;
	}
	
	public int getGolsTime2() {
		return golsTime2;
	}
	
	public Time getTime2() {
		return this.time2;
	}
}
