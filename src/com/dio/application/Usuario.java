package com.dio.application;

import java.util.Scanner;

import com.dio.model.Iphone;

public class Usuario {

	public static void main(String[] args) {
		
		
		Iphone iphone = new Iphone();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual aplicativo deseja utilizar? ");
		System.out.println("1- Ipod (Musica)  2- Safari (Navegador)   3- Phone (telefone)");
		int opcao = sc.nextInt();
		
		if(opcao == 1) {
			System.out.println("O que você quer ouvir? ");
			sc.nextLine();
			String nomeMusica = sc.nextLine();
			iphone.selecionarMusica(nomeMusica);
			System.out.println("Deseja pausar a musica? Y/N");
            String escolha = sc.nextLine();
            if(escolha.equals("Y")) {
			iphone.pausar();
            }
            
		} else if(opcao == 2) {
			System.out.println("Digite o nome do site para pesquisar: ");
			sc.nextLine();
			String nomeSite = sc.nextLine();
			iphone.exibirPagina(nomeSite);
			System.out.println("Deseja abrir uma nova aba? Y/N");
			String escolha = sc.nextLine();
			if(escolha.equals("Y")) {
				iphone.adicionarNovaAba();
			}
			
		} else if(opcao == 3) {
			System.out.println("Digite o número de telefone para realizar a ligação:");
			sc.nextLine();
			String numeroTelefone = sc.nextLine();
			iphone.ligar(numeroTelefone);
		} else {
			System.out.println("Opção inválida");
		}
		
		
		sc.close();
	}

}
