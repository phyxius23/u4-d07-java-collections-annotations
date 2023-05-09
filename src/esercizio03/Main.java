package esercizio03;

import java.util.Scanner;

import exceptions.NotInRangeException;

public class Main {

	public static void main(String[] args) {
		// Attributi
		//Map<String, Integer> contact = new HashMap<>();

		Scanner input = new Scanner(System.in);

		Rubrica.putContact();
		//Rubrica.printContact();

		exit: while (true) {
			try {
				String name;

				System.out.println("Scegli una opzione: ");
				int option = Integer.valueOf(input.nextLine());

				if (option < 0 || option > 5) {
					throw new NotInRangeException("Il valore inserito non è una opzione valida.");
				}

				switch (option) {
				case 0:
					input.close();
					break exit;
				case 1:
					// String name;
					int number;

					// recupero nome del contatto
					System.out.println("Inserisci nome contatto:");
					name = input.nextLine();
					// recupero numero di telefono del contatto
					System.out.println("Inserisci numero di telefono:");
					number = Integer.valueOf(input.nextLine());
					// salvo i dati in rubrica
					Rubrica.addContact(name, number);
					break;
				case 2:
					// recupero nome del contatto da eliminare
					System.out.println("Inserisci nome del contatto da eliminare:");
					name = input.nextLine();
					// elimino il contatto
					Rubrica.removeContact(name);
					break;
				case 3:
					// recupero numero del contatto di cui voglio restituire il nome
					System.out.println("Inserisci numero del contatto di cui vuoi cercare la persona:");
					number = Integer.valueOf(input.nextLine());
					Rubrica.searchContact(number);
					break;
				case 4:
					// recupero nome del contatto di cui voglio restituire il numero
					System.out.println("Inserisci nome del contatto di cui vuoi cercare il numero:");
					name = input.nextLine();
					System.out.println(Rubrica.searchPhoneNumber(name));
					break;
				case 5:
					Rubrica.printContacts();
					break;

				default:
					System.out.println("Il valore inserito non è accettato.");
					break;
				}
			} catch (Exception e) {
				System.out.println("Il valore inserito non è una opzione valida.");
			}
		}
		input.close();

		//
		//		System.out.println(name);
		//		System.out.println(number);
		//input.close();
	}

}
