package com.example.project;

import java.util.Scanner;

public class Exercise1 {

	public static void main(final String[] args) {

		Exercise1 obj = new Exercise1();
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = sc.nextInt();
			System.out.println(obj.esCuadradoPerfecto(n));			
		}	
	}
	/*
	 La suma de impares consecutivos da un cuadrado perfecto
	 1+3 = 4 = 2^2
	 1+3+5 = 9 = 3^2
	 1+3+5+7 = 16 = 4^2
	 1+3+5+7+9 = 25 = 5^2
	 */
	//Declarando variables de clase para que en el método existan y al momento de usar la recursividad no se inicialicen
	int sumImpar = 0; //esta será la suma de impares consecutivos
	int impar = 1; //este será el impar que sumemos en cada pasada
	public boolean esCuadradoPerfecto(int numero) {
		sumImpar = sumImpar + impar; //por cada llamada al metodo ira aumentando la sumatoria
		impar += 2; //por cada llamada al metodo el impar consecutivo cambiara
		if (numero == 0 || numero < sumImpar) { //caso trivial
			return false;  //si el número es cero o la sumatoria se pasa no será cuadrado perfecto
		}
		else if (sumImpar == numero) { //caso trivial
			return true; //si la sumatoria es igual al numero será un numero cuadrado perfecto
		}
		else 
			return esCuadradoPerfecto(numero) ; //si no se cumplen los casos anterios el metodo se volvera a llamar
		                                        //aplicando la recursividad y aumentara la sumatoria
		
	}
}
