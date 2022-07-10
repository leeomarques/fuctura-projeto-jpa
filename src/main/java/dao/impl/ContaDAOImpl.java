package dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import dao.ContaDAO;
import model.Conta;
import model.util.JpaUtil;

public class ContaDAOImpl implements ContaDAO {

	private EntityManager em;
	private EntityTransaction et;

	@Override
	public void salvar(Conta conta) {
		try {
			this.em = JpaUtil.getEntityManager();
			et = em.getTransaction();
			et.begin();
			em.persist(conta);
			et.commit();
		} catch (Exception e) {
			if (em.isOpen()) {
				et.rollback();
			}
			System.out.println("Erro transacao");
		} finally {
			if (em.isOpen()) {
				em.close();
			}
		}

	}

	@Override
	public void alterar(Conta conta) {
		try {
			this.em = JpaUtil.getEntityManager();
			et = em.getTransaction();
			et.begin();
			em.merge(conta);
			et.commit();
		} catch (Exception e) {
			if (em.isOpen()) {
				et.rollback();
			}
			System.out.println("Erro transacao");
		} finally {
			if (em.isOpen()) {
				em.close();
			}
		}

	}

	@Override
	public void remover(int numero) {
		try {
			this.em = JpaUtil.getEntityManager();
			et = em.getTransaction();
			et.begin();
			em.remove(em.find(Conta.class, numero));
			et.commit();
		} catch (Exception e) {
			if (em.isOpen()) {
				et.rollback();
			}
			System.out.println("Erro transacao");
		} finally {
			if (em.isOpen()) {
				em.close();
			}
		}

	}

	@Override
	public Conta pesquisar(int numero) {
		Conta conta = new Conta();

		try {
			this.em = JpaUtil.getEntityManager();
			conta = em.find(Conta.class, numero);
		} catch (Exception e) {
			if (em.isOpen()) {
				et.rollback();
			}
			System.out.println("Erro transacao");
		} finally {
			if (em.isOpen()) {
				em.close();
			}
		}
		return conta;
	}

	@Override
	public List<Conta> listarTodos() {
		// TODO Auto-generated method stub
		return null;
	}

}
