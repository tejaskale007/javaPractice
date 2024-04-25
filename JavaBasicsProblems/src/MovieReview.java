/*
Write a Java program to create a class called "Movie" with attributes for title, director, actors,
and reviews, and methods for adding and retrieving reviews
 */

import java.util.ArrayList;

class Movie{
    public String title;
    public String director;
    public ArrayList<String> actors;
    public ArrayList<String> reviews;

    public Movie(String title, String director, ArrayList<String> actors){
        this.title = title;
        this.director = director;
        this.actors = new ArrayList<>(actors);
        this.reviews= new ArrayList<>();
    }

    public void addReview(String review){
        this.reviews.add(review);
    }

    public ArrayList<String> getReviews(){
        return this.reviews;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Movie Title: ").append(title).append("\n");
        sb.append("Director: ").append(director).append("\n");

        // Append actors
        sb.append("Actors: ");
        for (String actor : actors) {
            sb.append(actor).append(", ");
        }
        if (!actors.isEmpty()) {
            sb.delete(sb.length() - 2, sb.length()); // Remove the last comma and space
        }
        sb.append("\n");

        // Append reviews
        sb.append("Reviews: ");
        for (String review : reviews) {
            sb.append(review).append(", ");
        }
        if (!reviews.isEmpty()) {
            sb.delete(sb.length() - 2, sb.length()); // Remove the last comma and space
        }

        return sb.toString();
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
                new ArrayList<String>(detachmentActors){});

        Detachment.addReview("Very insightFull movie about the childrens life");
        System.out.println(Detachment.getReviews());

        System.out.println("\n\nAbout Movie: \n" + Detachment.toString());
    }
}

/*
======OUTPUT======
[Very insightFull movie about the childrens life]


About Movie:
Movie Title: Detachment
Director: Tony Kaye
Actors: Adrien Brody, Christina Hendricks
Reviews: Very insightFull movie about the childrens life

Process finished with exit code 0
 */
