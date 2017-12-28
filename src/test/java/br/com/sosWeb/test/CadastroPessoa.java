package br.com.sosWeb.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.sosWeb.model.Pessoa;

public class CadastroPessoa {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("sosPU");
		EntityManager em = emf.createEntityManager();

		Pessoa pessoa = new Pessoa();
		pessoa.setNome("José Orlando");
		pessoa.setCpf("999.666.777-88");
		pessoa.setRg("226896-3");
		pessoa.setTelefone("(61)3333-8888");
		pessoa.setCelular("(6199999-1888");
		pessoa.setEmail("orlando.mane@uol.com");
		pessoa.setCidade("Planaltina");
		pessoa.setEstado("GO");
//		pessoa.setComplemento("Proximo a Favela da Rocinha");
		pessoa.setBairro("Setor Perdido Norte");
		pessoa.setCep("73737-012");
		pessoa.setRua("S/N");
		

		em.getTransaction().begin();
		em.persist(pessoa);
		em.getTransaction().commit();

		System.out.println("Pessoa Cadastrado Com Sucesso!!");
		em.close();

	}

}
