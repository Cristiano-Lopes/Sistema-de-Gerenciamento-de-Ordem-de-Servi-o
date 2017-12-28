package br.com.sosWeb.controller;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.sosWeb.model.Servico;
import br.com.sosWeb.service.CadastroServicoService;
import br.com.sosWeb.service.NegocioException;

@Named
@ViewScoped
public class CadastroServicoBean implements Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	private CadastroServicoService cadastroServicoService;

	private Servico servico;

	@PostConstruct
	public void init() {
		this.limpar();
	}

	public void limpar() {
		this.servico = new Servico();
	}

	public void salvar() {
		try {
			this.cadastroServicoService.salvar(servico);

		} catch (NegocioException e) {
			e.printStackTrace();
		}
	}

	public CadastroServicoService getCadastroServicoService() {
		return cadastroServicoService;
	}

	public void setCadastroServicoService(CadastroServicoService cadastroServicoService) {
		this.cadastroServicoService = cadastroServicoService;
	}

	public Servico getServico() {
		return servico;
	}

	public void setServico(Servico servico) {
		this.servico = servico;
	}

}
