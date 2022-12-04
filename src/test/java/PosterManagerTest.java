import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;

public class PosterManagerTest {

    RepositoryPosterManager repo = Mockito.mock(RepositoryPosterManager.class);
    PosterManager manager = new PosterManager(repo, 3);


    Poster film1 = new Poster(1, "Терминатор 2");
    Poster film2 = new Poster(2, "Начало");
    Poster film3 = new Poster(3, "Назад в будущее");

    @BeforeEach
    public void setUp() {
        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);
    }


    @Test
    public void shouldFindLastMoreThanFilms() {
        Poster[] movies = {film1, film2, film3};
        doReturn(movies).when(repo).findAll();

        Poster[] expected = {film3, film2, film1};
        Poster[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);


    }

    @Test
    public void shouldFindId() {
        Poster[] movies = {film2};
        doReturn(movies).when(repo).findById(2);

        Poster[] expected = {film2};
        Poster[] actual = manager.findById(2);

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldFindIdWhenNotFilmWithThisId() {
        Poster[] movies = new Poster[0];
        doReturn(movies).when(repo).findById(4);

        Poster[] expected = new Poster[0];
        Poster[] actual = manager.findById(4);

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldRemoveAll() {
        Poster[] movies = new Poster[0];
        doReturn(movies).when(repo).removeAll();

        Poster[] expected = new Poster[0];
        Poster[] actual = manager.removeAll();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldRemoveById() {
        Poster[] movies = {film1, film3};
        doReturn(movies).when(repo).removeById(2);

        Poster[] expected = {film1, film3};
        Poster[] actual = manager.removeById(2);

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldRemoveByIdWhenNotFilmWithThisId() {
        Poster[] movies = new Poster[0];
        doReturn(movies).when(repo).removeById(4);

        Poster[] expected = new Poster[0];
        Poster[] actual = manager.removeById(4);

        Assertions.assertArrayEquals(expected, actual);

    }


}