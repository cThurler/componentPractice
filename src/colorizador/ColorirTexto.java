package colorizador;

class ColorirTexto {
	private static String reset = "\u001B[0m";
	
	private static String HexParaRGB(String color, boolean posicao) {
		if (color.charAt(0) == '#') {
			if(posicao == true) {
				//retorna cor de texto
				color = color.toString();
			    var r = Integer.parseInt(color.substring(1, 3), 16);
			    var g = Integer.parseInt(color.substring(3, 5), 16);
			    var b = Integer.parseInt(color.substring(5, 7), 16);
			    
			    r = Math.max(0, Math.min(255, r));
			    g = Math.max(0, Math.min(255, g));
			    b = Math.max(0, Math.min(255, b));
			    
			    return "\033[38;2;" + r + ";" + g + ";" + b + "m";
			} else {
				//retorna cor de fundo
				color = color.toString();
			    var r = Integer.parseInt(color.substring(1, 3), 16);
			    var g = Integer.parseInt(color.substring(3, 5), 16);
			    var b = Integer.parseInt(color.substring(5, 7), 16);
			    
			    r = Math.max(0, Math.min(255, r));
			    g = Math.max(0, Math.min(255, g));
			    b = Math.max(0, Math.min(255, b));
			    
			    return "\033[48;2;" + r + ";" + g + ";" + b + "m";
			}
		    
		} else return null;
	}

	public static String texto(String texto, String cor){
		cor = HexParaRGB(cor, true);
		if (cor == null) {
			return "Por favor insira uma cor em Hexadecimal!" ;
		} else {
			return (cor + texto + reset);
		}
	}
	public static String fundo(String texto, String cor){
		cor = HexParaRGB(cor, false);
		if (cor == null) {
		return "Por favor insira uma cor em Hexadecimal!" ;
		} else {
			return (cor + texto + reset);
		}
	}
	
	
}
