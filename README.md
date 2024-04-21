# Neighborhood Library

## Understanding the Assignment
- Inputs 
  - User Inputs
- Outputs
  - CLI
- Creating a Program that keeps an inventory of the neighborhood library's twenty books with:
  - User interface
  - A Main class that uses an array to hold an inventory of the total number of books and a menu commands made simple for the user.
  - A Book class that has important properties

## Program Layout
    
    // Inputs
        // Using Scanner to take in initial user menu command
        // First asking if they would choose to be shown the available books or to be shown the checked out books or if they would like to exit the program

         // If the user chooses the first option to be shown the available books then a list of all the library's books are shown
    
                // This list displays all the books ID numbers, ISBN numbers, the title of the book, whether the book is checked out, and by whom the book is checked out
                // The user is then prompt to either select a book to check out or to exit and go back to the home screen
              
                    // If the user wishes to check out a book they are asked for the given id of the book they wish to check out and then prompt for their name
                    // Once they have entered the appropriate information they are given a list of recently checked out books and a message that says their selected book has been successfully checked out
            
                // If the user wishes to return the book and check it into the library's inventory they may return to the home screen and select the second option to be shown checked out books
                
                    // If the user wishes to check in a book they are shown a list of all the library's books that are checked out

                        // This list displays the book's id, ISBN, Title, whether the book is checked out or not, and the name of the person who has the book checked out
                        // The user is then prompt to check in a book or return to the home screen

                            // If the user chooses the first option to check in a book they are prompt for the ID of the book they want to check in
                            // Once they have entered the ID of the book they wish to check in they are given a list of recently checked in books and a message that says their checked out book has been successfully checked in

   

