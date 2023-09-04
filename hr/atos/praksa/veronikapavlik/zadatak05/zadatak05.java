package hr.atos.praksa.veronikapavlik.zadatak05;

public class zadatak05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int startInterval = 9;
		int endInterval =103;
		int counter = 0;
		
		if (startInterval < 10 && endInterval>100) {
			for(int i= startInterval; i<=endInterval; i++) {
				if (i >= 75) {
                    System.out.println("Vrijednost brojača iznosi: " + counter);
                    break;
                }
				else if (i % 20 == 0) {
                    continue; 
                }
				else if (i <= 18) {
                    counter += 4;
                }
				else if (i > 18) {
                    counter--;
                }
                else  System.out.println(1);
			}
		}
		else System.out.println( "Početak i kraj intervala nisu dobro definirati, potrebno je ponovno definirati početak i kraj intervala!");
	}
}
