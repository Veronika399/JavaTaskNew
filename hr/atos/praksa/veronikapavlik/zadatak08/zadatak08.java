package hr.atos.praksa.veronikapavlik.zadatak08;

import java.util.Scanner;

public class zadatak08 {

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
	    System.out.println("Unesi redni broj mjeseca:");
		int  numberOfMonth= myObj.nextInt();
		
		if( numberOfMonth>12) {
			System.out.println("Ne postoji " + numberOfMonth+ ", molim Vam unesite ispravni mjesec!");
			return;
		}
		System.out.println();
		char[] days = {'P','U','S','Č','P','S','N'};
		System.out.println(numberOfMonth +".mjesec u prijestupnoj godini:");
		if(numberOfMonth == 1 || numberOfMonth == 3 || numberOfMonth == 5 || numberOfMonth == 7 || numberOfMonth == 8 || numberOfMonth == 10 || numberOfMonth == 12) {
			for(int i=0;i<=6;i++) {
				System.out.format("%3s",days[i]);
			}
			System.out.println();
			for(int i=1;i<=31;i++) {
				System.out.format("%3d", i);
				if(i==7 || i==14 || i==21 || i==28) {
					System.out.println();
				}
			}
		}
		else if(numberOfMonth == 4 || numberOfMonth == 6 || numberOfMonth == 9 || numberOfMonth == 11 ) {
			for(int i=0;i<=6;i++) {
				System.out.format("%3s",days[i]);
			}
			System.out.println();
			for(int i=1;i<=30;i++) {
				System.out.format("%3d", i);
				if(i==7 || i==14 || i==21 || i==28) {
					System.out.println();
				}
			}
		}
		else {
			for(int i=0;i<=6;i++) {
				System.out.format("%3s",days[i]);
			}
			System.out.println();
			for(int i=1;i<=29;i++) {
				System.out.format("%3d", i);
				if(i==7 || i==14 || i==21 || i==28) {
					System.out.println();
				}
			}
		}
		
		System.out.println("\n");
		
		System.out.println(numberOfMonth +".mjesec u neprijestupnoj godini:");
		if(numberOfMonth == 1 || numberOfMonth == 3 || numberOfMonth == 5 || numberOfMonth == 7 || numberOfMonth == 8 || numberOfMonth == 10 || numberOfMonth == 12) {
			for(int i=0;i<=6;i++) {
				System.out.format("%3s",days[i]);
			}
			System.out.println();
			for(int i=1;i<=31;i++) {
				System.out.format("%3d", i);
				if(i==7 || i==14 || i==21 || i==28) {
					System.out.println();
				}
			}
		}
		else if(numberOfMonth == 4 || numberOfMonth == 6 || numberOfMonth == 9 || numberOfMonth == 11 ) {
			for(int i=0;i<=6;i++) {
				System.out.format("%3s",days[i]);
			}
			System.out.println();
			for(int i=1;i<=30;i++) {
				System.out.format("%3d", i);
				if(i==7 || i==14 || i==21 || i==28) {
					System.out.println();
				}
			}
		}
		else {
			for(int i=0;i<=6;i++) {
				System.out.format("%3s",days[i]);
			}
			System.out.println();
			for(int i=1;i<=28;i++) {
				System.out.format("%3d", i);
				if(i==7 || i==14 || i==21 || i==28) {
					System.out.println();
				}
			}
		}
		
		
	}
}
