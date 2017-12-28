package br.com.sosWeb.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.sosWeb.model.Servico;

public class CadastroServicoTest {

	public static void main(String args[]) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("sosPU");
		EntityManager em = emf.createEntityManager();

		Servico servico = new Servico();
		servico.setDescricao("Backup");

		em.getTransaction().begin();
		em.persist(servico);
		em.getTransaction().commit();

		System.out.println("Servico Salvo com sucesso!");
		em.close();
	}

}
