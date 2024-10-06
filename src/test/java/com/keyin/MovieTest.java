package com.keyin;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MovieTest {
    @Test
    public void testRentMovie() {
        Movie movie = new Movie("Inception", "Sci-Fi");
        movie.rentMovie();
        assertTrue(movie.isRented());
    }

    @Test
    public void testReturnMovie() {
        Movie movie = new Movie("Inception", "Sci-Fi");
        movie.rentMovie();
        movie.returnMovie();
        assertFalse(movie.isRented());
    }

    @Test
    public void testAddRentalToCustomer() {
        Movie movie = new Movie("Inception", "Sci-Fi");
        Rental rental = new Rental(movie);
        Customer customer = new Customer("John");
        customer.addRental(rental);
        assertEquals(1, customer.getRentals().size());
    }
}
