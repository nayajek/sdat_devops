package com.keyin;

public class Movie {
    private String title;
    private String genre;
    private boolean isRented;

    public Movie(String title, String genre) {
        this.title = title;
        this.genre = genre;
        this.isRented = false;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public boolean isRented() {
        return isRented;
    }

    public void rentMovie() {
        if (!isRented) {
            isRented = true;
            System.out.println(title + " has been rented.");
        } else {
            System.out.println(title + " is already rented.");
        }
    }

    public void returnMovie() {
        if (isRented) {
            isRented = false;
            System.out.println(title + " has been returned.");
        } else {
            System.out.println(title + " was not rented.");
        }
    }

    @Override
    public String toString() {
        return title + " (" + genre + ") - Available: " + !isRented;
    }
}
