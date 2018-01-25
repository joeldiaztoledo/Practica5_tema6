import java.util.Scanner;
public class practicatema6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] array = new int[20];
		int i = 0;
		int opcion = 1;
		for(i=0; i<20; i++) {
			array[i]= (int) ((Math.random()*(10))+1);
		}
		while (opcion != 0) {
			System.out.println("Men�.");
			System.out.println("1.- Imprimir el mayor valor del array.");
			System.out.println("2.- Imprimir el menor valor de larray.");
			System.out.println("3.- Calcular la media de todos los valores del array.");
			System.out.println("4.- Imprimir todos los valores del array.");
			System.out.println("0.- Salir del programa.");
			System.out.print("Elija una opci�n: ");
			opcion = sc.nextInt();
			switch (opcion) {
			case 1 : 	
						System.out.println("El valor mas grande es: " + mayor(array) + ".");
						break;
			case 2 :  	
						System.out.println("El valor mas peque�o es: " + menor(array) + ".");
						break;
			case 3 :  	
						System.out.println("La media de los valores del array es: " + media(array) + ".");
						break;
			case 4 : 	
						lectura(array);
						break;
			case 0: break;
			default:    System.out.println("Introduzca una opci�n v�lida.");
			}
		}
	System.out.println("Programa finalizado.");
	sc.close();
	}
	
	
	public static int mayor (int[] array) {
		int max = 0;
		int i = 0;
		for (i=0; i<20; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		return max;
	}
	
	public static int menor (int[] array) {
		int min = 1;
		int i = 0;
		for (i=0; i<20; i++) {
			if (array[i] < min) {
				min = array[i];
			}
		}
		return min;
	}
	
	public static double media (int[] array) {
		double avg = 0;
		int i = 0;
		for (i=0; i<20; i++) {
			avg = avg + array[i];	
		}
		avg = avg / 20;
		return avg;
	}
	
	public static void lectura (int[] array) {
		int i = 0;
		System.out.print("Los valores del array son { ");
		for (i=0; i<20; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println("}");
	}
	
}



