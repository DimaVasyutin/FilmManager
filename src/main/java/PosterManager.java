public class PosterManager {
    private String[] movies = new String[0];
    private int limit;

    public PosterManager() {
        this.limit = 10;
    }

    public PosterManager(int limit) {
        this.limit = limit;
    }


    public void addFilm(String movie) {
        String[] tmp = new String[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[tmp.length - 1] = movie;
        movies = tmp;
    }

    public String[] findAll() {
        return movies;
    }

    public String[] findLast() {
        int limitLenght;

        if (movies.length < limit) {
            limitLenght = movies.length;
        } else {
            limitLenght = limit;
        }

        String[] tmp = new String[limitLenght];

        for (int i = 0; i < limitLenght; i++) {
            tmp[i] = movies[movies.length - 1 - i];
        }
        return tmp;

    }


}