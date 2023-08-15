import java.util.ArrayList;
import java.util.List;

public class Farm {

    // list of animals
    private List<Animal> animalList = new ArrayList<>();

    // creating a random list of animals
    public Farm() {
        Cow cow = new Cow("MALE", 1, 300);
        Cow cow2 = new Cow("FEMALE", 2, 400);

        Dog dog = new Dog("MALE", 3, 50);

        animalList.add(cow);
        animalList.add(cow2);
        animalList.add(dog);

    }

    public Animal acquire(AnimalType animalType) {
        boolean animalProvided = false;
        Animal animal = null;


        // checking if two different gender animals are present for same animalType
        Animal maleAnimal = null;
        Animal femaleAnimal = null;
        for (int i = 0; i < animalList.size(); i++) {
            if (animalList.get(i) instanceof Cow && animalType == AnimalType.COW) {
                if (((Cow) animalList.get(i)).getGender().equals("MALE")) {
                    maleAnimal = animalList.get(i);
                } else {
                    femaleAnimal = animalList.get(i);
                }
            } else if (animalList.get(i) instanceof Dog && animalType == AnimalType.DOG) {
                if (((Dog) animalList.get(i)).getGender().equals("MALE")) {
                    maleAnimal = animalList.get(i);
                } else {
                    femaleAnimal = animalList.get(i);
                }
            } else if (animalList.get(i) instanceof Horse && animalType == AnimalType.HORSE) {
                if (((Horse) animalList.get(i)).getGender().equals("MALE")) {
                    maleAnimal = animalList.get(i);
                } else {
                    femaleAnimal = animalList.get(i);
                }
            }
        }

        // checking if there are both male and female animals available for mating
        if (maleAnimal != null && femaleAnimal != null) {
            animal = maleAnimal.mate(femaleAnimal);
            animalProvided = true;
        } else {
            if (maleAnimal != null) {
                animalList.remove(maleAnimal);
                animal = maleAnimal;
                animalProvided = true;
            } else if (femaleAnimal != null) {
                animalList.remove(femaleAnimal);
                animal = femaleAnimal;
                animalProvided = true;
            }
        }

        // when the request animal is not present in farm, creating a new
        // one and returning
        if (!animalProvided) {
            if (animalType == AnimalType.COW) {
                animal = new Cow("MALE", 5, 500);
            } else if (animalType == AnimalType.DOG) {
                animal = new Cow("FEMALE", 10, 300);
            } else if (animalType == AnimalType.HORSE) {
                animal = new Cow("FEMALE", 15, 640);
            }
        }
        return animal;
    }
}
