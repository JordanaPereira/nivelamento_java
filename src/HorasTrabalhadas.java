import java.util.Locale;
import java.util.Scanner;

public class HorasTrabalhadas {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int numero = sc.nextInt();
		int horas = sc.nextInt();
		double valor = sc.nextDouble();
		
		double calculo = horas * valor;
				
		System.out.println("NUMBER = " + numero);
		System.out.printf("SALARY = U$ %.2f%n", calculo);
		
		
		sc.close();

	}

}