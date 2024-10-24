package akash;

abstract class Vaccine {
    int age;
    String nationality;

    // Constructor to initialize age and nationality
    public Vaccine(int age, String nationality) {
        this.age = age;
        this.nationality = nationality;
    }

    // Concrete method for the first dose
    public void firstDose() {
        if (nationality.equalsIgnoreCase("Indian") && age >= 18) {
            System.out.println("First dose taken. Pay 250 INR.");
        } else {
            System.out.println("Not eligible for the first dose.");
        }
    }

    // Concrete method for the second dose
    public void secondDose() {
        System.out.println("Second dose taken.");
    }

    // Abstract method for booster dose
    abstract void boosterDose();
}

// Implementation class
class VaccinationSuccessful extends Vaccine {
    public VaccinationSuccessful(int age, String nationality) {
        super(age, nationality);
    }

    @Override
    void boosterDose() {
        System.out.println("Booster dose taken.");
    }
}

public class Vaccination {
    public static void main(String[] args) {
        VaccinationSuccessful v = new VaccinationSuccessful(25, "Indian");
        v.firstDose();
        v.secondDose();
        v.boosterDose();
    }
}

