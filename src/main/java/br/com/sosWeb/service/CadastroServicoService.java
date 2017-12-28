package br.com.sosWeb.service;

import java.io.Serializable;

import javax.inject.Inject;

import br.com.sosWeb.dao.ServicoDAO;
import br.com.sosWeb.model.Servico;

public class CadastroServicoService implements Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	private ServicoDAO servicoDAO;

	public void salvar(Servico servico) throws NegocioException {
		this.servicoDAO.salvar(servico);
	}

}
