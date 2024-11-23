package ru.netology.homeworkMockito;

public class PosterManager {
    private Movies[] movies = new Movies[0];
    private int countMovies;

    public PosterManager(int countMovies) {
        this.countMovies = countMovies;
    }

    public PosterManager() {
        this.countMovies = 5;
    }

    public void saveMovie(Movies movie) {
        Movies[] tmp = new Movies[movies.length + 1];

        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[tmp.length - 1] = movie;
        movies = tmp;
    }

    public Movies[] findAll() {
        return movies;
    }

    public Movies[] findLast() {
        int resultLength = movies.length - 1;

        if (movies.length < countMovies) {
            countMovies = movies.length;
        }

        Movies[] result = new Movies[countMovies];

        for (int i = 0; i < countMovies; i++) {
            result[i] = movies[resultLength - i];
        }

        return result;
    }
}
