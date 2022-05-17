package Main;

import MovieService.MovieService;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MovieMain extends MovieService {
  public static void main(String[] args) {
    MovieService movieService = new MovieService();
    System.out.println(Arrays.toString(movieService.getmovie()));
    movieService.findByTitle("abc");

  }
}
