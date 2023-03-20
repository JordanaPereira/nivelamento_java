import java.util.Locale;
import java.util.Scanner;

public class RaioDoCirculo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		double pi = 3.14159;
		double raio = sc.nextDouble();
		
		double area = pi * (raio*raio);
		
		
		Locale.setDefault(Locale.US);
		System.out.printf("A = %.4f%n", area);
		
		
		sc.close();
		

	}

}
