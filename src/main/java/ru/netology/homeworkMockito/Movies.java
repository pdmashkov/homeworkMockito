package ru.netology.homeworkMockito;

public class Movies {
    private String movieTitle;
    private String genre;

    public Movies(String movieTitle, String genre) {
        this.movieTitle = movieTitle;
        this.genre = genre;
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
