package com.ps;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Book book1 = new Book(1,"978-0-7352-1129-2","Atomic Habits", false,"");

        Book book2 = new Book(2,"978-0-9907976-0-9","Think And Grow Rich", false,"");

//        Book book3 = new Book(3,"978-7352-1129-2","Atomic Habits", false,"");
//
//        Book book4 = new Book(4,"978-7352-1129-2","Atomic Habits", false,"");
//
//        Book book5 = new Book(5,"978-7352-1129-2","Atomic Habits", false,"");
//
//        Book book6 = new Book(6,"978-7352-1129-2","Atomic Habits", false,"");
//
//        Book book7 = new Book(7,"978-7352-1129-2","Atomic Habits", false,"");
//
//        Book book8 = new Book(8,"978-7352-1129-2","Atomic Habits", false,"");
//
//        Book book9 = new Book(9,"978-7352-1129-2","Atomic Habits", false,"");
//
//        Book book10 = new Book(10,"978-7352-1129-2","Atomic Habits", false,"");
//
//        Book book11 = new Book(11,"978-7352-1129-2","Atomic Habits", false,"");
//
//        Book book12 = new Book(12,"978-7352-1129-2","Atomic Habits", false,"");
//
//        Book book13 = new Book(13,"978-7352-1129-2","Atomic Habits", false,"");
//
//        Book book14 = new Book(14,"978-7352-1129-2","Atomic Habits", false,"");
//
//        Book book15 = new Book(15,"978-7352-1129-2","Atomic Habits", false,"");
//
//        Book book16 = new Book(16,"978-7352-1129-2","Atomic Habits", false,"");
//
//        Book book17 = new Book(17,"978-7352-1129-2","Atomic Habits", false,"");
//
//        Book book18 = new Book(18,"978-7352-1129-2","Atomic Habits", false,"");
//
//        Book book19 = new Book(19,"978-7352-1129-2","Atomic Habits", false,"");
//
//        Book book20 = new Book(20,"978-7352-1129-2","Atomic Habits", false,"");

        Book[] bookInventory = {book1, book2};

        int command;

        // Store Home Screen
        do {

            System.out.println("Neighborhood Library");
            System.out.println("PLease choose an option");
            System.out.println("\t1) Show Available books");
            System.out.println("\t2) Show checked out books");
            System.out.println("\t3) Exit");

            Scanner scanner = new Scanner(System.in);
            command = scanner.nextInt();

            switch (command) {
                case 1:
                    System.out.println("Available Books!");
                    for(Book book: bookInventory) {
                        System.out.println(book);
                    }

                    int bookCommand;

                    do {

                    System.out.println("Please choose and option");
                    System.out.println("\t1) Select book to check out");
                    System.out.println("\t2) Back to Neighborhood Library");

                    bookCommand = scanner.nextInt();

                    switch(bookCommand) {
                        case 1:

                            Scanner personName = new Scanner(System.in);
                            System.out.println("Enter Your Name:");

                            String checkedOutTo = personName.nextLine();
                            //Set method checkedOutTo

                            Scanner isCheckedOut = new Scanner(System.in);
                            System.out.println("Enter Book id:");

                            int id = scanner.nextInt();
                            // Set method isCheckedOut
                        default:
                            System.out.println("Command not found");
                    }

                    }while (bookCommand != 2);

                    break;
                case 2:
                    System.out.println("Checked Out Books");

                    break;
                default:
                    System.out.println("Command not found");
            }

//            //Show Available books
//            do {
//
//            }while ();
//            //Show checked out books
//            do {
//
//                //check in books
//                do{
//
//                }while ();
//
//            }while();



        } while (command != 3);


    }
}