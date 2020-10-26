package service.produto;

import model.produto.Produto;
import repository.produto.RepositoryProduto;

public class ServiceProduto {

	public Produto getProduto() {
		
		RepositoryProduto repository = new RepositoryProduto();
		Produto calculo = repository.getProduto();
		
		
	}

	}

	public Produto setProduto() {
		
	}
