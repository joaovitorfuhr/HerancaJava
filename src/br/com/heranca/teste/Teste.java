package br.com.heranca.teste;

import static org.junit.Assert.*;

import org.junit.Test;

public class Teste {

	@Test
	public void primeiroteste() {
		Gerente gerente = new Gerente();
		gerente.Senha(4444);
		assertEquals(gerente.autentica(4444), true);
	}

	@Test
	public void segundoteste() {
		Gerente gerente = new Gerente();
		gerente.Senha(4321);
		assertEquals(gerente.autentica(4322), false);
	}

	@Test
	public void terceiroteste() {
		Gerente gerente = new Gerente();
		gerente.Nome("Eu");
		assertEquals(gerente.GetNome(), "Eu");
	}

	@Test
	public void quartoteste() {
		Gerente gerente = new Gerente();
		gerente.Cpf("1122133245");
		assertEquals(gerente.Getcpf(), "1122133245");

	}

}