package br.ucsal.jogo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class Engine {

	
	private List<Personagem> personagens;
	//private Personagem p2;
	
	
	public Engine(List<Personagem> lutadores) {
		this.personagens = lutadores;
	}
	
	
	public void batalha() {
		
		Personagem change;
		boolean isAlive = true;
		int ataque = 0;
		int defesa = 1;
		while(isAlive) {
			Personagem a = personagens.get(ataque);
			Personagem d =personagens.get(defesa);
			int dano = (a.getAtaque()-d.getDefesa());
			d.setVida(d.getVida()-dano);
			isAlive = (d.getVida()>0);
			ataque = ataque + 1;
			defesa = defesa + 1;
			ataque = ataque >= personagens.size()?0:ataque;
			defesa = defesa >= personagens.size()?0:defesa;
		}
		
		int i = 1;
		for (Personagem personagem : personagens) {
			System.out.println("Personagem "+i+ " "+ (personagem.getVida()>0?"VENCEU":"PERDEU") );
			i++;
		}
		
	}
	
	
	
}
