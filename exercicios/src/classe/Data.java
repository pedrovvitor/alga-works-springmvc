package classe;

public class Data {

	int dia; // vari�vel de instancia
	int mes; // vari�vel de instancia
	int ano; // vari�vel de instancia

	public Data() {
		super();
		this.dia = 01;
		this.mes = 01;
		this.ano = 1970;
	}

	public Data(int dia, int mes, int ano) {
		super();
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}

	public String obterDataFormatada() {
		final String formato = "%d%d%d";
		return String.format(formato, dia, mes, ano);
	}

	// N�o funciona em aplica��o desktop/mobile/web.
	public void imprimirDataFormatada() {
		System.out.println(obterDataFormatada());
	}
}
