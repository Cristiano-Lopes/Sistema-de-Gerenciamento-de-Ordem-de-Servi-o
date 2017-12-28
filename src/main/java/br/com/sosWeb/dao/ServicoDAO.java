package br.com.sosWeb.dao;

import java.io.Serializable;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import br.com.sosWeb.model.Servico;
import br.com.sosWeb.util.jpa.Transactional;

public class ServicoDAO implements Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	private EntityManager em;

	@Transactional
	public void salvar(Servico servico) {
		em.persist(servico);
	}
}
