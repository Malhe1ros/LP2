package IMD.Academia.modelo;

import java.util.ArrayList;

public class Treino {
	public String nome;
	public ArrayList<String> exerc;
	public Treino(String nome) {
		super();
		this.nome = nome;
	}
	//Botar alguns campos de escrita para inserir o treino;
	public void adicionaTreino(String s) {
		exerc.add(s);
	}
}
