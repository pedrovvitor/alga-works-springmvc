package classe;

public class AreaCircTeste {

	public static void main(String[] args) {

		AreaCirc a1 = new AreaCirc(5);

		AreaCirc a2 = new AreaCirc(3);

		
		System.out.println(a2.area());
		System.out.println(a1.area());
		System.out.println(AreaCirc.area(7.2));
	}

}
