package esercizio03;

import java.util.HashMap;
import java.util.Map;

public class Rubrica {

	// Attributi
	static Map<String, Integer> contacts = new HashMap<>();

	// Metodi
	static void addContact(String name, int number) {
		contacts.put(name, number);
		System.out.println(contacts);
	}

	static void removeContact(String name) {
		contacts.remove(name);
		System.out.println(contacts);
	}

	static void searchContact(int number) {
		for (Map.Entry<String, Integer> entry : contacts.entrySet()) {
			if (entry.getValue().equals(number)) {
				System.out.println("Di seguito il nome corrispondente al numero: " + entry.getKey());
			}
		}
	}

	static int searchPhoneNumber(String name) {
		return contacts.get(name);
	}

	static void putContact() {
		contacts.put("nina", 9);
		contacts.put("schia", 4);
		contacts.put("ila", 30);
		contacts.put("anto", 60);
		contacts.put("pluto", 7);
		contacts.put("lili", 85);
	}

	static void printContacts() {
		for (Map.Entry<String, Integer> entry : contacts.entrySet()) {
			String key = entry.getKey();
			int val = entry.getValue();
			System.out.println("Il numero di telefono di " + key + " è: " + val);
		}
	}

}
