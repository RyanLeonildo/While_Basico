import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int gasolina = 1, acool = 1, diesel = 1, quantA = 0, quantG = 0, quantD = 0; 
		
		int cod = sc.nextInt();
		
		while(cod != 4) {
			if (cod == 1) {
				quantA = acool + quantA;
			}else if (cod == 2) {
				quantG = gasolina + quantG;
			}else if (cod == 3) {
				quantD =  diesel + quantD;
			}
			cod = sc.nextInt();
		}
		
		System.out.println("MUITO OBRIGADO");
		System.out.println("Acool: " + quantA);
		System.out.println("Gasolina: " + quantG);
		System.out.println("Diesel: " + quantD);
		
		sc.close();
	}

}
