package br.com.sosWeb.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

//Fabrica de Conexões de todo o Projeto
//EntityManagerFactory é uma operação muito custosa e não vale a pena repeti-la diversas vezes. 
//Nesse caso o ideal é deixar o EntityManagerFatory como static, ou seja uma intância para toda a aplicação.
public class JpaUtil {

	// createEntityManagerFactory("sosPU"), com esse comando, a JPA procurará
	// pelo arquivo persistence.xml, e fara a leitura das entidades mapeadas,
	// validação de conexão com o banco de dados e caso configurado a JPA também
	// poderá validar se o schema do banco de dados esta correto, criar tabelas,
	// criar sequences etc.
	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("sosPU");

	public static void main(String args[]) throws Exception {

		EntityManager em = emf.createEntityManager();
		em.close();
	}
}
