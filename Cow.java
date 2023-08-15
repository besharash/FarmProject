public class Cow extends AnimalSkeletal {

    public Cow(String gender, int id, double weight) {
        super(gender, id, weight);
    }

    public void move() {
        System.out.println("Cow is moving! Its weight is: " + getWeight() + " Its gender is: " + getGender() + " Its id is: " + getId());

    }

    public Animal mate(Animal partner) {
        if (partner instanceof Cow) {
            Cow cowPartner = (Cow) partner;
            if (!cowPartner.getGender().equals(getGender())) {
                return new Cow("MALE", 2, ((Cow) partner).getWeight() + getWeight());
            } else {
                return null;
            }
        } else {
            return null;
        }
    }
}
