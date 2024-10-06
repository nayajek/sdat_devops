package com.keyin;

import java.util.ArrayList;
import java.util.List;

public class MovieRentalService {
    private List<Movie> availableMovies;

    public MovieRentalService() {
        this.availableMovies = new ArrayList<>();
    }

    public void addMovie(Movie movie) {
        availableMovies.add(movie);
    }

    public void displayAvailableMovies() {
        System.out.println("Available Movies:");
        for (Movie movie : availableMovies) {
            if (!movie.isRented()) {
                System.out.println(movie);
            }
        }
    }

    public Movie findMovieByTitle(String title) {
        for (Movie movie : availableMovies) {
            if (movie.getTitle().equalsIgnoreCase(title)) {
                return movie;
            }
        }
        return null;
    }
}
