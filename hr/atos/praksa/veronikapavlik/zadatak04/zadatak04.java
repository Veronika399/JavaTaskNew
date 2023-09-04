package hr.atos.praksa.veronikapavlik.zadatak04;

public class zadatak04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numberForCheck = {3, 15, 22, 57, 89 };

		for(int i=0;i<5; i++) {
			if(numberForCheck[i]%2==0) {
				System.out.println( numberForCheck[i] +" je paran broj");
			}
			else System.out.println( numberForCheck[i] +" je neparan broj");
			
			if(numberForCheck[i]%3==0) {
				System.out.println( numberForCheck[i] +" je višekratnik broja 3");
			}
			else if (numberForCheck[i]%5==0){
				System.out.println( numberForCheck[i] +" je višekratnik broja 5");
			}
			else if (numberForCheck[i]%11==0){
				System.out.println( numberForCheck[i] +" je višekratnik broja 11");
			}
			else System.out.println( numberForCheck[i] +" nije višekratnik brojeva 3,5 ili 11!");
	
		}
		
	}

}
