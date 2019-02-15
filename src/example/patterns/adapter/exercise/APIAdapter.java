package example.patterns.adapter.exercise;

import example.patterns.adapter.exercise.api.LibraryAPI;
import example.patterns.adapter.exercise.api.LibraryAPIv2;

import java.time.LocalDate;

public class APIAdapter implements LibraryAPI {

    private LibraryAPIv2 libraryAPI;
    private User user;

    public APIAdapter(LibraryAPIv2 libraryAPI, User user) {
        this.libraryAPI = libraryAPI;
        this.user = user;
    }

    @Override
    public boolean isAvailable(String bookTitle) {
        return libraryAPI.numberOfAviableCopies(bookTitle) > 0;
    }

    @Override
    public LocalDate dueDate(String bookTitle, String pesel) {
        return libraryAPI.dueDate(bookTitle, user.getFirstName(), user.getLastName(), user.getDateOfBirth());
    }

    @Override
    public boolean reserve(String bookTitle, String pesel) {
        return libraryAPI.reserve(bookTitle, user.getFirstName(), user.getLastName(), user.getDateOfBirth());
    }
}
