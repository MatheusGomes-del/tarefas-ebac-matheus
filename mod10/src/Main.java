import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite as notas do seu semestre:");

		int[] notas = new int[4];
        int media;
		int soma = 0;

		for(int i =0; i < 4; i++) {
			notas[i] = scanner.nextInt();

			soma += notas[i];
		}

		media = soma / 4;
		System.out.println(media);

		if(media >= 7) {
			System.out.println("Aprovado");
		} else if (media >= 5 ) {
			System.out.println("Recuperação");
		} else {
			System.out.println("Reprovado");
		}

		scanner.close();
	}
}