package hr.atos.praksa.veronikapavlik.zadatak14;

public class Sinus implements SuceljeKrivuljaSin {
	
	@Override
	public double funcSin(double x){
        return Math.sin(x); 
    }

   public double calculateAreaSin(double A, double B, double T1, double T2) {
        int numSegments = 1000; 
        double h = (T2 - T1) / numSegments; 

        double sum = 0.5 * (A * funcSin(T1) + B + A * funcSin(T2)); 
        
        for (int i = 1; i < numSegments; i++) {
            double x = T1 + i * h;
            sum += A * funcSin(x) + B;
        }

        return h * sum;
    }
}
