package esercizio01;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		// Attributi 
		int length;
		Set<String> myElements = new HashSet<>();
		Set<String> myDuplicateElements = new HashSet<>();
		Scanner input = new Scanner(System.in);

		while (true) {
			try {
				System.out.println("Scrivi il numero di elementi che vuoi inserire: ");
				length = Integer.valueOf(input.nextLine()); // String - Message => NumberFormatException

				//devo aggiungere una condizione che testa se il numero inserito è maggiore di 0

				// Per utilizzare .nextInt() e non perdermi il primo ciclo del for dovrò utilizzare un input.nextLine() a vuoto 
				//length = input.nextInt();
				//input.nextLine();

				break;
			} catch (NumberFormatException e) {
				System.out.println("Sono accettati solo numeri interi positivi.");
			}
		}

		if (length > 0) {
			for (int i = 0; i < length; i++) {
				System.out.println("Inserisci una parola: ");
				String str = input.nextLine();

				if (myElements.contains(str)) {
					myDuplicateElements.add(str);
				} else {
					myElements.add(str);
				}
			}

			if (myDuplicateElements.size() > 0) {
				System.out.println("Di seguito l'elenco delle parole duplicate:");
				for (String duplicateElement : myDuplicateElements) {
					System.out.println(duplicateElement);
				}
			}

			System.out.println("Ci sono " + myElements.size() + " parole distinte.");

			if (myElements.size() > 0) {
				System.out.println("Di seguito l'elenco delle parole distinte:");
				for (String element : myElements) {
					System.out.println(element);
				}
			}
		} else {
			System.out.println("Sono accettati solo numeri interi positivi.");
		}

		input.close();
	}
}
