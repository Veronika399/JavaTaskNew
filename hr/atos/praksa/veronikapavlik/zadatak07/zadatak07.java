package hr.atos.praksa.veronikapavlik.zadatak07;
import java.util.Scanner;

public class zadatak07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int counter =0;
		Scanner myObj = new Scanner(System.in);
	    System.out.println("Unesi prvi broj:");
		int  firstNumber = myObj.nextInt(); 
		System.out.println("Unesi drugi broj:");
		int  secondNumber = myObj.nextInt();
		
		if(firstNumber > secondNumber) {
			for(int i= secondNumber; i<=firstNumber; i++) {
				if(i%6==0) {
					counter++;
				}
			}
		}
		else {
			for(int i= firstNumber; i<=secondNumber; i++) {
				if(i%6==0) {
					counter++;
				}
			}
		}
		System.out.println( "Ima "+ counter +" brojeva koji su djeljivi sa brojem 6!");
	}

}
