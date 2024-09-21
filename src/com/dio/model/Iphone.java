package com.dio.model;

import java.util.Random;

public class Iphone implements AparelhoTelefonico, ReprodutorMusical, NavegadorInternet {

	@Override
	public void exibirPagina(String url) {
		atualizarPagina();
		System.out.println("Exibindo Página: " + url);
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Abrindo nova aba do navegador..");
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Página Atualizada.");
	}

	@Override
	public void selecionarMusica(String musica) {
		System.out.println("Música selecionada: " + musica);
		tocar();
	}

	@Override
	public void tocar() {
		System.out.println("Reproduzindo Música..");
	}

	@Override
	public void pausar() {
		System.out.println("Música pausada.");
	}

	@Override
	public void ligar(String numero) {
		System.out.println("Ligando para o número: " + numero);
		boolean atendeu = new Random().nextInt(3) == 1;
		
		if(atendeu == true) {
			System.out.println("Ligação Atendida com Sucesso");
		} else {
			System.out.println("Ligação Não Atendida");
			iniciarCorreioVoz();
		}
	}

	@Override
	public void atender() {
		System.out.println("Atendendo chamada.");
	}

	@Override
	public void iniciarCorreioVoz() {
	System.out.println("Iniciando Correio de Voz..");
		
	}
	
	
}
