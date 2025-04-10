package colorizador;

public class Colorizador {

	public static void colorirTexto(String texto, String cor){
		String text = ColorirTexto.texto(texto,cor);
		System.out.println(text);
	}
	public static void colorirFundo(String texto, String cor){
		String text = ColorirTexto.fundo(texto,cor);
		System.out.println(text);
	}
	
	public static void main(String[] args) {
		colorirTexto("teste","#FF0000");
	}
	
	
}
