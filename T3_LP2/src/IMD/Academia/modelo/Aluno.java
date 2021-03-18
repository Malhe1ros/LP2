package IMD.Academia.modelo;

import java.util.ArrayList;

import IMD.Academia.controle.BancodeDados;

public class Aluno extends Usuario{
	private ArrayList<Treino> treino;
	private Double mensalidade;
	private Boolean EmDia;
	private Personal personal;

	public Aluno(String nome, String cpf, String login, String senha, Double mensalidade, Boolean emDia) {
		super(nome, cpf, login, senha);
		this.mensalidade = mensalidade;
		EmDia = emDia;
	}

	private ArrayList<Treino> consultaTreino() {
		return treino;
	}
	
	private Boolean pagar() {
		//Se ja tiver pago nao da pra pagar;
		if (EmDia) return false;
		EmDia=true;
		return true;
	}
	
	private Boolean encerraCadastro() {
		return true;
		//lembrar de sair da tela dele
	}
	private Boolean contrataPersonal(Personal p) {
		p.adicionarAluno(this);
		return true;
	} 
	
	
	public void setTreino(ArrayList<Treino> treino) {
		this.treino = treino;
	}

	public Double getMensalidade() {
		return mensalidade;
	}

	public void setMensalidade(Double mensalidade) {
		this.mensalidade = mensalidade;
	}

	public Boolean getEmDia() {
		return EmDia;
	}

	public void setEmDia(Boolean emDia) {
		EmDia = emDia;
	}
	

	
}
