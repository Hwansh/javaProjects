import java.util.Scanner;
public class exerc4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int duracao;
		
		System.out.println("Digite a hora inicial: ");
		int hora_inicial = sc.nextInt();
		System.out.println("Digite a hora final: ");
		int hora_final = sc.nextInt();
		
		if(((hora_inicial > 24) && (hora_inicial < 0)) ||
			((hora_final > 24) && (hora_final < 0))){
			System.out.println("Hora inválida.");
		}else if(hora_inicial > hora_final) {
			duracao = 24 - (hora_inicial - hora_final);
			System.out.printf("O jogo durou %d hora(s)",duracao);
		}else {
			duracao = hora_final - hora_inicial;
			System.out.printf("O jogo durou %d hora(s)",duracao);
		}
		
		sc.close();
	}

}
