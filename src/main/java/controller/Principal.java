package controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import dao.ContaDAO;
import dao.impl.ContaDAOImpl;
import model.Conta;
import model.util.JpaUtil;

public class Principal {

	public static void main(String[] args) {
		EntityManager em = JpaUtil.getEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.close();

		Conta c = new Conta();
		c.setLimite(1000000);
		c.setNumero(10000);
		c.setSaldo(5000);
		
		ContaDAO cdao = new ContaDAOImpl();
		cdao.pesquisar(10000);

	}

}
