import java.util.Scanner;
public class exerc2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe um número inteiro: ");
		int num = sc.nextInt();
		
		if (num % 2 == 0){
			System.out.println("Este número é PAR.");
		}else {
			System.out.println("Este número é ÍMPAR.");
		}
		sc.close();
	}

}
