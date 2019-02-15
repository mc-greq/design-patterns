package example.patterns.adapter.exercise.api;

import java.time.LocalDate;

public interface LibraryAPI {

    boolean isAvailable(String bookTitle);

    LocalDate dueDate(String bookTitle, String pesel);

    boolean reserve(String bookTitle, String pesel);

}