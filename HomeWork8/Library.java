package HomeWork8;

import java.util.ArrayList;

 
    class Book {
        String name;
        String authorName;
    
        Book(String name, String authorName) {
            this.name = name;
            this.authorName = authorName;
        }
    }
    
    class Reader {
        String fullName;
        ArrayList<Book>books = new ArrayList<>();
        int count = 0;
    
        Reader(String fullName) {
            this.fullName = fullName;
        }
    
        void takeBook(Book book) {
            books.add(book);
            System.out.println(fullName + "took the book" + book.name);
        }
    
        void returnBook(String name) {
            for (Book book : books) {
                if (book.name.equals(name)) {
                    books.remove(book);
                    System.out.println(fullName + " returned the book " + name);

                    return;
                }
            }
            System.out.println(fullName + " doesn't have a book " + name);
        }
    
        void printStatus() {
            System.out.print(fullName + " took " + count + " books: ");
            for (Book book : books) {
                    System.out.println(book.name + " ");
                }
            }
        }
    
    
    class Main {
        public void main(String[] args) {
            Book b1 = new Book("Мастер и Маргарита", "Булгаков");
            Book b2 = new Book("Война и Мир", "Толстой");
    
            Reader r = new Reader("Петров В.В.");
    
            r.takeBook(b1);
            r.takeBook(b2);
            r.returnBook("Мастер и Маргарита");
            r.returnBook("Игра Эндера");
            r.printStatus();
        }
    }
    
    

