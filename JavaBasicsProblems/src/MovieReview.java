/*
Write a Java program to create a class called "Movie" with attributes for title, director, actors,
and reviews, and methods for adding and retrieving reviews
 */

import java.util.ArrayList;

class Movie{
    public String title;
    public String director;
    public ArrayList<String> actors;
    private ArrayList<Review> reviews;

    public Movie(String title, String director, ArrayList<String> actors){
        this.title = title;
        this.director = director;
        this.actors = new ArrayList<>(actors);
        this.reviews= new ArrayList<>();
    }

    public void addReview(Review review){
        this.reviews.add(review);
    }

    public ArrayList<Review> getReviews(){
        return this.reviews;
    }
}

class Review {
    private String reviewer;
    private int rating;
    private String comments;

    public Review(String reviewer, int rating, String comments) {
        this.reviewer = reviewer;
        this.rating = rating;
        this.comments = comments;
    }

    @Override
    public String toString() {
        return "Reviewer: " + reviewer + ", Rating: " + rating + ", Comments: " + comments;
    }
}

public class MovieReview{
    public static void main(String[] args){
        ArrayList<String> detachmentActors = new ArrayList<>();
        detachmentActors.add("Adrien Brody");
        detachmentActors.add("Christina Hendricks");
        Movie Detachment = new Movie(
                "Detachment",
                "Tony Kaye",
                new ArrayList<>(detachmentActors) {
                });

        Review review = new Review("Tejas Kale", 5, "Very insightful movie about children's lives");
        Detachment.addReview(review);
        displayMovieDetails(Detachment);
    }

    public static void displayMovieDetails(Movie movie) {
        System.out.println("\n\nAbout Movie: ");
        System.out.println("Movie Title: " + movie.title);
        System.out.println("Director: " + movie.director);
        System.out.print("Actors: ");
        for (String actor : movie.actors) {
            System.out.print(actor + ", ");
        }
        System.out.println("\nReviews: ");
        for (Review review : movie.getReviews()) {
            System.out.println(review);
        }
    }
}

/*
======OUTPUT======
About Movie:
Movie Title: Detachment
Director: Tony Kaye
Actors: Adrien Brody, Christina Hendricks,
Reviews:
Reviewer: Tejas Kale, Rating: 5, Comments: Very insightful movie about children's lives

Process finished with exit code 0
 */
