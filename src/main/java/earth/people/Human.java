package earth.people;

public class Human {
    private final int legs = 2;
    private final int hands = 2;
    private final int eyes = 2;
    private final int nose = 1;
    private final int ears = 2;
    private final int head = 1;
    private final int fingers = 10;
    private final int toes = 10;
    private String name;
    private int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getLegs() {
        return legs;
    }

    public int getHands() {
        return hands;
    }

    public int getEyes() {
        return eyes;
    }

    public int getNose() {
        return nose;
    }

    public int getEars() {
        return ears;
    }

    public int getHead() {
        return head;
    }

    public int getFingers() {
        return fingers;
    }

    public int getToes() {
        return toes;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
