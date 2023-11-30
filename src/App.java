public class App {
    public static void main(String[] args) {
        Author tolkien = new Author("John", "Tolkien");
        Author rowling = new Author("Joanne", "Rowling");
        Author king = new Author("Stephen", "King");
        Book theLord = new Book("The Lord of the Rings", tolkien, 1995);
        Book harryPotter = new Book("Harry Potter", rowling, 1997);
        Book theStand = new Book("The Stand", king, 1978);
        //Методы объектов домашка
        Author tolkien2 = new Author("John", "Tolkien");
        System.out.println(tolkien.equals(tolkien2));
        System.out.println(tolkien.equals(rowling));
        System.out.println(tolkien2.hashCode() == tolkien.hashCode());
        System.out.println(king);
        Book theStand2 = new Book("The Stand", king, 1978);
        System.out.println(theStand2.equals(theStand));
        System.out.println(theStand2.equals(theLord));
        System.out.println(theStand.hashCode() == theStand2.hashCode());
        System.out.println(theStand.hashCode() == harryPotter.hashCode());
        System.out.println(harryPotter);
    }
}

