import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X, Y;
		
		X = sc.nextInt();
		Y = sc.nextInt();
		
		while (X != 0 && Y !=0) {
			if (X > 0 && Y > 0) {
				System.out.println("Primeiro");
				
			}else if (X < 0 && Y > 0) {
				System.out.println("Segundo");
				
			}else if (X < 0 && Y < 0) {
				System.out.println("Terceiro");
				
			}else if (X > 0 && Y < 0){
				System.out.println("Quarto");
			}

			X = sc.nextInt();
			Y = sc.nextInt();
		}
	
		System.out.println("Nada encontrado");
		
		sc.close();
	}

}
