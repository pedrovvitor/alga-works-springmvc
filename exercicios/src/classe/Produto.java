package classe;

public class Produto {

	String nome;
	double preco;
	static double desconto = 0.25;
	String marca;

	public Produto() {
		super();
	}

	public Produto(String nome, double preco) {
		super();
		this.nome = nome;
		this.preco = preco;
	}

	public double precoComDesconto() {
		return preco * (1 - desconto);
	}

	public double precoComDesconto(double descontoDoGerente) {
		return preco * (1 - desconto - descontoDoGerente);
	}
}
