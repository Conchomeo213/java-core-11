package SerialService;

import Model.Film;

public class Serial extends Film {
    private int episodes;
    private int averageTime;

    public Serial() {
    }

    public Serial(int id, String title, String style, String director, int publishDay, int episodes, int averageTime) {
        super(id, title, style, director, publishDay);
        this.episodes = episodes;
        this.averageTime = averageTime;
    }

    public int getEpisodes() {
        return episodes;
    }

    public void setEpisodes(int episodes) {
        this.episodes = episodes;
    }

    public int getAverageTime() {
        return averageTime;
    }

    public void setAverageTime(int averageTime) {
        this.averageTime = averageTime;
    }

    @Override
    public String toString() {
         return "\nSo thu tu phim : " + getId() + " - Ten Phim  : "+ getTitle() + " - The loai : " + getStyle() + " - Tac gia : " +
                getDirector() + " - Ngay cong chieu : " + getPublishDay() + "- So tap phim : " + getEpisodes() + " - Thoi luong trung binh moi tap " + getAverageTime();
    }
}
