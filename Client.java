import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Farmer farmer = new Farmer();

        while (true) {
            farmer.provideList();
            System.out.println("4. Exit");
            System.out.print("Enter Choice: ");
            int choice = scanner.nextInt();
            AnimalType animalType = null;
            switch (choice) {
                case 1:
                    animalType = AnimalType.DOG;
                    break;
                case 2:
                    animalType = AnimalType.COW;
                    break;
                case 3:
                    animalType = AnimalType.HORSE;
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Invalid Choice!");
            }

            Animal animal = farmer.requestAnimal(animalType);
            animal.move();
        }
    }
}
