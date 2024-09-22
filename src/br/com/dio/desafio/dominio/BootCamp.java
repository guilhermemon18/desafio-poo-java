package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class BootCamp {

	private String nome;
	private String descri��o;
	private LocalDate dataInicial;
	private LocalDate dataFinal;
	
	public BootCamp(String nome, String descri��o, LocalDate dataInicial, LocalDate dataFinal) {
		super();
		this.nome = nome;
		this.descri��o = descri��o;
		this.dataInicial = dataInicial;
		this.dataFinal = dataFinal;
	}

	public String getNome() {
		return nome;
	}

	public String getDescri��o() {
		return descri��o;
	}

	public LocalDate getDataInicial() {
		return dataInicial;
	}

	public LocalDate getDataFinal() {
		return dataFinal;
	}
	
	
	
	
}
