package behaviouralDesignPattern.iterator.classExample;

public class Movie {
    private String title;
    private String cast;
    private String language;

    public Movie(String title, String cast, String language) {
        this.title = title;
        this.cast = cast;
        this.language = language;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCast() {
        return cast;
    }

    public void setCast(String cast) {
        this.cast = cast;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", cast='" + cast + '\'' +
                ", language='" + language + '\'' +
                '}';
    }
}
