package example.patterns.adapter.exercise;

import example.patterns.adapter.exercise.api.LibraryAPIv2;
import example.patterns.adapter.exercise.api.LibraryAPIv2Impl;

public class AdapterExerciseRun {

    public static void main(String[] args) {
        User user = new User("Paweł","Cwik","32131212");
        LibraryAPIv2 libraryAPIv2 = new LibraryAPIv2Impl();

        APIAdapter apiAdapter = new APIAdapter(libraryAPIv2, user);
        BookConnector connector = new BookConnector(user,apiAdapter);

        connector.checkAviability("Harry Potter i Zakon Feniksa");
    }
}
