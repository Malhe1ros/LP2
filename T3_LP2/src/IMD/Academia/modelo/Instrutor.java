package IMD.Academia.modelo;

import java.util.ArrayList;

public class Instrutor extends Usuario {


	public Instrutor(String nome, String cpf, String login, String senha) {
		super(nome, cpf, login, senha);
	}

	public Treino criaTreino(String nomeDoTreino,ArrayList<String> treinos) {
		Treino t=new Treino(nomeDoTreino);
		t.exerc=treinos;
		return t;
	}

}
