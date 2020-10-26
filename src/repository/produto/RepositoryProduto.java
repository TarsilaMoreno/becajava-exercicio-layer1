package repository.produto;

import model.produto.Produto;
import java.util.ArrayList;
import java.util.List;

public class RepositoryProduto {

	List<Produto> lista = new ArrayList<Produto>();

	public Produto getProduto(int indice) {

		Produto produto = new Produto();

		produto.nome = "Garrafa";
		produto.valor = 2.00;
		produto.imposto = 0.5;
		produto.quantidade = 12;

		produto = new Produto();
		produto.nome = "Tênis";
		produto.valor = 100.00;
		produto.imposto = 1.5;
		produto.quantidade = 2;

		produto = new Produto();
		produto.nome = "Notebook";
		produto.valor = 6000.00;
		produto.imposto = 5.0;
		produto.quantidade = 1;

		produto = new Produto();
		produto.nome = "Mouse";
		produto.valor = 80.00;
		produto.imposto = 2.0;
		produto.quantidade = 3;

		return lista.get(indice);

	}

	public void setProduto(Produto produto) {
		lista.add(produto);

	}
}
