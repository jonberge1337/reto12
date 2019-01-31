package reto12;

//import javax.swing.JOptionPane;

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
				{"Barrab restaurant", "Hungry wolf´s restaurant", "Heaven burger"},
				{"Sandwich me", "Gecko cabane restaurant", "Jenna´s Bistro & wine"},
				{"Siam supper club", "Dee Plee", "Sam´s steaks and Grill"},
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
		
		String[] curiosidades = {"1. El rey de Tailandia Bhumibol Adulyadej fue el monarca más longevo de la historia (Más de 70 años).",
				"2. Hasta 1939 Tailandia se llamaba Siam.",
				"3. En Tailandia está prohibido pisar billetes y monedas.",
				"4. En los parques cada tarde a les 18h suena el himno de Tailandia y todo el mundo se queda parado.",
				"5. Tailandia ha sido muchos años el primer exportador de arroz en el mundo.",
				"6. Estéticamente a los Tailandeses les gusta la piel blanca (como a la mayoría de países del este de Asia). Así que nada de ir a la playa a ponerse moreno.",
				"7. La sociedad tailandesa es una de las más tolerantes del mundo, pues hay muchas Lady Boys.",
				"8. Al despertarse, es común en los pueblos que la gente salga a barrer las veredas o las playas.",
				"9. Los perros de Tailandia pueden tener seguro de vida.",
				"10. Frank Cuesta (Frank de la Jungla) vive en Tailandia."};

		return curiosidades;
	}
	
	//===============================================================
	//				CREAR LOS DIFERENTES ARRAYS;
	//===============================================================

	public static void main(String[] args) {

	}

}