package HomeWork4;

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
    Book[] books = new Book[10];
    int count = 0;

    Reader(String fullName) {
        this.fullName = fullName;
    }

    void takeBook(Book book) {
        if (count < books.length) {
            books[count] = book;
            count++;
            System.out.println(fullName + " took the book " + book.name);
        }
    }

    void returnBook(String name) {
        for (int i = 0; i < count; i++) {
            if (books[i] != null && books[i].name.equals(name)) {
                System.out.println(fullName + " returned the book " + name);
                books[i] = null;
                return;
            }
        }
        System.out.println(fullName + " doesn't have a book " + name);
    }

    void printStatus() {
        System.out.print(fullName + " took " + count + " books: ");
        for (int i = 0; i < count; i++) {
            if (books[i] != null) {
                System.out.print(books[i].name + " ");
            }
        }
        System.out.println();
    }
}

class Main {
    public static void main(String[] args) {
        Book b1 = new Book("Мастер и Маргарита", "Булгаков");
        Book b2 = new Book("Война и Мир", "Толстой");

        Reader r = new Reader("Петров В.В.");

        r.takeBook(b1);
        r.takeBook(b2);
        r.printStatus();
        r.returnBook("Мастер и Маргарита");
        r.returnBook("Игра Эндера");
        r.printStatus();
    }
}

