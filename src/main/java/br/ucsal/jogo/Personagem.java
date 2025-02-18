package br.ucsal.jogo;

public class Personagem {
	
	
	private Integer vida;
	
	private Integer ataque;
	
	private Integer defesa;
	
	
	
	public Personagem(Integer vida, Integer ataque, Integer defesa) {
		super();
		this.vida = vida;
		this.ataque = ataque;
		this.defesa = defesa;
	}

	public Integer getDefesa() {
		return defesa;
	}

	public void setDefesa(Integer defesa) {
		this.defesa = defesa;
	}

	public Integer getAtaque() {
		return ataque;
	}

	public void setAtaque(Integer ataque) {
		this.ataque = ataque;
	}

	public Integer getVida() {
		return vida;
	}

	public void setVida(Integer vida) {
		this.vida = vida;
	}
	
	
	
	

}
