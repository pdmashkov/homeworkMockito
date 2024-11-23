package ru.netology.homeworkMockito;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PosterManagerTest {
    Movies movies1 = new Movies("Бладшот", "Боевик");
    Movies movies2 = new Movies("Вперед", "Мультфильм");
    Movies movies3 = new Movies("Джентльмены", "Боевик");
    Movies movies4 = new Movies("Человек-невидимка", "Ужасы");
    Movies movies5 = new Movies("Тролли. Мировой тур", "Мультфильм");

    @Test
    public void shouldSaveMovies() {
        PosterManager posterManager = new PosterManager();

        posterManager.saveMovie(movies1);
        posterManager.saveMovie(movies2);
        posterManager.saveMovie(movies3);

        Movies[] expected = {movies1, movies2, movies3};
        Movies[] actual = posterManager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastMovie() {
        PosterManager posterManager = new PosterManager();

        posterManager.saveMovie(movies1);
        posterManager.saveMovie(movies2);
        posterManager.saveMovie(movies3);
        posterManager.saveMovie(movies4);
        posterManager.saveMovie(movies5);

        posterManager.saveMovie(movies1);
        posterManager.saveMovie(movies2);
        posterManager.saveMovie(movies3);
        posterManager.saveMovie(movies4);
        posterManager.saveMovie(movies5);

        Movies[] expected = {movies5, movies4, movies3, movies2, movies1};
        Movies[] actual = posterManager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLast3MovieWhenAdded3() {
        PosterManager posterManager = new PosterManager();

        posterManager.saveMovie(movies1);
        posterManager.saveMovie(movies2);
        posterManager.saveMovie(movies3);

        Movies[] expected = {movies3, movies2, movies1};
        Movies[] actual = posterManager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLast2MovieWhenAdded10() {
        PosterManager posterManager = new PosterManager(2);

        posterManager.saveMovie(movies1);
        posterManager.saveMovie(movies2);
        posterManager.saveMovie(movies3);
        posterManager.saveMovie(movies4);
        posterManager.saveMovie(movies5);

        posterManager.saveMovie(movies1);
        posterManager.saveMovie(movies2);
        posterManager.saveMovie(movies3);
        posterManager.saveMovie(movies4);
        posterManager.saveMovie(movies5);

        Movies[] expected = {movies5, movies4};
        Movies[] actual = posterManager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}
