package com.br.zup.model;

public class PizzaModel {
	private String Sabor;
	private String Massa;
	private String TipoDeBorda;
	private int Valor;
	
	public PizzaModel () {
		
	}

	public PizzaModel(String sabor, String massa, String tipoDeBorda, int valor) {
		this.Sabor = sabor;
		this.Massa = massa;
		this.TipoDeBorda = tipoDeBorda;
		this.Valor = valor;
	}

	public String getSabor() {
		return Sabor;
	}

	public void setSabor(String sabor) {
		Sabor = sabor;
	}

	public String getMassa() {
		return Massa;
	}

	public void setMassa(String massa) {
		Massa = massa;
	}

	public String getTipoDeBorda() {
		return TipoDeBorda;
	}

	public void setTipoDeBorda(String tipoDeBorda) {
		TipoDeBorda = tipoDeBorda;
	}

	public int getValor() {
		return Valor;
	}

	public void setValor(int valor) {
		Valor = valor;
	}
	
	@Override
	public String toString() {
		StringBuilder modelo = new StringBuilder();
		
		modelo.append("Sabor: " + this.getSabor());
		modelo.append("\n");
		modelo.append("Massa: " + this.getMassa());
		modelo.append("\n");
		modelo.append("Tipo de Borda: " + this.getTipoDeBorda());
		modelo.append("\n");
		modelo.append("Valor: " +this.getValor());
		
		return modelo.toString();
	}
	
	
}
