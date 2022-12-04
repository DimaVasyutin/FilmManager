import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PosterManagerTest {


    @Test
    public void test() {
        PosterManager manager = new PosterManager();

        manager.addFilm("Назад в будущее");
        manager.addFilm("Крепкий орешек");
        manager.addFilm("Терминатор 2");

        String[] expected = {"Назад в будущее", "Крепкий орешек", "Терминатор 2"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);


    }

    @Test
    public void test1() {
        PosterManager manager = new PosterManager(2);

        manager.addFilm("Назад в будущее");
        manager.addFilm("Крепкий орешек");
        manager.addFilm("Терминатор 2");


        String[] expected = {"Терминатор 2", "Крепкий орешек"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);


    }

    @Test
    public void test2() {
        PosterManager manager = new PosterManager(3);

        manager.addFilm("Назад в будущее");
        manager.addFilm("Крепкий орешек");
        manager.addFilm("Терминатор 2");


        String[] expected = {"Терминатор 2", "Крепкий орешек", "Назад в будущее"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);


    }

    @Test
    public void test3() {
        PosterManager manager = new PosterManager();

        manager.addFilm("Назад в будущее");
        manager.addFilm("Крепкий орешек");
        manager.addFilm("Терминатор 2");


        String[] expected = {"Терминатор 2", "Крепкий орешек", "Назад в будущее"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);


    }
}