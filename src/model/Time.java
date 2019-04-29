package model;

public class Time implements Comparable<Time> {
	private String nome;
	private int golsMarcados;
	private int golsSofridos;
	private int qntVitorias;
	private int qntEmpates;
	private Integer qntDerrotas;
	private Integer pontos;
	
	public Time(String nome) {
		this.nome = nome;
		this.golsMarcados = 0;
		this.golsSofridos = 0;
		this.qntDerrotas = 0;
		this.qntEmpates = 0;
		this.qntVitorias = 0;
		this.pontos = 0;
	}

	public String getNome() {
		return nome;
	}

	public int getPontos() {
		return pontos;
	}

	public int getGolsMarcados() {
		return golsMarcados;
	}

	public Time golsMarcados(int golsMarcados) {
		this.golsMarcados += golsMarcados;
		return this;
	}

	public int getGolsSofridos() {
		return golsSofridos;
	}

	public Time golsSofridos(int golsSofridos) {
		this.golsSofridos += golsSofridos;
		return this;
	}

	public int getQntVitorias() {
		return qntVitorias;
	}

	public Time vitoria() {
		this.qntVitorias += 1;
		this.pontos += 3;
		return this;
	}

	public int getEmpates() {
		return qntEmpates;
	}

	public Time empate() {
		this.qntEmpates += 1;
		this.pontos += 1;
		return this;
	}

	public int getDerrotas() {
		return qntDerrotas;
	}

	public Time derrota() {
		this.qntDerrotas += 1;
		return this;
	}
	
	@Override
	public int compareTo(Time time) {
		return pontos.compareTo(time.getPontos());
	}

	@Override
	public String toString() {
		return String.format("Nome: %s%nPontos: %d%nGols Marcados: %d%nGols Sofridos: %d%nVitórias: %d%nEmpates: %d%nDerrotas: %d%n"
				, nome, pontos, golsMarcados, golsSofridos, qntVitorias,qntEmpates, qntDerrotas);
	}
}
