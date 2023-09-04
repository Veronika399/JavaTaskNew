package hr.atos.praksa.veronikapavlik.zadatak14;

import java.util.Scanner;

public class Zadatak14Krivulja {

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		
        System.out.print("Unesite A: ");
        double A = myObj.nextDouble();

        System.out.print("Unesite B: ");
        double B = myObj.nextDouble();

        System.out.print("Unesite početnu točku T1: ");
        double T1 = myObj.nextDouble();

        System.out.print("Unesite završnu točku T2: ");
        double T2 = myObj.nextDouble();

        myObj.close();
        
        Sinus fjaSinus = new Sinus();
        System.out.println("Površine ispod neke krivulje opisane funkcijom y=f(x)=" +A +"*sin(x)+" +B+ " od neke početne do krajnje točke ("+T1+","+T2+") iznosi: "+ fjaSinus.calculateAreaSin(A,B,T1,T2));
        
        Cosinus fjaCosinus = new Cosinus();
        System.out.println("Površine ispod neke krivulje opisane funkcijom y=f(x)=" +A +"*cos(x)+" +B+ " od neke početne do krajnje točke ("+T1+","+T2+") iznosi: "+ fjaCosinus.calculateAreaCos(A,B,T1,T2));
        
        Tangens fjaTangens = new Tangens();
        System.out.println("Površine ispod neke krivulje opisane funkcijom y=f(x)=" +A +"*tan(x)+" +B+ " od neke početne do krajnje točke ("+T1+","+T2+") iznosi: "+ fjaTangens.calculateAreaTan(A,B,T1,T2));
        
        Cotangens fjaCotangens= new Cotangens();
        System.out.println("Površine ispod neke krivulje opisane funkcijom y=f(x)=" +A +"*cot(x)+" +B+ " od neke početne do krajnje točke ("+T1+","+T2+") iznosi: "+ fjaCotangens.calculateAreaCotan(A,B,T1,T2));
        
	}

}
