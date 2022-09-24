package stakeholders;

import earth.people.Human;

import java.util.List;

public class Manager extends Human {
    public Manager(String name, int age) {
        super(name, age);
    }

    public Cashier hireACashier(Human human, List<Human> staff) {
        Cashier cashier = new Cashier(human.getName(), human.getAge());
        staff.add(cashier);
        return cashier;
    }

}
