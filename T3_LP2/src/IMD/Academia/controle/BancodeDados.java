package IMD.Academia.controle;

import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;

import IMD.Academia.modelo.Aluno;
import IMD.Academia.modelo.Instrutor;
import IMD.Academia.modelo.Personal;
import IMD.Academia.modelo.Recepcionista;
import IMD.Academia.modelo.Usuario;

public class BancodeDados {
	protected HashMap<String,String> info;
	protected HashMap<String,Usuario> loginAluno;
	protected Set<Aluno> alunos;
	protected Set<Personal> personais;
	protected Set<Recepcionista> recepcionistas;
	protected Set<Instrutor> instrutores;
	public BancodeDados() {
		Set<Aluno> alunos=new TreeSet<Aluno>();
		Set<Personal> personais=new TreeSet<Personal>();
		Set<Recepcionista> recepcionistas=new TreeSet<Recepcionista>();
		Set<Instrutor> instrutores=new TreeSet<Instrutor>();
		HashMap<String,String> info = new HashMap<String,String>();
		HashMap<String,Usuario> loginAluno = new HashMap<String,Usuario>();
	}
	public boolean cadastraAluno(Aluno al) {
		if (alunos.contains(al))return false;
		alunos.add(al);
		info.put(al.getLogin(), al.getSenha());
		loginAluno.put(al.getLogin(),al);
		return true;
	}
	public boolean apagaAluno(Aluno al) {
		if (!alunos.contains(al))return false;
		alunos.remove(al);
		info.remove(al.getLogin(),al.getSenha());
		loginAluno.remove(al.getLogin());
		return true;
	}
	public boolean cadastraPersonal(Personal al) {
		if (personais.contains(al))return false;
		personais.add(al);
		info.put(al.getLogin(), al.getSenha());
		loginAluno.put(al.getLogin(),al);
		return true;
	}
	public boolean apagaPersonal(Personal al) {
		if (!personais.contains(al))return false;
		personais.remove(al);
		info.remove(al.getLogin(),al.getSenha());
		loginAluno.remove(al.getLogin());
		return true;	
		}
	public boolean cadastraInstrutor(Instrutor al) {
		if (instrutores.contains(al))return false;
		instrutores.add(al);
		info.put(al.getLogin(), al.getSenha());
		loginAluno.put(al.getLogin(),al);
		return true;
	}
	public boolean apagaInstrutor(Instrutor al) {
		if (!instrutores.contains(al))return false;
		instrutores.remove(al);
		info.remove(al.getLogin(),al.getSenha());
		loginAluno.remove(al.getLogin());
		return true;	
	}
	public boolean cadastraRecepcionista(Recepcionista al) {
		if (recepcionistas.contains(al))return false;
		recepcionistas.add(al);
		info.put(al.getLogin(), al.getSenha());
		loginAluno.put(al.getLogin(),al);
		return true;
	}
	public boolean apagaRecepcionista(Recepcionista al) {
		if (!recepcionistas.contains(al))return false;
		recepcionistas.remove(al);
		info.remove(al.getLogin(),al.getSenha());
		loginAluno.remove(al.getLogin());
		return true;	
	}
	
	
}

