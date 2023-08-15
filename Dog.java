public class Dog extends AnimalSkeletal {

    public Dog(String gender, int id, double weight) {
        super(gender, id, weight);
    }

    public void move() {
        System.out.println("Dog is moving! Its weight is: " + getWeight() + " Its gender is: " + getGender() + " Its id is: " + getId());
    }

    public Animal mate(Animal partner) {
        if (partner instanceof Dog) {
            Dog dogPartner = (Dog) partner;
            if (!dogPartner.getGender().equals(getGender())) {
                return new Dog("FEMALE", 2, dogPartner.getWeight() + getWeight());
            } else {
                return null;
            }
        } else {
            return null;
        }
    }
}
