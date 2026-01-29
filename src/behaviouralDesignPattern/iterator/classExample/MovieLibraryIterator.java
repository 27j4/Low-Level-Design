package behaviouralDesignPattern.iterator.classExample;

public class MovieLibraryIterator implements MovieIterator<Movie> {
    private MovieLibrary movieLibrary;
    private int index;

    public MovieLibraryIterator(MovieLibrary movieLibrary) {
        this.movieLibrary = movieLibrary;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < movieLibrary.getMovies().size();
    }

    @Override
    public Movie next() {
        if (hasNext()) {
            return movieLibrary.getMovies().get(index++);
        }
        return null;
    }
}
