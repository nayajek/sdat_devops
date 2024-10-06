package com.keyin;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private List<Rental> rentals;

    public Customer(String name) {
        this.name = name;
        this.rentals = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Rental> getRentals() {
        return rentals;
    }

    public void addRental(Rental rental) {
        rentals.add(rental);
        System.out.println(name + " rented " + rental.getMovie().getTitle());
    }

    public void returnRental(Rental rental) {
        rentals.remove(rental);
        rental.getMovie().returnMovie();
        System.out.println(name + " returned " + rental.getMovie().getTitle());
    }

    @Override
    public String toString() {
        return "Customer{name='" + name + "', rentals=" + rentals + '}';
    }
}
