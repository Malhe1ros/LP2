package IMD.Academia.modelo;

import java.util.ArrayList;

public class Personal extends Usuario {
	private ArrayList<Aluno> alunos;
	
	public Personal(String nome, String cpf, String login, String senha) {
		super(nome, cpf, login, senha);
	}



	public void adicionarAluno(Aluno al) {
		alunos.add(al);
	}

		

	
}
