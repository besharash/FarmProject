public abstract class AnimalSkeletal implements Animal {
    private String gender;
    private int id;
    private double weight;

    public AnimalSkeletal(String gender, int id, double weight) {
        this.gender = gender;
        this.id = id;
        this.weight = weight;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
