package EXAMEN;

import java.util.Scanner;

public class SALUDO {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("¡Hola! Por favor, ingresa un número:");
	        int numero = scanner.nextInt();

	        System.out.println("Has ingresado el número: " + numero);

	        scanner.close();
	    }
	}



