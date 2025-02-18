package br.ucsal.jogo;

public class Engine {

	
	private Personagem p1;
	private Personagem p2;
	
	
	public Engine(Personagem p1, Personagem p2) {
		super();
		this.p1 = p1;
		this.p2 = p2;
	}
	
	
	public void batalha() {
		
		Personagem ataque = p1;
		Personagem defesa = p2;
		Personagem change;
		while(p1.getVida() > 0 && p2.getVida() > 0) {
			Integer dano =(ataque.getAtaque() - defesa.getDefesa());
			defesa.setVida(defesa.getVida() - dano);
			change = defesa;
			defesa = ataque;
			ataque = change;
		}
		
		if(p1.getVida() <= 0) {
			System.out.println("P2  WIN" );
		}else {
			System.out.println("P1  WIN" );
		}
		
	}
	
	
	
}
