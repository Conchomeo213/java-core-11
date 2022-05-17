package Model;

public class Film {
    private int id ;
    private String title;
    private String Style;
    private String Director;
    private int publishDay;

    public Film() {
    }

    public Film(int id, String title, String style, String director, int publishDay) {
        this.id = id;
        this.title = title;
        Style = style;
        Director = director;
        this.publishDay = publishDay;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getStyle() {
        return Style;
    }

    public void setStyle(String style) {
        Style = style;
    }

    public String getDirector() {
        return Director;
    }

    public void setDirector(String director) {
        Director = director;
    }

    public int getPublishDay() {
        return publishDay;
    }

    public void setPublishDay(int publishDay) {
        this.publishDay = publishDay;
    }

    @Override
    public String toString() {
        return "Film{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", Style='" + Style + '\'' +
                ", Director='" + Director + '\'' +
                ", publishDay=" + publishDay +
                '}';
    }
}
