package MovieService;

import Model.Film;

public class Movie  extends Film {
    private int time;

    public Movie() {
    }

    public Movie(int id, String title, String style, String director, int publishDay, int time) {
        super(id, title, style, director, publishDay);
        this.time = time;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "\nSo thu tu phim : " + getId() + " - Ten Phim  : "+ getTitle() + " - The loai : " + getStyle() + " - Tac gia : " +
        getDirector() + " - Ngay cong chieu : " + getPublishDay() + " - Thoi Luong : " + getTime() + " Phut";
    }
}
