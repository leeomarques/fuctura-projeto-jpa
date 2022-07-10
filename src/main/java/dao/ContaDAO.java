package dao;

import java.util.List;

import model.Conta;

//como que um contrato, garante que irá realizar esses metodos abaixo
public interface ContaDAO {

	public void salvar(Conta conta);

	public void alterar(Conta conta);

	public void remover(int numero);

	public Conta pesquisar(int numero);

	public List<Conta> listarTodos();

}
