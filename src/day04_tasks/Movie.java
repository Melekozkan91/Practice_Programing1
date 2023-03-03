package day04_tasks;

public class Movie {
    public static void main(String[] args) {
        String name ="Harry Potter";
        String genre ="Fantasy, Adventure";
        double duration =2.26;
        String releaseDate ="Dec 8,2009";
        String rating ="PG-13";
        Boolean sequels =true;
        byte rottenRating =77;
        boolean isOnDvd =true;

        String print ="Tonight we are streaming "+name+ " which was released on "+releaseDate+"\nThis "+genre+" movie got a "+rottenRating+" rating on Rotten Tomatoes."+"\nThe rating "+rating+" and it runs for "+duration+" hours."+"\nThis is a sequel "+sequels+ " and is on dvd "+isOnDvd;
        System.out.println("-----Welcome to the Cinema-----");
        System.out.println(print);











    }
}
