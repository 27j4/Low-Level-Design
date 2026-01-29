package behaviouralDesignPattern.iterator.classExample;

import java.util.ArrayList;
import java.util.List;

public class MovieLibrary implements MovieCollection{
    private List<Movie> movies = new ArrayList<>();

    public MovieLibrary() {
    }

    public void addMovie(Movie movie) {
        movies.add(movie);
    }

    public List<Movie> getMovies() {
        return movies;
    }

    @Override
    public MovieIterator<Movie> createIterator() {
        return new MovieLibraryIterator(this);
    }
}
