package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class BootCamp {

	private String nome;
	private String descrição;
	private LocalDate dataInicial;
	private LocalDate dataFinal;
	
	public BootCamp(String nome, String descrição, LocalDate dataInicial, LocalDate dataFinal) {
		super();
		this.nome = nome;
		this.descrição = descrição;
		this.dataInicial = dataInicial;
		this.dataFinal = dataFinal;
	}

	public String getNome() {
		return nome;
	}

	public String getDescrição() {
		return descrição;
	}

	public LocalDate getDataInicial() {
		return dataInicial;
	}

	public LocalDate getDataFinal() {
		return dataFinal;
	}
	
	
	
	
}
