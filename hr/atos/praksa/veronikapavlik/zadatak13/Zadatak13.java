package hr.atos.praksa.veronikapavlik.zadatak13;

public class Zadatak13 implements Food {

	public void tasteOfFood() {
		System.out.println("Domaća juha je slana!");
	}
	public void foodTexture() {
		System.out.println("Domaća juha je u tekućem stanju!");
	}
	
	public static void main(String[] args) {
		Zadatak13 juha=new Zadatak13();
		juha.tasteOfFood();
		juha.foodTexture();
	}

}
