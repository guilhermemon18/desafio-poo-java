package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo{

	private LocalDate dataMentoria;
	
	public Mentoria(String titulo, String descricao, LocalDate dataMentoria) {
		super();
		this.titulo = titulo;
		this.descricao = descricao;
		this.dataMentoria = dataMentoria;
	}


	public LocalDate getDataMentoria() {
		return dataMentoria;
	}
	
	@Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }

	@Override
	public String toString() {
		return "Mentoria [titulo=" + titulo + ", descricao=" + descricao + ", dataMentoria=" + dataMentoria + "]";
	}


	
	
	
	
}
