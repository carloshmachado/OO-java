package br.edu.unicesumar.recibo;

import java.util.ArrayList;
import java.util.List;

public class Servico {
	private Double valor;

	private String valorDescritivo;
	private String descricao;

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public String getValorDescritivo() {
		return valorDescritivo;
	}

	public void setValorDescritivo(String valorDescritivo) {
		this.valorDescritivo = valorDescritivo;
	}

	public String gerarValorDescrito(Integer valor) {
		List<Integer> listaDeValores = new ArrayList<Integer>();
		listaDeValores.add(0);
		listaDeValores.add(10);
		listaDeValores.add(20);

		for (Integer valorNoMomento : listaDeValores) {
			System.out.println(valorNoMomento);
		}

		try {
			for (int i = 0; i < 10; i++) {
				System.out.println(listaDeValores.get(i));
			}

		} catch (IndexOutOfBoundsException e) {
			System.out.println(e);
		} finally{
			//liberarValorDaMemoria();
		}
		

		if (!listaDeValores.contains(valor)) {
			return "";
		}

		switch (valor) {
		case 0:
			return "ZERO";
		case 10:
			return "DEZ";
		case 20:
			return "VINTE";
		default:
			return "";
		}
	}

	public void exemploFor() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}

	}

}
