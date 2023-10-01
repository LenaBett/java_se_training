package com.systechafrica.assignments.libraryMS;

import com.systechafrica.assignments.shoppos.Connector;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Library {

    private static Scanner scanner = new Scanner(System.in);

    Connector connector = new DbConnector();


    public static void main(String[] args) {
        Library library = new Library();

        if (!library.loginAttempt()) {
            return;
        }

        library.displayMenu();

    }

    public boolean loginAttempt() {
        LoginLms login = new LoginLms();
        return login.login();
    }

    public void displayMenu() {
        scanner = new Scanner(System.in);
        System.out.println("");
        System.out.println("-----------------------");
        System.out.println("");
        System.out.println(" SYSTECH LIBRARY MANAGEMENT SYSTEM");
        System.out.println("");
        System.out.println("-----------------------");
        System.out.println("");
        System.out.println("1. Borrow a book");
        System.out.println("2. View borrowed books");
        System.out.println("3. Return a book");
        System.out.println("4. Quit");
        System.out.println("");
        System.out.println("Choose an Option");

        String selectedOption = scanner.nextLine();

        switch (selectedOption) {
            case "1":
                borrowBook();
                break;
            case "2":
                viewBorrowedBooks();
                break;
            case "3":
                returnBook();
            case "4":
                return;
        }

        displayMenu();
    }


    public void borrowBook() {
        System.out.println("Please enter the student number: ");
        String number = scanner.nextLine();
        Student student = fetchStudent(number);

        if (!student.isAllowed()) {
            System.out.println("Student not allowed to borrow books. Visit office");
        } else {
            System.out.println("Please enter the ISBN: ");
            String isbn = scanner.nextLine();
            Book book = fetchBook(isbn);
            if (isbn == null) {
                System.out.println("Book not found");
                return;
            } else {
                try {
                    String selectQuery = "select * from book where isbn = ?";
                    PreparedStatement preparedStatement = connector.prepareStatement(selectQuery);
                    preparedStatement.setString(1, isbn);
                    preparedStatement.execute();

                    ResultSet resultSet = preparedStatement.getResultSet();
                    while (resultSet.next()) {
                        String isbn1 = resultSet.getString("isbn");
                        String title1 = resultSet.getString("title");
                        String status1 = resultSet.getString("status");


                        String updateQuery = "update book set status = 'Borrowed' WHERE isbn = ? ";
                        preparedStatement = connector.prepareStatement(updateQuery);
                        preparedStatement.setString(1, isbn);
                        preparedStatement.execute();

                        System.out.println("Book has been borrowed.");

                        System.out.println("Borrow another book: Y. Yes N. No");
                        String borrowAnotherBook = scanner.next();
                        if ("Y".equals(borrowAnotherBook)) {
                            borrowBook();
                        } else {
                            displayMenu();
                        }

                        resultSet.close();

                        preparedStatement.close();

                        connector.close();
                    }
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    private Book fetchBook(String isbn) {
        try {
            String selectQuery = "select * from book where isbn = ?";

            PreparedStatement preparedStatement = connector.prepareStatement(selectQuery);
            preparedStatement.setString(1, isbn);
            preparedStatement.execute();

            ResultSet resultSet= preparedStatement.getResultSet();
            resultSet.next();
            String isbn1 = resultSet.getString("isbn");
            String title = resultSet.getString("title");
            String status = resultSet.getString("status");

                Book book = new Book(isbn, title, status);

                resultSet.close();

                preparedStatement.close();

                connector.close();

                return book;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

        private List<Book> viewBorrowedBooks() {
        try {
            String fetchQuery = "select * from book where status = 'Borrowed'";
            PreparedStatement preparedStatement = connector.prepareStatement(fetchQuery);
            preparedStatement.execute();

            ResultSet resultSet = preparedStatement.getResultSet();
            ArrayList<Book> books = new ArrayList<>();
            while (resultSet.next()) {
                String isbn = resultSet.getString("isbn");
                String title = resultSet.getString("title");
                String status = resultSet.getString("status");
                books.add(new Book(isbn, title, status));

                System.out.println(isbn +" | "+ title +" | "+ status);
            }

            resultSet.close();

            preparedStatement.execute();

            preparedStatement.close();

            connector.close();

            return books;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }



    public void returnBook() {

        System.out.println("Please enter the ISBN: ");
        String isbn = scanner.nextLine();
        try {
            String updateQuery = "update book set status = 'Available' where isbn = ?";

            PreparedStatement preparedStatement = connector.prepareStatement(updateQuery);
            preparedStatement.setString(1, isbn);
            preparedStatement.execute();

            System.out.println("Book status updated.");

            System.out.println("Do you want to continue: Y. Yes N. No");
            String toContinue = scanner.next();
            if ("Y".equals(toContinue)) {
                displayMenu();
            } else {
                return;
            }

            preparedStatement.close();

            connector.close();


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private Student fetchStudent(String number) {
        try {
            String selectQuery = "select * from student where number = ?";

            PreparedStatement preparedStatement = connector.prepareStatement(selectQuery);
            preparedStatement.setString(1, number);
            preparedStatement.execute();

            ResultSet resultSet= preparedStatement.getResultSet();
            resultSet.next();
            String number1 = resultSet.getString("number");
            String name = resultSet.getString("name");
            String status = resultSet.getString("status");

            Student student = new Student(number1, name, status);

            resultSet.close();

            preparedStatement.close();

            connector.close();

            return  student;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}