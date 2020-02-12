package classe;

public class DataTeste {

	public static void main(String[] args) {
		Data data1 = new Data(7, 11, 2020);

		var data2 = new Data(20, 10, 1980);
		var data3 = new Data();

		System.out.println(data1.obterDataFormatada());
		System.out.println(data2.obterDataFormatada());

		data1.imprimirDataFormatada();
		data2.imprimirDataFormatada();

		data3.imprimirDataFormatada();
	}

}
