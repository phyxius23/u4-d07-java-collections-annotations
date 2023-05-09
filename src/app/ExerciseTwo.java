package app;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class ExerciseTwo {

	public static void main(String[] args) {

		int length;
		Scanner input = new Scanner(System.in);

		while (true) {
			try {
				System.out.println("Inserire un numero intero positivo: ");
				length = Integer.valueOf(input.nextLine()); // String - Message => NumberFormatException
				break;
			} catch (NumberFormatException e) {
				System.out.println("Sono accettati solo numeri interi positivi.");
			}
		}

		List<Integer> myList = generateSortList(length);
		System.out.println("Lista ordinata: " + myList);

		generateReverseAddList(myList);
		System.out.println("Lista concatenata ad una reverse: " + myList);

		printList(myList, false);

		input.close();

	}

	public static List<Integer> generateSortList(int l) {
		List<Integer> myList = new ArrayList<>();
		Random random = new Random();
		int numRand;

		for (int i = 0; i < l; i++) {
			numRand = random.nextInt(100) + 1;
			myList.add(numRand);
		}

		System.out.println("Lista non ordinata: " + myList);
		Collections.sort(myList);

		return myList;
	}

	public static List<Integer> generateReverseAddList(List<Integer> list) {
		List<Integer> reverseList = new ArrayList<>(list);
		Collections.reverse(reverseList);
		list.addAll(reverseList);

		return list;
	}

	public static void printList(List<Integer> list, boolean b) {
		for (int i = 0; i < list.size(); i++) {
			if (b && i % 2 != 0) {
				System.out.println("Alla posizione (pari) nr. " + (i + 1) + " c'è il valore " + list.get(i));
			}
			if (!b && i % 2 == 0) {
				//System.out.println(list.get(i));
				System.out.println("Alla posizione (dispari) nr. " + (i + 1) + " c'è il valore " + list.get(i));
			}
		}
	}

}
