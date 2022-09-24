package earth.people;

import earth.enums.Complexion;
import earth.enums.Gender;

public class Adedotun extends Human {
    private Gender gender;
    private Complexion complexion;

    public Adedotun(String name, int age, Gender gender, Complexion complexion) {
        super(name, age);
        this.gender = gender;
        this.complexion = complexion;
    }

    public Gender getGender() {
        return gender;
    }

    public Complexion getComplexion() {
        return complexion;
    }
}
