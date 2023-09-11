package SetsAndMapsAdvanced;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class E5_Phonebook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, String> phonebook = new HashMap<>();
        String data = scanner.nextLine();

        while (!data.equals("search")) {

            String name = data.split("-")[0];
            String phoneNumber = data.split("-")[1];

            phonebook.put(name, phoneNumber);


            data = scanner.nextLine();
        }
        //tursene v phonebook
        String name = scanner.nextLine();
        while (!name.equals("stop")) {
            //ako go ima

            if (phonebook.containsKey(name)) {
                System.out.println(name + " -> " + phonebook.get(name));
            }

            //ako go nqma
            else {
                System.out.printf("Contact %s does not exist.%n", name);
            }

            name = scanner.nextLine();
        }

    }
}
