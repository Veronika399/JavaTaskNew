package hr.atos.praksa.veronikapavlik.zadatak14;

public class Cosinus implements SuceljeKrivuljaCos{
	@Override
	public double funcCos(double x){
        return Math.cos(x);
    }

   public double calculateAreaCos(double A, double B, double T1, double T2) {
        int numSegments = 1000;
        double h = (T2 - T1) / numSegments; 

        double sum = 0.5 * (A * funcCos(T1) + B + A * funcCos(T2)); 
        
        for (int i = 1; i < numSegments; i++) {
            double x = T1 + i * h;
            sum += A * funcCos(x) + B;
        }

        return h * sum;
    }
}
