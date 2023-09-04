package hr.atos.praksa.veronikapavlik.zadatak14;

public class Tangens implements SuceljeKrivuljaTan{

	@Override
	public double funcTan(double x){
        return Math.tan(x);
    }

   public double calculateAreaTan(double A, double B, double T1, double T2) {
        int numSegments = 1000; 
        double h = (T2 - T1) / numSegments;

        double sum = 0.5 * (A * funcTan(T1) + B + A * funcTan(T2)); 
        
        
        for (int i = 1; i < numSegments; i++) {
            double x = T1 + i * h;
            sum += A * funcTan(x) + B;
        }

        return h * sum;
    }
}
