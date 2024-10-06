package com.keyin;

import java.time.LocalDate;

public class Rental {
    private Movie movie;
    private LocalDate rentalDate;

    public Rental(Movie movie) {
        this.movie = movie;
        this.rentalDate = LocalDate.now();
        movie.rentMovie();
    }

    public Movie getMovie() {
        return movie;
    }

    public LocalDate getRentalDate() {
        return rentalDate;
    }

    @Override
    public String toString() {
        return "Rental{" +
                "movie=" + movie +
                ", rentalDate=" + rentalDate +
                '}';
    }
}
