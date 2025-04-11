package colorizador;

public class Colorizador {
	private static int arrayNumeros[] = {1,2,3,4,5,2,3,4,0,-1,-2,-3,4,-4,2,87,-7,-66,-44};

	public static void colorirTexto(String texto, String cor){
		String text = ColorirTexto.texto(texto,cor);
		System.out.println(text);
	}
	public static void colorirFundo(String texto, String cor){
		String text = ColorirTexto.fundo(texto,cor);
		System.out.println(text);
	}
	public static void colorirArrayNumeros(int array[], boolean cor){
		String text = ColorirArrayNumeros.texto(array,cor);
		System.out.println(text);
	}
	
	public static void main(String[] args) {
		colorirTexto("teste","#FF0000");
		colorirFundo("teste","#FF0000");
		colorirArrayNumeros(arrayNumeros, true);
		colorirArrayNumeros(arrayNumeros, false);
	}
	
	
}
