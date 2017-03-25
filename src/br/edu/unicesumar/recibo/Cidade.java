package br.edu.unicesumar.recibo;

public class Cidade {

	private String nome;
	private Uf uf = Uf.PR;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Uf getUf() {
		return uf;
	}

	public void setUf(Uf uf) {
		this.uf = uf;
	}

}
