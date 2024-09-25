package formas;

public class Main {
	public static final String AZUL = "\u001B[34m";
	public static final String VERMELHO = "\u001B[31m";
	public static void main(String[] args) {
		
		System.out.println(VERMELHO+ "Retangulo");
		//Retangulo
		Retangulo retangulo = new Retangulo();
		retangulo.setBase(5);
		retangulo.setLargura(4);
		System.out.println(AZUL + retangulo.area(5, 5));
		System.out.println(AZUL +retangulo.perimetro(5, 5));
		//Quadrado
		System.out.println(VERMELHO+ "Quadrado");
		Quadrado quadrado = new Quadrado(5);
		System.out.println(AZUL+quadrado.getLado());
		quadrado.setLado(6);
		System.out.println(AZUL  + quadrado.area(quadrado.getLado()));
		System.out.println(AZUL + quadrado.diagonal(quadrado.getLado()));
		System.out.println(AZUL+ quadrado.perimetro(quadrado.getLado()));
		
	}

}
