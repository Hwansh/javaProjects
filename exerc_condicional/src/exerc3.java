import java.util.Scanner;
public class exerc3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o 1º número inteiro: ");
		int num1 = sc.nextInt();
		System.out.println("Informe o 2º número inteiro: ");
		int num2 = sc.nextInt();
		
		if ((num1%num2 == 0) || (num2%num1 == 0)) { 
			System.out.println("Sao Multiplos.");
		}else {
			System.out.println("Nao sao multiplos");
		}
		sc.close();
	}

}
