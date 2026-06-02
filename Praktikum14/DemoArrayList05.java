package Praktikum14;

import java.util.ArrayList;

public class DemoArrayList05 {
    public static void main(String[] args) {
        ArrayList<Customer05> customers = new ArrayList<>(2);
        Customer05 customer1 = new Customer05(1, "Zakia");
        Customer05 customer2 = new Customer05(5, "Budi");
        customers.add(customer1);
        customers.add(customer2);

        for (Customer05 cust : customers) {
            System.out.println(cust.toString());
        }

        customers.add(new Customer05(4, "Cica"));

        for (Customer05 cust : customers) {
            System.out.println(cust.toString());
        }

        customers.add(2, new Customer05(100, "Rosa"));

        for (Customer05 cust : customers) {
            System.out.println(cust.toString());
        }

        System.out.println(customers.indexOf(customer2));

        Customer05 customer = customers.get(1);
        System.out.println(customer.name);
        customer.name = "Budi Utomo";

        for (Customer05 cust : customers) {
            System.out.println(cust.toString());
        }

        ArrayList<Customer05> newCustomers = new ArrayList<>();
        newCustomers.add(new Customer05(201, "Della"));
        newCustomers.add(new Customer05(202, "Victor"));
        newCustomers.add(new Customer05(203, "Sarah"));

        customers.addAll(newCustomers);

        for (Customer05 cust : customers) {
            System.out.println(cust.toString());
        }

        System.out.println(customers);
    }
}