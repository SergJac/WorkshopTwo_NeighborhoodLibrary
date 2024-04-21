package com.ps;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Book book1 = new Book(1,"9780735211292","Atomic Habits", false,"");

        Book book2 = new Book(2,"9780990797609","Think And Grow Rich", false,"");

        Book book3 = new Book(3,"9780048231888","The Hobbit, or There and Back Again", false,"");

        Book book4 = new Book(4,"9780156012072","The Little Prince", false,"");

        Book book5 = new Book(5,"9780545010221","Harry Potter and the Deathly Hallows", false,"");

        Book book6 = new Book(6,"9780140430547","A Tale of Two Cities", false,"");

        Book book7 = new Book(7,"9781408261200","And Then There Were None", false,"");

        Book book8 = new Book(8,"9780307474278","The Da Vinci Code", false,"");

        Book book9 = new Book(9,"9781616120351","Dream of the Red Chamber", false,"");

        Book book10 = new Book(10,"9780395647400","The Lord of the Rings", false,"");

        Book book11 = new Book(11,"9780393090185","Don Quixote", false,"");

        Book book12 = new Book(12,"9780345803481","Fifty Shades of Grey", false,"");

        Book book13 = new Book(13,"9780008283643","he Alchemist", false,"");

        Book book14 = new Book(14,"9780553149661","The Catcher in the Rye", false,"");

        Book book15 = new Book(15,"9780198185215","Nineteen Eighty-Four", false,"");

        Book book16 = new Book(16,"9780681007703","Anne of Green Gables", false,"");

        Book book17 = new Book(17,"9780141345659","The Fault in Our Stars", false,"");

        Book book18 = new Book(18,"9780735219755","The Girl on the Train", false,"");

        Book book19 = new Book(19,"9780241372661","The Very Hungry Caterpillar", false,"");

        Book book20 = new Book(20,"9780060173227","To Kill a Mockingbird", false,"");

        Book[] bookInventory = {book1, book2, book3, book4, book5, book6, book7, book8, book9, book10, book11, book12, book13, book14, book15, book16, book17, book18, book19, book20};

        int command;

        // Store Home Screen
        do {

            System.out.println("Neighborhood Library");
            System.out.println("Please choose an option");
            System.out.println("\t1) Show Available books");
            System.out.println("\t2) Show checked out books");
            System.out.println("\t3) Exit");

            Scanner scanner = new Scanner(System.in);
            command = scanner.nextInt();

            switch (command) {
                case 1:
                    System.out.println("Available Books:");
                    for(Book book: bookInventory) {
                        System.out.println(book);
                    }

                    System.out.println();

                    //Show Available books
                    int bookCommand;

                    do {

                    System.out.println("Please choose and option");
                    System.out.println("\t1) Select book to check out");
                    System.out.println("\t2) Back to Neighborhood Library");

                    Scanner scanner2 = new Scanner(System.in);
                    bookCommand = scanner2.nextInt();

                    switch(bookCommand) {
                        case 1:

                            Scanner scanner3 = new Scanner(System.in);

                            System.out.println("To check out book enter book id:");

                            int id = scanner3.nextInt();

                            // Search for the object with the specified ID in the array
                            Book selectedBook = null;
                            for (Book book: bookInventory) {
                                if (book.getId() == id) {
                                    selectedBook = book;
                                    break;
                                }
                            }

                            // Check if the object with the specified ID was found
                            if (selectedBook != null) {

                                System.out.println("Please enter your name:");

                                String newName = scanner3.next();

                                selectedBook.setCheckedOutTo(newName);

                            } else {

                            }

                            if (selectedBook != null) {

                                selectedBook.setCheckedOut(true);

                            } else {

                            }

                            System.out.println();

                            System.out.println("Recently Checked Out Books:");

                            for(Book book: bookInventory) {
                                System.out.println(book);
                            }

                            System.out.println();

                            System.out.println("Selected Book: " + selectedBook.getTitle() + " Checked Out Successfully By: " + selectedBook.getCheckedOutTo());

                            System.out.println();

                            break;

                        default:
                    }

                    }while (bookCommand != 2);

                    break;

                case 2:
                    System.out.println("Currently Checked Out Books:");
                    for(Book checkedOutBook: bookInventory) {
                        System.out.println(checkedOutBook);
                    }

                    System.out.println();

                    //Show checked out books
                    int checkedOutBookCommand;

                    do {

                        System.out.println("Please choose and option");
                        System.out.println("\t1) Check in a book");
                        System.out.println("\t2) Back to Neighborhood Library");

                        Scanner scanner4 = new Scanner(System.in);
                        checkedOutBookCommand = scanner4.nextInt();

                    switch (checkedOutBookCommand) {
                        case 1:

                            Scanner scanner5 = new Scanner(System.in);

                            System.out.println("Enter id of checked out book:");

                            int id = scanner5.nextInt();

                            // Search for the object with the specified ID in the array
                            Book selectedBook2 = null;
                            for (Book book: bookInventory) {
                                if (book.getId() == id) {
                                    selectedBook2 = book;
                                    break;
                                }
                            }

                            // Check if the object with the specified ID was found
                            if (selectedBook2 != null) {

                                String emptyName = "null";

                                selectedBook2.setCheckedOutTo(emptyName);

                            } else {

                            }

                            System.out.println();

                            if (selectedBook2 != null) {

                                selectedBook2.setCheckedOut(false);

                            } else {

                            }

                            System.out.println("Recent Checked In Books:");

                            for(Book book: bookInventory) {
                                System.out.println(book);
                            }

                            System.out.println();

                            System.out.println("Checked Out Book: " + selectedBook2.getTitle() + " Checked In Successfully!");

                            System.out.println();

                            break;
                    }

                    } while (checkedOutBookCommand != 2);

                    break;

                default:
            }

        } while (command != 3);

    }

}