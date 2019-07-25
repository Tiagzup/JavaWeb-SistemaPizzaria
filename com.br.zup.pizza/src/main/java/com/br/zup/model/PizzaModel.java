package com.br.zup.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotBlank;

@Entity
public class PizzaModel implements Serializable {
	public static final long serialVersionUID = 1l;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@NotBlank(message = "O campo precisa sem preenchido")
	private String sabor;
	@NotBlank(message = "O campo precisa sem preenchido")
	private String massa;
	@NotBlank(message = "O campo precisa sem preenchido")
	private String tipoDeBorda;
	@DecimalMin(value = "10")
	private int valor;

	public PizzaModel() {

	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getSabor() {
		return sabor;
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
	}

	public String getMassa() {
		return massa;
	}

	public void setMassa(String massa) {
		this.massa = massa;
	}

	public String getTipoDeBorda() {
		return tipoDeBorda;
	}

	public void setTipoDeBorda(String tipoDeBorda) {
		this.tipoDeBorda = tipoDeBorda;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

}
