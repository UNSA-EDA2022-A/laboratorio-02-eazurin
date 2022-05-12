package com.example.project;

import java.util.Scanner;

public class Exercise2 {

	public static void main(final String[] args) {

		Exercise2 obj = new Exercise2();
		Scanner sc = new Scanner(System.in);
		while (true) {

			int n = sc.nextInt(), suma;
			int a[] = new int[n];

			for (int i = 0; i < n; i++) {   
				//n = sc.nextInt();
				a[i] = sc.nextInt(); //Profesor, tuve problemas con esta parte del código, al momento de ingresar los datos
				//y por eso hice esta modificacion
			}

			suma = sc.nextInt();

			System.out.println(obj.esSubconjuntoSumaExt(a, suma));
		}
	}
	int i = 0; //indice para recorrer el arreglo
		public boolean esSubconjuntoSumaExt(int a[], int suma) {
		if (suma == 0) {  //caso base si llega a 0 existira el subgrupo
			return true;
		}
		else if (i == a.length ) { //caso base si se recorre todo el arreglo y no llega a 0 no habra subgrupo
			return false;
		}
		
		for (int j = 0; j<a.length - 1; j++) {  //Cumpliendo con las condiciones 
			if(a[j]%7 == 0 && a[j+1] != 1) {    //si es multiplo de 7 y no le sigue el 1 el siete tiene que ir al subgrupo
				suma = suma - a[j];             //por lo tanto se reduce la suma y para que ya no se tome el 7 lo
				a[j] = 0;                       //reemplazo por 0
			}
			else if (a[j]%7 == 0 && a[j+1] == 1) {
				a[j] = 0;                  //si al multiplo de 7 le sigue 1 el 7 no se debe tomar y lo remmplazo con cero
			}
		}
		
		i++; //Incrementado el indice para recorrer el arreglo
		//Aplicando la recursividad con el inicio, el final y el medio del arreglo, en algun caso deberia dar 0 
		//si existe el subgrupo
		return esSubconjuntoSumaExt(a, suma- a[i - 1]) || esSubconjuntoSumaExt(a, suma- a[a.length- 1]) ||
				esSubconjuntoSumaExt(a, suma) || esSubconjuntoSumaExt(a, suma- a[a.length- 2]);
	}

}
