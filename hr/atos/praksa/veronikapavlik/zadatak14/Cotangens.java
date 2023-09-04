package hr.atos.praksa.veronikapavlik.zadatak14;

public class Cotangens implements SuceljeKrivuljaCotan{
	@Override
	public double funcCotan(double x){
        return 1.0/Math.tan(x);
    }

   public double calculateAreaCotan(double A, double B, double T1, double T2) {
        int numSegments = 1000; 
        double h = (T2 - T1) / numSegments;

        double sum = 0.5 * (A * funcCotan(T1) + B + A * funcCotan(T2)); 
        

        for (int i = 1; i < numSegments; i++) {
            double x = T1 + i * h;
            sum += A * funcCotan(x) + B;
        }

        return h * sum;
    }
}
