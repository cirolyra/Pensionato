package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Client;

public class Programa {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Client[] vect = new Client[10];

		System.out.println("Quantos quartos? ");
		int quantidade = sc.nextInt();
		sc.nextLine();

		for (int i = 1; i <= quantidade; i++) {

			System.out.println("Aluguel do quarto #" + i);
			System.out.print("Nome do estudante: ");
			String nome = sc.nextLine();
			System.out.print("E-mail: ");
			String email = sc.nextLine();
			System.out.print("Quarto: ");
			int quarto = sc.nextInt();
			vect[quarto] = new Client(nome, email);
			sc.nextLine();

		}

		System.out.println("Quartos ocupados: ");

		for (int i = 0; i < 10; i++) {
			
			if (vect[i] != null) {
				System.out.println(i+": " + vect[i]);
			}
			
		}

		sc.close();

	}

}
