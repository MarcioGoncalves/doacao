package com.doacao.interfaces.jsf;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.doacao.dominio.entidade.Campanha;

@ManagedBean
@SessionScoped
public class VisaoCampanhasManagedBean {
	private List<Campanha> campanhas = new ArrayList<Campanha>();

	public VisaoCampanhasManagedBean() {
	}

	@PostConstruct
	public void alimentarListaCampanhas() {
		for (int i = 1; i <= 10; i++) {
			Campanha campanha = new Campanha();
			campanha.setId(i);
			campanha.setNome("Campanha#" + i);
			this.campanhas.add(campanha);
		}
	}

	public List<Campanha> getCampanhas() {
		return campanhas;
	}

	public void setCampanhas(List<Campanha> campanhas) {
		this.campanhas = campanhas;
	}

}
