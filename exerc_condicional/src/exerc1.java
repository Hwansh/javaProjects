import java.util.Scanner;
public class exerc1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe um número inteiro: ");
		int num = sc.nextInt();
		
		if (num >=0) {
			System.out.printf("O número %d, é positivo.", num);
		}else {
			System.out.printf("O número %d, é negativo", num);
		}
		
		sc.close();
	}

}
