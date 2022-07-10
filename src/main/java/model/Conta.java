package model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Conta {

	@Id
	private Integer numero;

	private double saldo;

	private double limite;

	public Conta() {
		super();
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

}
