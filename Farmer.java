import java.util.ArrayList;
import java.util.List;

public class Farmer {

    private List<Animal> farmerList = new ArrayList<>();
    Farm farm = new Farm();

    // adding a horse to farmerList
    public Farmer() {
        Horse horse = new Horse("MALE", 5, 100);
        farmerList.add(horse);
    }

    public Animal requestAnimal(AnimalType animalType) {
        // if the farmer has animal he provides it.
        boolean animalProvided = false;
        Animal animal = null;

        for (int i = 0; i < farmerList.size(); i++) {
            if (farmerList.get(i) instanceof Cow && animalType == AnimalType.COW) {
                animal = farmerList.remove(i);
                animalProvided = true;
            } else if (farmerList.get(i) instanceof Dog && animalType == AnimalType.DOG) {
                animal = farmerList.remove(i);
                animalProvided = true;
            } else if (farmerList.get(i) instanceof Horse && animalType == AnimalType.HORSE) {
                animal = farmerList.remove(i);
                animalProvided = true;
            }
        }

        // otherwise he acquires it from farm;
        if (!animalProvided) {
            animal = farm.acquire(animalType);
        }
        return animal;
    }

    public void provideList() {
        System.out.println("1. Dog");
        System.out.println("2. Cow");
        System.out.println("3. Horse");
    }

    public void moveAnimal(Animal animal) {
        animal.move();
    }
}
