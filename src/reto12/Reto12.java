package reto12;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Reto12 {

	//===============================================================
	//				CREAR LOS DIFERENTES ARRAYS
	//===============================================================
	public static String[] crearArrayMenuPrincipal() {

		String[] menu = {"Ciudades", "Restaurantes", "Curiosidades", "Conversión"};

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
				{"Barrab restaurant", "Hungry wolfï¿½s restaurant", "Heaven burger"},
				{"Sandwich me", "Gecko cabane restaurant", "Jennaï¿½s Bistro & wine"},
				{"Siam supper club", "Dee Plee", "Samï¿½s steaks and Grill"},
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

		String[] curiosidades = {"1. El rey de Tailandia Bhumibol Adulyadej fue el monarca mï¿½s longevo de la historia (Mï¿½s de 70 aï¿½os).",
				"2. Hasta 1939 Tailandia se llamaba Siam.",
				"3. En Tailandia estï¿½ prohibido pisar billetes y monedas.",
				"4. En los parques cada tarde a les 18h suena el himno de Tailandia y todo el mundo se queda parado.",
				"5. Tailandia ha sido muchos aï¿½os el primer exportador de arroz en el mundo.",
				"6. Estï¿½ticamente a los Tailandeses les gusta la piel blanca (como a la mayorï¿½a de paï¿½ses del este de Asia). Asï¿½ que nada de ir a la playa a ponerse moreno.",
				"7. La sociedad tailandesa es una de las mï¿½s tolerantes del mundo, pues hay muchas Lady Boys.",
				"8. Al despertarse, es comï¿½n en los pueblos que la gente salga a barrer las veredas o las playas.",
				"9. Los perros de Tailandia pueden tener seguro de vida.",
		"10. Frank Cuesta (Frank de la Jungla) vive en Tailandia."};

		return curiosidades;
	}

	public static String[] crearArrayMenuCuriosidades() {
		String[] opciones = {"Lista completa", "Curiosidad aleatoria", "Especifica"};

		return opciones;
	}
	
	public static String[] crearArrayAfirmacion() {
		String[] afirmacion = {"Si", "No"};
		
		return afirmacion;
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

	public static String[] calcularPorcentaje(int total, String ciudades[], int divisor[]) {
		// Nos calcula el porcentaje de habitantes que tiene cada pueblo y nos la muestra
		String[] porcentajes = new String[ciudades.length];

		for (int i = 0; i < divisor.length; i++) {
			String formato = String.format("%.2f", (float)100 * divisor[i] / total);
			porcentajes[i] = "En " + ciudades[i] + " viven el "+ formato + "% de Tailandia";
		}
		return porcentajes;
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

	public static void menuConversor(String[] curiosidades, String[] opciones, String pregunta, String[] afirma) {
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
		
		afirmacion = crearArrayAfirmacion();
		principal = crearArrayMenuPrincipal();
		conversor = crearArrayMenuConversor();
		opcionesCuriosidades = crearArrayMenuCuriosidades(); 
		ciudades = crearCiudades();
		habitantes = crearPoblacion();
		restaurantes = crearRestaurantes();
		precios = crearPrecios();
		curiosidades = crearCuriosidades();
		porcentajeCiudades = calcularPorcentaje(poblacionTotal, ciudades, habitantes);
	}
	
	public static void main(String[] args) {

		final int POBLACIONTOTAL = 65423298;
		final int FILAS = 10;
		final int COLUMNAS = 3;
		String pregunta = "¿Qué opción quiere escoger?";
		int repetir;
		
		String[] afirmacion = new String[2];
		String[] opcionesPrincipal = new String[FILAS];
		String[] opcionesConversor = new String[FILAS];
		String[] opcionesCuriosidades = new String[FILAS];
		String[] ciudades = new String[FILAS];
		int[] habitantes = new int[FILAS];
		String[][] restaurantes = new String[FILAS][COLUMNAS];
		int [][] precios = new int[FILAS][COLUMNAS];
		String[] curiosidades = new String[FILAS];
		String[] porcentajeCiudades = new String[FILAS];
		
		rellenarArrays(afirmacion, opcionesPrincipal, opcionesConversor,
				opcionesCuriosidades, ciudades, habitantes, restaurantes,
				precios, curiosidades, porcentajeCiudades, POBLACIONTOTAL);

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
				menuConversor(curiosidades, opcionesConversor, pregunta, afirmacion);
				break;
			}

			repetir = menuJoption(afirmacion, "Desea salir");
		} while (repetir == 1);


	}

}
