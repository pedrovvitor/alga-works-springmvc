package classe;

public class ProdutoTeste {

	public static void main(String[] ags) {

		Produto p1 = new Produto("notebook", 4356.89);

		var p2 = new Produto();
		p2.nome = "Caneta Preta";
		p2.preco = 12.56;
		Produto.desconto = 0.3;
		
		System.out.println(p2.nome);
		System.out.println(p1.nome);

		double media = (p1.precoComDesconto() + p2.precoComDesconto(0)) / 2;
		System.out.printf("Média do carrinho é R$%.2f", media);

	}
}
