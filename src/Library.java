public class Library {
    private Book[] library;
    public int callBookCount = 0;

    public Library(int booksLength) {
        this.library = new Book[booksLength];
    }

    public void addBook(Book book) {
        if (callBookCount < 5 && callBookCount < library.length) {
            for (int i = 0; i < library.length; i++) {
                if (library[i] == null) {
                    library[i] = book;
                    callBookCount++;
                    break;
                }
            }
        } else {
            System.out.println("Метод вызывается более 5 раз");
        }
    }

    @Override
    public String toString() {
        if (library[0] != null) {
            for (int i = 0; i < library.length; i++) {
                if (i < library.length - 1) {
                    System.out.println("Book: " + library[i].getNameBook() + " by Author: " + library[i].getAuthor());
                } else {
                    return "Book: " + library[i].getNameBook() + " by Author: " + library[i].getAuthor();
                }
            }
        }
        return "Книги в массиве отсутствуют";
    }
}
