public class PosterManager {
    private RepositoryPosterManager repo;
    private int limit;

    public PosterManager() {
        this.limit = 10;
    }


    public PosterManager(RepositoryPosterManager repo, int limit) {
        this.repo = repo;
        this.limit = limit;
    }

    public void addFilm(Poster movie) {
        repo.addFilm(movie);
    }

    public Poster[] removeById(int id) {
        Poster[] tmp = repo.removeById(id);
        return tmp;
    }

    public Poster[] removeAll() {
        Poster[] tmp = repo.removeAll();
        return tmp;
    }

    public Poster[] findById(int id) {
        Poster[] tmp = repo.findById(id);
        return tmp;
    }

    public Poster[] findAll() {
        Poster[] tmp = repo.findAll();
        return tmp;
    }


    public Poster[] findLast() {
        Poster[] movies = repo.findAll();
        int limitLenght;

        if (movies.length < limit) {
            limitLenght = movies.length;
        } else {
            limitLenght = limit;
        }

        Poster[] tmp = new Poster[limitLenght];

        for (int i = 0; i < limitLenght; i++) {
            tmp[i] = movies[movies.length - 1 - i];
        }
        return tmp;

    }


}