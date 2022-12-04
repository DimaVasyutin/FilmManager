public class RepositoryPosterManager {
    private Poster[] movies = new Poster[0];


    public void addFilm(Poster movie) {
        Poster[] tmp = new Poster[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[tmp.length - 1] = movie;
        movies = tmp;
    }

    public Poster[] findAll() {
        return movies;
    }

    public Poster[] findById(int id) {
        Poster[] tmp = new Poster[1];

        for (Poster movie : movies) {
            if (movie.getPosterId() == id) {
                tmp[0] = movie;
                return tmp;
            }
        }
        return null;
    }

    public Poster[] removeById(int id) {
        if (findById(id) == null) {
            return new Poster[0];
        }
        Poster[] tmp = new Poster[movies.length - 1];
        int index = 0;
        for (Poster movie : movies) {
            if (movie.getPosterId() != id) {
                tmp[index] = movie;
                index++;
            }
        }
        movies = tmp;
        return movies;
    }

    public Poster[] removeAll() {
        Poster[] tmp = new Poster[0];
        movies = tmp;
        return movies;
    }


}
