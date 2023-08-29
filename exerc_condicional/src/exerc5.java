import java.util.Scanner;
import java.util.Locale;
public class exerc5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("CODIGO  ESPECIFICACAO	PRECO");
		System.out.println("1	Cachorro Quente	R$ 4.00");
		System.out.println("2	X-Salada	R$ 4.50");
		System.out.println("3	X-Bacon		R$ 5.00");
		System.out.println("4	Torrada simples	R$ 2.00");
		System.out.println("5	Refrigerante	R$ 1.50");
		
		System.out.println("---- FACA O SEU PEDIDO ----");
		System.out.println("COD: ");
		int cod = sc.nextInt();
		System.out.println("QTD: ");
		int qtd = sc.nextInt();
		
		double pedido = 0.0;
		switch(cod) {
			case 1:
				pedido = (double) qtd * 4.00;
				System.out.printf("TOTAL: %.2f",pedido);
				break;
			case 2:
				pedido = (double) qtd * 4.50;
				System.out.printf("TOTAL: %.2f",pedido);
				break;
			case 3:
				pedido = (double) qtd * 5.00;
				System.out.printf("TOTAL: %.2f",pedido);
				break;
			case 4:
				pedido = (double) qtd * 2.00;
				System.out.printf("TOTAL: %.2f",pedido);
				break;
			case 5:
				pedido = (double) qtd * 1.50;
				System.out.printf("TOTAL: %.2f",pedido);
				break;
			default:
				System.out.println("Opcao invalida.");
		}
		sc.close();
	}
}
