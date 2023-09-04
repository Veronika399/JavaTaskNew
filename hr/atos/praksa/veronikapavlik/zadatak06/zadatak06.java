package hr.atos.praksa.veronikapavlik.zadatak06;

import java.util.Scanner;

public class zadatak06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myObj = new Scanner(System.in);
	    System.out.println("Unesi ime:");
		String  userName = myObj.nextLine(); 
		
		System.out.println("-------------------------------");
		System.out.println(": : :  TABLICA  MNOZENJA  : : :");
		System.out.println("-------------------------------");
		System.out.format("  * |");
		for(int i=1;i<=9;i++) { 
			System.out.format("%3d b",i);
		}
		System.out.println();
		System.out.println("-------------------------------");
		for(int i=1;i<=9;i++) {
			System.out.format("%3d |", i);
			for(int j=1;j<=9;j++) {
				System.out.format("%3d", i*j);
			}
			System.out.println();
		}
		System.out.println("-------------------------------");
		System.out.format(":  :  :  :  :  :  :  :  by %8s",userName);
		System.out.println();
		System.out.println("-------------------------------");
	}

}
