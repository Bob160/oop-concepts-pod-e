import earth.enums.Complexion;
import earth.enums.Gender;
import earth.people.*;
import elements.Product;
import stakeholders.Cashier;
import stakeholders.Customer;
import stakeholders.Manager;

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

        Adedotun adedotun1 = new Adedotun("Adedotun", 7, Gender.MALE, Complexion.LIGHT);
        adedotun1.walk(adedotun.getName());
        faith.walk(faith.getName());


        // Assignment
        List<Human> staff = new ArrayList<>();
        // we create a new manager
        Manager managerSylvia = new Manager("Sylvia", 4);

        // manager hires a cashier
        Cashier hiredCashier = managerSylvia.hireACashier(adedotun, staff);

        // we create a new customer
        Customer customerFaith = new Customer("Faith", 2);

        // we add product to store
        Product eba = new Product("Eba", 2.9, 500, 2);

        // cashier sells product to new customer
        hiredCashier.sellProduct(eba, customerFaith, 25);

        System.out.println("Customer " + customerFaith.getName() + " bought "
                + customerFaith.getMyPurchasedProduct().get(0).getName());

        System.out.println("And also received a receipt with id " +
                customerFaith.getPurchaseReceipts().get(0).getInvoiceId() + " on "
                + customerFaith.getPurchaseReceipts().get(0).getDate());

    }
}
