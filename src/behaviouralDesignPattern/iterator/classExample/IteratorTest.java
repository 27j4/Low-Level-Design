import behaviouralDesignPattern.iterator.classExample.Movie;
import behaviouralDesignPattern.iterator.classExample.MovieIterator;
import behaviouralDesignPattern.iterator.classExample.MovieLibrary;

void main() {
    MovieLibrary movieLibrary = new MovieLibrary();
    movieLibrary.addMovie(new Movie("Inception", "A, B, C", "English"));
    movieLibrary.addMovie(new Movie("The Godfather", "D, E, F", "English"));
    movieLibrary.addMovie(new Movie("The Dark Knight", "G, H, I", "English"));

    MovieIterator<Movie> iterator = movieLibrary.createIterator();
    while (iterator.hasNext()) {
        Movie movie = iterator.next();
        System.out.println("Title: " + movie.getTitle() + ", Cast: " + movie.getCast() + ", Year: " + movie.getLanguage());
    }
}