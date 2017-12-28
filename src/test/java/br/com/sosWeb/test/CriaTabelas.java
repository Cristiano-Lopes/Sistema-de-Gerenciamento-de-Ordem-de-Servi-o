package br.com.sosWeb.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class CriaTabelas {

	public static void main(String[] args) {
		// EntityManagerFactory cria instancias de um EntityManager determina os
		// parâmetros de configuração que vão dizer como será o funcionamento do
		// Entity Manager
		// retorna o EntityManagerFactory para um nome de unidade de
		// persistência específico.
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("sosPU");
		EntityManager manager = factory.createEntityManager();

		EntityTransaction trx = manager.getTransaction();
		trx.begin();// Inicia os recursos da transação

		trx.commit();// Confirma a transação corrente

	}

}
