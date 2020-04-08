package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book schildt = new Book("Schildt", 866);
        Book horstmann = new Book("Horstmann", 1377);
        Book cleancode = new Book("Clean Code", 679);
        Book sierra = new Book("Sierra", 708);
        Book[] books = new Book[4];
        books[0] = schildt;
        books[1] = horstmann;
        books[2] = cleancode;
        books[3] = sierra;
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i].getName() + " - " + books[i].getPages());
        }
        System.out.println("Swap Schildt and Sierra.");
        Book temp = books[0];
        books[0] = books[3];
        books[3] = temp;
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i].getName() + " - " + books[i].getPages());
        }
        System.out.println("Shown only Clean Code");
        for (int i = 0; i < books.length; i++) {
            if (books[i].getName().equals("Clean Code")) {
                System.out.println(books[i].getName() + " - " + books[i].getPages());
            }
        }
    }
}
