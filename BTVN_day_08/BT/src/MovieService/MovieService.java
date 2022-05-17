package MovieService;

import java.util.Arrays;

public class MovieService extends Movie {
    public  Movie[] getmovie(){
        Movie[] movies = {
                new Movie(1,"Iron Man","Action","Jon Favreau",2008,120),
                new Movie(2,"the Avengers","Action","Joss Whedon",2012,143),
                new Movie(3,"Avengers: Age of Ultron","Action","Joss Whedon",2015,130),
                new Movie(4,"Avengers: Infinity War","Acton"," Anthony Russo, Joe Russo",2018,140),
                new Movie(5,"Avengers: Endgame","Action","Anthony Russo, Joe Russo",2019,180),
        };

        return movies;
    }
         public void findByTitle(String title){
             int count = 0;
             for (Movie movie:getmovie()) {
                 if (movie.getTitle().contains(title)){
                     count++;
                     System.out.println("Phim ban can tim la : " + movie);

                 }
                 if (count == 0){
                     System.out.println("Khong co phim nao phu hop voi ten nay :" + title);
                 }
                 break;
             }


         }


}
