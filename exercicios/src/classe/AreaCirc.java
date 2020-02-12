package classe;

public class AreaCirc {

	double raio;
	static final double PI = 3.14; // variável constante (finaol) de classe(static)

	AreaCirc(double raioInicial) {
		raio = raioInicial;
	}

	public double area() {
		return PI * Math.pow(raio, 2);
	}

	static double area(double raio) {
		return PI * Math.pow(raio, 2);
	}
}
