package br.ucsal.jogo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main {
	
	public static void main(String[] args) {
		Personagem p1 = new Personagem(100, 10, 14);
		Personagem p2 = new Personagem(100, 15, 7);
		Personagem p3 = new Personagem(100, 30, 10);
		System.out.println("Jogar");
		List<Personagem> lista = new ArrayList<Personagem>();
		lista.add(p1);
		lista.add(p2);
		lista.add(p3);
		Engine e = new Engine(lista);
		e.batalha();
		
		
		Map<String,String> mapa = new TreeMap<String, String>();
		
		mapa.put("Joao", "30");
		mapa.put("Maria", "28");
		mapa.put("Ana", "27");
		
		Set<String> s = new TreeSet<String>(mapa.values());
		for (String nome : mapa.values()) {
			System.out.println(nome);
		}
		
		
		
		
		
		
	}
	

}
