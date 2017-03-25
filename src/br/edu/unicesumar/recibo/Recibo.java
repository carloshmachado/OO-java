package br.edu.unicesumar.recibo;

import java.util.Date;

public class Recibo {

	private Integer id = 15545;
	private Integer numero;
	private Servico servico;
	private Boolean confirmacao;
	private Pagador pagador;
	
	private Cidade cidade;
	private Date dataConfirmacao;
	private Date dataCadastro = new Date();
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	public Servico getServico() {
		return servico;
	}
	public void setServico(Servico servico) {
		this.servico = servico;
	}
	public Boolean getConfirmacao() {
		return confirmacao;
	}
	public void setConfirmacao(Boolean confirmacao) {
		this.confirmacao = confirmacao;
	}
	public Pagador getPagador() {
		return pagador;
	}
	public void setPagador(Pagador pagador) {
		this.pagador = pagador;
	}
	public Cidade getCidade() {
		return cidade;
	}
	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}
	public Date getDataConfirmacao() {
		return dataConfirmacao;
	}
	public void setDataConfirmacao(Date dataConfirmacao) {
		this.dataConfirmacao = dataConfirmacao;
	}
	public Date getDataCadastro() {
		return dataCadastro;
	}
	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	
	
}
