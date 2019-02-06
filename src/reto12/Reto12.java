package reto12;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Reto12 {

	//===============================================================
	//				CREAR LOS DIFERENTES ARRAYS
	//===============================================================
	public static void crearArrayMenuPrincipal(String[] menu) {
		
		menu[0] = "Ciudades";
		menu[1] = "Restaurantes";
		menu[2] = "Curiosidades";
		menu[3] = "Conversión";
//		menu = {"Ciudades", "Restaurantes", "Curiosidades", "Conversión"};

		
	}

	public static void crearArrayMenuConversor(String[] menu) {

		menu[0] = "Dolares a Baht";
		menu[1] = "Baht a Dolares";
		menu[2] = "Euros a Baht";
		menu[3] = "Baht a Euros";
	}

	public static void crearCiudades(String[] ciudades) {

		ciudades[0] = "Bangkok";
		ciudades[1] = "Chiang Mai";
		ciudades[2] = "Chiang Rai";
		ciudades[3] = "Krabi";
		ciudades[4] = "Phuket";
		ciudades[5] = "Pattaya";
		ciudades[6] = "Sukhothai";
		ciudades[7] = "Ayuthaya";
		ciudades[8] = "Kanchanaburi";
		ciudades[9] = "Hua Hin District";

	}

	public static void crearPoblacion(int[] habitantes) {

		habitantes[0] = 5696409;
		habitantes[1] = 132556;
		habitantes[2] = 73416;
		habitantes[3] = 52867;
		habitantes[4] = 78421;
		habitantes[5] = 115840;
		habitantes[6] = 15375;
		habitantes[7] = 52940;
		habitantes[8] = 29566;
		habitantes[9] = 61191;

	}

	public static void crearRestaurantes(String[][] restaurantes) {

		restaurantes[0][0] = "Tealicious";
		restaurantes[0][1] = "Pagoda Chinese restaurant";
		restaurantes[0][2] = "Le normandle";

		restaurantes[1][0] = "Tanita cofee house";
		restaurantes[1][1] = "Tikky cafe";		
		restaurantes[1][2] = "Italics restaurant";
		
		restaurantes[2][0] = "Barrab restaurant"; 
		restaurantes[2][1] = "Hungry wolf´s restaurant";
		restaurantes[2][2] = "Heaven burger";
		
		restaurantes[3][0] = "Sandwich me";
		restaurantes[3][1] = "Gecko cabane restaurant";
		restaurantes[3][2] = "Jenna´s Bistro & wine";
		
		restaurantes[4][0] = "Siam supper club"; 
		restaurantes[4][1] = "Dee Plee";
		restaurantes[4][2] = "Sam´s steaks and Grill";
		
		restaurantes[5][0] = "Cafe des Amis Fine Dining";
		restaurantes[5][1] = "Caprice Restaurant & Bar";
		restaurantes[5][2] = "Maharani";
		
		restaurantes[6][0] = "Pizza House";
		restaurantes[6][1] = "Poo Restaurant";
		restaurantes[6][2] = "Pai Sukhothai";
		
		restaurantes[7][0] = "The Seven Seas Restaurant";
		restaurantes[7][1] = "Raan Tha Luang";
		restaurantes[7][2] = "Burinda Restaurant";
		
		restaurantes[8][0] = "On's Thai Issan"; 
		restaurantes[8][1] = "Bell's Pizzeria";
		restaurantes[8][2] = "Bicycle Cafe";
		
		restaurantes[9][0] = "Big Fish";
		restaurantes[9][1] = "Railway Restaurant";
		restaurantes[9][2] = "Hagi";

	}

	public static void crearPrecios(int[][] precios){

				precios[0][0] = 360;
				precios[0][1] = 480;
				precios[0][2] = 558;

				precios[1][0] = 248;
				precios[1][1] = 354;		
				precios[1][2] = 375;
				
				precios[2][0] = 954; 
				precios[2][1] = 341;
				precios[2][2] = 349;
				
				precios[3][0] = 456;
				precios[3][1] = 654;
				precios[3][2] = 374;
				
				precios[4][0] = 349; 
				precios[4][1] = 654;
				precios[4][2] = 642;
				
				precios[5][0] = 425;
				precios[5][1] = 346;
				precios[5][2] = 652;
				
				precios[6][0] = 323;
				precios[6][1] = 574;
				precios[6][2] = 568;
				
				precios[7][0] = 324;
				precios[7][1] = 642;
				precios[7][2] = 548;
				
				precios[8][0] = 532; 
				precios[8][1] = 321;
				precios[8][2] = 428;
				
				precios[9][0] = 584;
				precios[9][1] = 422;
				precios[9][2] = 486;
	}

	public static void crearCuriosidades(String[] curiosidades) {

		curiosidades[0] = "1. El rey de Tailandia Bhumibol Adulyadej fue el monarca mï¿½s longevo de la historia (Mï¿½s de 70 aï¿½os).";
		curiosidades[1] = "2. Hasta 1939 Tailandia se llamaba Siam.";
		curiosidades[2] = "3. En Tailandia estï¿½ prohibido pisar billetes y monedas.";
		curiosidades[3] = "4. En los parques cada tarde a les 18h suena el himno de Tailandia y todo el mundo se queda parado.";
		curiosidades[4] = "5. Tailandia ha sido muchos aï¿½os el primer exportador de arroz en el mundo.";
		curiosidades[5] = "6. Estï¿½ticamente a los Tailandeses les gusta la piel blanca (como a la mayorï¿½a de paï¿½ses del este de Asia). Asï¿½ que nada de ir a la playa a ponerse moreno.";
		curiosidades[6] = "7. La sociedad tailandesa es una de las mï¿½s tolerantes del mundo, pues hay muchas Lady Boys.";
		curiosidades[7] = "8. Al despertarse, es comï¿½n en los pueblos que la gente salga a barrer las veredas o las playas.";
		curiosidades[8] = "9. Los perros de Tailandia pueden tener seguro de vida.";
		curiosidades[9] = "10. Frank Cuesta (Frank de la Jungla) vive en Tailandia.";
		
	}

	public static void crearArrayMenuCuriosidades(String[] opciones) {
		opciones[0] = "Lista completa";
		opciones[1] = "Curiosidad aleatoria";
		opciones[2] = "Especifica";
				

	}
	
	public static void crearArrayAfirmacion(String[] afirmacion) {

		afirmacion[0] = "Si";
		afirmacion[1] = "No";

	}

	//===============================================================
	//				CREAR LOS DIFERENTES ARRAYS;
	//===============================================================

	//===============================================================
	//				LAS OPCIONES DEL CONVERSOR
	//===============================================================

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



	public static int menuJoption(String[] opciones, String pregunta) {

		int opcion;

		opcion = JOptionPane.showOptionDialog(null, pregunta,
				"Tailandia",
				JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones);

		return opcion;
	}

	public static void especifica(String[] curiosidades) {

		Scanner sc=new Scanner(System.in);
		int eleccion;
		eleccion=0;
		
		do {
			try {
				eleccion=Integer.parseInt(JOptionPane.showInputDialog(null,"Teclea un número del 1 al 10: "));
			} catch (Exception e) {
				mostrarStrings("Introduce algo valido");
			}
			
		}while (eleccion<1 || eleccion>10);

		JOptionPane.showMessageDialog(null,curiosidades[eleccion-1]);
		sc.close();

	}

	public static void aleatorio(String[] curiosidades) {

		int aleat;
		aleat=(int)(Math.random()*10);

		JOptionPane.showMessageDialog(null,curiosidades[aleat]);

	}

	public static void calcularPorcentaje(int total, String ciudades[], int divisor[], String[] calcularPorcentaje) {
		// Nos calcula el porcentaje de habitantes que tiene cada pueblo y nos la muestra

		for (int i = 0; i < divisor.length; i++) {
			String formato = String.format("%.2f", (float)100 * divisor[i] / total);
			calcularPorcentaje[i] = "En " + ciudades[i] + " viven el "+ formato + "% de Tailandia";
		}

	}

	public static String[] mostrarRestaurantes(int[][] precios, String[][] restau, String[] ciudades) {
		String[] restaurantes = new String[restau.length];
		for (int i = 0; i < restau.length; i++) {
			restaurantes[i] = "En " + ciudades[i] + " tenemos los siguientes restaurantes: ";
			for (int j = 0; j < restau[i].length; j++) {
				if (j < 2) {
					restaurantes[i] += restau[i][j] + "con un precio de " + precios[i][j] + " BAHT, ";
				}else {
					restaurantes[i] += restau[i][j] + "con un precio de " + precios[i][j] + " BAHT";
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

	public static void submenuPrincipal(String[] array, String[] botones, String pregunta, String[] afirma) {

		int panel;
		int repetir;

		do {
			panel = menuJoption(botones, pregunta);

			if (panel==0) {
				mostrarArraysUni(array);
			}else if (panel==1) {
				aleatorio(array);
			}else if (panel==2){
				especifica(array);
			}else{ 
				mostrarStrings("Programa finalizado");
				System.exit(panel);
			}
			repetir = menuJoption(afirma, pregunta) ;
		}while(repetir == 0);
	}

	public static void menuConversor(String[] opciones, String pregunta, String[] afirma) {
		float valor=0;
		int panel;
		int repetir;
		String cambio;


		Scanner sc = new Scanner(System.in);
		do{
			do {
				try{
					valor=Float.parseFloat(JOptionPane.showInputDialog("Introduzca la cantidad numerica que quiera convertir, despues eliga el tipo de conversion"));

				}catch (Exception e) {
					
//					valor=Float.parseFloat(JOptionPane.showInputDialog("Introduzca solo valores numéricos"));
					mostrarStrings("introduce algo valido");
				}
			}while(!(valor>0));
			panel = menuJoption(opciones, pregunta);
			if (panel == 0) {
				cambio = dolaresBaht(valor);
				mostrarStrings(cambio);
			}else if (panel == 1) {
				cambio = bahtDolares(valor);
				mostrarStrings(cambio);
			}else if (panel == 2) {
				cambio = eurosBaht(valor);
				mostrarStrings(cambio);
			}else if (panel == 3) {
				cambio = bahtEuros(valor);
				mostrarStrings(cambio);
			}
			repetir = menuJoption(afirma, "Quiere volver a repetir");
		}while(repetir == 0);
		sc.close();
	}

	public static void rellenarArrays(String[] afirmacion, String[] principal,
			String[] conversor, String[] opcionesCuriosidades, String[] ciudades,
			int[] habitantes, String[][] restaurantes, int[][] precios, String[] curiosidades, String[] porcentajeCiudades,int poblacionTotal) {
		
		crearArrayAfirmacion(afirmacion);
		crearArrayMenuPrincipal(principal);
		crearArrayMenuConversor(conversor);
		crearArrayMenuCuriosidades(opcionesCuriosidades); 
		crearCiudades(ciudades);
		crearPoblacion(habitantes);
		crearRestaurantes(restaurantes);
		crearPrecios(precios);
		crearCuriosidades(curiosidades);
		calcularPorcentaje(poblacionTotal, ciudades, habitantes, porcentajeCiudades);
	}
	
	public static void main(String[] args) {

		final int POBLACIONTOTAL = 65423298;
		final int FILAS = 10;
		final int COLUMNAS = 3;
		String pregunta = "¿Qué opción quiere escoger?";
		int repetir;
		
		String[] afirmacion = new String[2];
		String[] opcionesPrincipal = new String[4];
		String[] opcionesConversor = new String[4];
		String[] opcionesCuriosidades = new String[3];
		String[] ciudades = new String[FILAS];
		int[] habitantes = new int[FILAS];
		String[][] restaurantes = new String[FILAS][COLUMNAS];
		int [][] precios = new int[FILAS][COLUMNAS];
		String[] curiosidades = new String[FILAS];
		String[] porcentajeCiudades = new String[FILAS];
		
		rellenarArrays(afirmacion, opcionesPrincipal, opcionesConversor,
				opcionesCuriosidades, ciudades, habitantes, restaurantes,precios, curiosidades, porcentajeCiudades, POBLACIONTOTAL);

		do {
			switch (menuJoption(opcionesPrincipal, pregunta)) {
			case 0:
				mostrarArraysUni(porcentajeCiudades);
				break;
			case 1:
				mostrarArraysUni(mostrarRestaurantes(precios, restaurantes, ciudades));
				break;
			case 2:
				submenuPrincipal(curiosidades, opcionesCuriosidades, pregunta, afirmacion);
				break;
			case 3:
				menuConversor(opcionesConversor, pregunta, afirmacion);
				break;
			}

			repetir = menuJoption(afirmacion, "Desea salir");
		} while (repetir == 1);


	}

}
