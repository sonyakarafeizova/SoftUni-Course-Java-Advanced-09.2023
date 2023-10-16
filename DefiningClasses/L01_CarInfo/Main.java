package DefiningClasses.L01_CarInfo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <=count ; i++) {
            String data = scanner.nextLine();
            String brand = data.split("\\s+")[0];
            String model = data.split("\\s+")[1];
            int hp = Integer.parseInt(data.split("\\s+")[2]);


            Car car = new Car();

            car.setBrand(brand);
            car.setModel(model);
            car.setHorsePower(hp);
            System.out.println(car.toString());
        }

    }

}
