package br.com.heranca;

public class heranca {

class Funcionario {
	String nome;
	String cpf;
	double salario;
}


class Gerente {
	String nome;
	String cpf;
	double salario;
	int senha;
	int numeroDeFuncionariosGerenciados;
public boolean autentica(int senha) {
	if (this.senha == senha) {
	System.out.println("Acesso Permitido!");
	return true;
} else {
	System.out.println("Acesso Negado!");
	return false;
	}
}

}