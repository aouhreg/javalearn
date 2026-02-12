package collection_travesal;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionTest {
    public static void main(String[] args) {
        //目標：理解便利集合中的自定義對象

        //1.準備一個集合容器
        Collection<Movie> movies = new ArrayList<>();
        movies.add(new Movie("movie1",20,"a,b"));
        movies.add(new Movie("movie2",100,"c,d"));
        movies.add(new Movie("movie3", 10,"e"));
        System.out.println(movies);

        //2.便利每個電影對象
        for (Movie movie : movies) {
            System.out.println(movie.getName());
            System.out.println(movie.getPrice());
            System.out.println(movie.getActor());
            System.out.println("-------------");
        }
    }
}
