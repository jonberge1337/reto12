package reto12;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Reto12 {

	//===============================================================
	//				CREAR LOS DIFERENTES ARRAYS
	//===============================================================
	public static String[] crearArrayMenuPrincipal() {

		String[] menu = {"Ciudades", "Restaurantes", "Curiosidades", "Conversos"};

		return menu;
	}

	public static String[] crearArrayMenuConversor() {

		String[] menu = {"Dolares a Baht", "Baht a Dolares", "Euros a Baht", "Baht a Euros"};

		return menu;
	}

	public static String[] crearCiudades() {

		String[] ciudades = {"Bangkok", "Chiang Mai", "Chiang Rai", "Krabi", "Phuket",
				"Pattaya", "Sukhothai", "Ayuthaya", "Kanchanaburi", "Hua Hin District"};

		return ciudades;
	}

	public static int[] crearPoblacion() {

		int[] habitantes = {5696409, 132556, 73416, 52867, 78421, 115840, 15375, 52940, 29566, 61191};

		return habitantes;
	}

	public static String[][] crearRestaurantes() {

		String[][] restaurantes = {
				{"Tealicious","Pagoda Chinese restaurant", "Le normandle"},
				{"Tanita cofee house", "Tikky cafe", "Italics restaurant"},
				{"Barrab restaurant", "Hungry wolf�s restaurant", "Heaven burger"},
				{"Sandwich me", "Gecko cabane restaurant", "Jenna�s Bistro & wine"},
				{"Siam supper club", "Dee Plee", "Sam�s steaks and Grill"},
				{"Cafe des Amis Fine Dining", "Caprice Restaurant & Bar", "Maharani"},
				{"Pizza House", "Poo Restaurant", "Pai Sukhothai"},
				{"The Seven Seas Restaurant", "Raan Tha Luang", "Burinda Restaurant"},
				{"On's Thai Issan", "Bell's Pizzeria", "Bicycle Cafe"},
				{"Big Fish", "Railway Restaurant", "Hagi"}
		};



		return restaurantes;
	}

	public static int[][] crearPrecios(){

		int[][] precios = {
				{360, 480, 558},
				{348, 354, 375},
				{954, 341, 349},
				{456, 654, 374},
				{349, 654, 642},
				{425, 346, 652},
				{323, 574, 568},
				{324, 642, 548},
				{532, 321, 428},
				{584, 422, 486}				
		};

		return precios;
	}

	public static String[] crearCuriosidades() {

		String[] curiosidades = {"1. El rey de Tailandia Bhumibol Adulyadej fue el monarca m�s longevo de la historia (M�s de 70 a�os).",
				"2. Hasta 1939 Tailandia se llamaba Siam.",
				"3. En Tailandia est� prohibido pisar billetes y monedas.",
				"4. En los parques cada tarde a les 18h suena el himno de Tailandia y todo el mundo se queda parado.",
				"5. Tailandia ha sido muchos a�os el primer exportador de arroz en el mundo.",
				"6. Est�ticamente a los Tailandeses les gusta la piel blanca (como a la mayor�a de pa�ses del este de Asia). As� que nada de ir a la playa a ponerse moreno.",
				"7. La sociedad tailandesa es una de las m�s tolerantes del mundo, pues hay muchas Lady Boys.",
				"8. Al despertarse, es com�n en los pueblos que la gente salga a barrer las veredas o las playas.",
				"9. Los perros de Tailandia pueden tener seguro de vida.",
		"10. Frank Cuesta (Frank de la Jungla) vive en Tailandia."};

		return curiosidades;
	}

	//===============================================================
	//				CREAR LOS DIFERENTES ARRAYS;
	//===============================================================

	//===============================================================
	//				LAS OPCIONES DEL CONVERSOR
	//===============================================================

	//	public static void dolaresBaht(double valor) {
	//		String formato =String.format("%.2f", valor*31.51);
	//		JOptionPane.showMessageDialog(null,valor + " Dolares en Baths es "+formato);
	//	}
	//	public static void bahtDolares(double valor) {
	//		String formato =String.format("%.2f", valor/31.51);
	//		JOptionPane.showMessageDialog(null,valor + " Baht en Dolares es "+formato);
	//	}
	//	public static void eurosBaht(double valor) {
	//		String formato =String.format("%.2f", valor*36.06);
	//		JOptionPane.showMessageDialog(null,valor + " Euros en Baths es "+formato);
	//	}
	//	public static void bahtEuros(double valor) {
	//		String formato =String.format("%.2f", valor/36.06);
	//		JOptionPane.showMessageDialog(null,valor + " Bahts en Euros es "+formato);
	//	}

	public static String dolaresBaht(double valor) {
		String cambio;
		String formato =String.format("%.2f", valor*31.51);
		cambio = valor + " Dolares en Baths es "+formato;

		return cambio;
	}
	public static String bahtDolares(double valor) {
		String cambio;
		String formato =String.format("%.2f", valor/31.51);
		cambio = valor + " Baht en Dolares es "+formato;

		return cambio;
	}
	public static String eurosBaht(double valor) {
		String cambio;
		String formato =String.format("%.2f", valor*36.06);
		cambio = valor + " Euros en Baths es "+formato;

		return cambio;
	}
	public static String bahtEuros(double valor) {
		String cambio;
		String formato =String.format("%.2f", valor/36.06);
		cambio = valor + " Bahts en Euros es "+formato;

		return cambio;
	}

	//===============================================================
	//				LAS OPCIONES DEL CONVERSOR;
	//===============================================================

	public static boolean repeticion() {
		boolean repetir=false;
		String[] opciones= {"Repetir", "Terminar"};
		int x;

		x = JOptionPane.showOptionDialog(null, "¿Quiere volver a repetir alguna acción?",
				"Conversión",
				JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones);

		if (x==0) {
			repetir=true;
		}

		return repetir;
	}

	public static void curiosidadesEspec(String[] curiosidades) {

		Scanner sc=new Scanner(System.in);
		int eleccion;

		do {
			eleccion=Integer.parseInt(JOptionPane.showInputDialog(null,"Teclea un número del 1 al 10: "));

		}while (eleccion<1 || eleccion>10);

		JOptionPane.showMessageDialog(null,curiosidades[eleccion-1]);
		sc.close();

	}

	public static void curiosidadesRandom(String[] curiosidades) {

		int aleat;
		aleat=(int)(Math.random()*10);

		JOptionPane.showMessageDialog(null,curiosidades[aleat]);

	}

	public static String[] calcularPorcentaje(int total, String ciudades[], int divisor[]) {
		// Nos calcula el porcentaje de habitantes que tiene cada pueblo y nos la muestra
		String[] porcentajes = new String[ciudades.length];

		for (int i = 0; i < divisor.length; i++) {
			String formato = String.format("%.2f", (float)100 * divisor[i] / total);
			//			System.out.println("En " + ciudades[i] + " viven el "+ formato + "% de Tailandia");
			porcentajes[i] = "En " + ciudades[i] + " viven el "+ formato + "% de Tailandia";
		}
		return porcentajes;
	}

	//	public static void mostrarRestaurantes(int[][] precios, String[][] restau, String[] ciudades, float cambio) {
	//		
	//		for (int i = 0; i < restau.length; i++) {
	//			System.out.print("En " + ciudades[i] + " tenemos los siguientes restaurantes: ");
	//			for (int j = 0; j < restau[i].length; j++) {
	//				if (j < 2) {
	//					System.out.print(restau[i][j] + "con un precio de " + precios[i][j] + " BATH " + precios[i][j] / cambio + "€, ");
	//				}else {
	//					System.out.println(restau[i][j] + "con un precio de " + precios[i][j] + " BATH " + precios[i][j] / cambio + "€");
	//				}
	//			}
	//		}
	//	}
	//	

	public static String[][] mostrarRestaurantes(int[][] precios, String[][] restau, String[] ciudades, float cambio) {
		String[][] restaurantes = new String[restau.length][restau[0].length];
		for (int i = 0; i < restau.length; i++) {
			System.out.print("En " + ciudades[i] + " tenemos los siguientes restaurantes: ");
			for (int j = 0; j < restau[i].length; j++) {
				if (j < 2) {
					restaurantes[i][j] = restau[i][j] + "con un precio de " + precios[i][j] + " BATH " + precios[i][j] / cambio + "€, ";
				}else {
					restaurantes[i][j] = restau[i][j] + "con un precio de " + precios[i][j] + " BATH " + precios[i][j] / cambio + "€\n";
				}
			}
		}
		return restaurantes;
	}


	public static void mostrarArraysUni(String[] array) {

		JOptionPane.showMessageDialog(null,array);
	}
	
	public static void mostrarArraysBi(String[][] array) {

		JOptionPane.showMessageDialog(null,array);
	}

	public static void mostrarStrings(String frase) {
		JOptionPane.showMessageDialog(null,frase);
	}

	public static void main(String[] args) {
		float cambio = 36.06f;
		String[][] restaurantes = new String[10][3];
		restaurantes = mostrarRestaurantes(crearPrecios(), crearRestaurantes(), crearCiudades(), cambio);
		mostrarArraysBi(restaurantes);
	}

}