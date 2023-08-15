public class Horse extends AnimalSkeletal {

    public Horse(String gender, int id, double weight) {
        super(gender, id, weight);
    }

    public void move() {
        System.out.println("Horse is moving! Its weight is: " + getWeight() + " Its gender is: " + getGender() + " Its id is: " + getId());

    }

    public Animal mate(Animal partner) {
        if (partner instanceof Cow) {
            Horse horsepartner = (Horse) partner;
            if (!horsepartner.getGender().equals(getGender())) {
                return new Cow("FEMALE", 2, horsepartner.getWeight() + getWeight());
            } else {
                return null;
            }
        } else {
            return null;
        }
    }
}
