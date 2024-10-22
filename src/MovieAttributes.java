public class MovieAttributes {
    String tittle;
    String genre;
    int rating;

    public MovieAttributes (String tittle, String genre) {
        this.tittle = tittle;
        this.genre = genre;
    }

    // Use this class to create different movie objects, each with its own
    //title, genre, and rating.

    public  MovieAttributes (String tittle, String genre, int rating) {
        this.tittle = tittle;
        this.genre = genre;
        this.rating = rating;
    }


    public void movieDetails() {
        System.out.println("Tittle: " + tittle);
        System.out.println("Genre: " + genre);
        System.out.println("Rating: " + rating);
     
    }
    public static void main(String[] args) {
        MovieAttributes attributes1 = new MovieAttributes("Me before you", "romance", 4);
        MovieAttributes attributes2 = new MovieAttributes("Inception", "sci-fi", 5);
        MovieAttributes attributes3 = new MovieAttributes("Pirates of the Caribbean", "fantasy");
        MovieAttributes attributes4 = new MovieAttributes("The Godfather", "drama", 10);
        System.out.println("Attribute one: ");
        attributes1.movieDetails();
        System.out.println("Attribute two: ");
        attributes2.movieDetails();
        System.out.println("Attribute three: ");
        attributes3.movieDetails();
        System.out.println("Attribute four: ");
        attributes4.movieDetails();

    }

}
