package Ejerc_clase_ute_6;

import javax.swing.JOptionPane;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		System.out.println("Elija una opcion");
		System.out.println("1. Opcion numero par ");
		System.out.println("2. Opcion numero impar ");
		System.out.println("3. Salir");
		int n=Integer.parseInt(JOptionPane.showInputDialog("elija una opcion"));
		
		switch(n) {
		
		case 1:
			for(int i=1;i>=20;i++) {
				
				if(i%2==0){
					System.out.println(i);
				}
			}
				break;
		case 2:
			for(int i=1;i>=20;i++) {
				
				if(i%2!=0){
					System.out.println(i);
				}
			}
				break;
		case 3:	
			
			System.out.println("bye");
			break;
			
		default:System.out.println("Elija una opcion entre 1 y 3");
		}
		

	}
	

}
