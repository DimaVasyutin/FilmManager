public class Poster {
    private int id;
    private String nameFilm;

    public Poster(int id, String nameFilm) {
        this.id = id;
        this.nameFilm = nameFilm;

    }

    public int getPosterId() {
        return id;
    }

    public String getNameFilm() {
        return nameFilm;
    }

    public void setNameFilm(String nameFilm) {
        this.nameFilm = nameFilm;
    }

    public void setIdFilm(int id) {
        this.id = id;
    }

}
