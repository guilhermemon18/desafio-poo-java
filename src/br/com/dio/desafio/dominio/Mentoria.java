package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria {

	private String titulo;
	private String descricao;
	private LocalDate dataMentoria;
	
	public Mentoria(String titulo, String descricao, LocalDate dataMentoria) {
		super();
		this.titulo = titulo;
		this.descricao = descricao;
		this.dataMentoria = dataMentoria;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public LocalDate getDataMentoria() {
		return dataMentoria;
	}
	
	public void calcularXp() {
		
	}
	
	
}
