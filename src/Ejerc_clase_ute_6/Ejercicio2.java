package Ejerc_clase_ute_6;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("introdusca un numero");
		int n = sc.nextInt();
		
		
		System.out.println(sumarNumero(n));
		

	}
	
	public static int sumarNumero(int n1) {
		int aux=0;
		for (int i=1; i<=n1;i++) {
			
			aux +=i;
			
		}
		return (aux);
	}

}
