package colorizador;

import java.util.Arrays;

class ColorirArrayNumeros {

		public static String texto(int array[], boolean cor){
			if (cor == false) {
				String texto = "\u001B[34m";
				Arrays.sort(array);
				for (int i : array) {
					texto += " " + i;
				}
				return(texto);
			} else {
				String negativos = "\u001B[31m";
				String zero = "\u001B[34m";
				String positivos = "\u001B[32m";
				
				Arrays.sort(array);
				
				for (int i : array) {
					if(i==0) zero += " " + i;
					if(i<0) negativos += " " + i;
					if(i>0) positivos += " " + i;
				}
				
				return (negativos + zero + positivos);
			}
		}
}
