import earth.enums.Complexion;
import earth.enums.Gender;
import earth.people.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Yes it works");
        List<Human> podE = new ArrayList<>();
        Human adedotun = new Adedotun("Adedotun", 7, Gender.MALE, Complexion.LIGHT);
        Human efiom = new Efiom("Efiom", 10);
        Human sylvia = new Sylvia("Sylvia", 2);
        Human faith = new Faith("Faith", 1);
        Human abdullahi = new Abdullahi("Abdullahi", 13);
        podE.add(adedotun);
        podE.add(efiom);
        podE.add(sylvia);
        podE.add(faith);
        podE.add(abdullahi);

        for (Human human: podE) {
            System.out.println("Name::: " + human.getName() + ", Age::: "
                    + human.getAge() + ", legs:::" + human.getLegs() + " and toes::: " + human.getToes());
        }


        // Assignment

    }
}
