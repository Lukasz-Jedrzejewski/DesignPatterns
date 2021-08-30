package com.legion.memento;

public class Main {
    public static void main(String[] args) {
        firstTest();
        System.out.println();
        secondTest();
    }
    
    public static void firstTest() {
        Movie movie = new Movie("Title 1", "description 1", 1);
        History history = new History();

        movie.setValues("Title 2", "description 2", 2);
        history.push(movie.createState());

        movie.setValues("Title 3", "description 3", 3);
        history.push(movie.createState());

        movie.setTitle("My title");
        history.push(movie.createState());

        movie.setValues("Title 4", "description 4", 4);
        movie.restore(history.pop());
        /**
         * Expected output of line below: true, true, true
         */
        System.out.println(movie.getTitle().equals("My title") + ", " +
                movie.getDescription().equals("description 3") + ", " +
                String.valueOf(movie.getRate()).equals("3"));

        /**
         * expected output of line below: My tittle, description 3, 3
         */
        System.out.println(movie.toString());
    }

    public static void secondTest() {
        Movie anotherMovie = new Movie("Title 1", "description 1", 1);
        History anotherHistory = new History();

        anotherMovie.setValues("Title 2", "description 2", 2);
        anotherHistory.push(anotherMovie.createState());

        anotherMovie.setValues("Title 3", "description 3", 3);
        anotherHistory.push(anotherMovie.createState());

        anotherMovie.setTitle("My title");
        anotherHistory.push(anotherMovie.createState());

        anotherMovie.setValues("Title 4", "description 4", 4);
        anotherMovie.restore(anotherHistory.pop());
        anotherMovie.restore(anotherHistory.pop());

        /**
         * Expected output of line below: true, true, true
         */
        System.out.println(anotherMovie.getTitle().equals("Title 3") + ", " +
                anotherMovie.getDescription().equals("description 3") + ", " +
                String.valueOf(anotherMovie.getRate()).equals("3"));

        /**
         * expected output of line below: Tittle 3, description 3, 3
         */
        System.out.println(anotherMovie.toString());
    }
}
