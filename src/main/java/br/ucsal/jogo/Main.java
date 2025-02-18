package br.ucsal.jogo;

public class Main {
	
	public static void main(String[] args) {
		Personagem p1 = new Personagem(100, 10, 5);
		Personagem p2 = new Personagem(100, 10, 7);
		System.out.println("Jogar");
		Engine e = new Engine(p1,p2);
		e.batalha();
	}
	

}
