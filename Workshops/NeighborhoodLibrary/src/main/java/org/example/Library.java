package org.example;

public class Library {
    //Books
    public Book[] inventory(){
        Book[] books = new Book[20];
        books[0] = new Book(1,"978-1569319017","One Piece, Vol. 1: Romance Dawn");
        books[1] = new Book(2,"978-1591160571","One Piece, Vol. 2: Buggy the Clown");
        books[2] = new Book(3,"978-1591161844","One Piece, Vol. 3: Don't Get Fooled Again");
        books[3] = new Book(4,"978-1591163374","One Piece Vol. 4: The Black Cat Pirates");
        books[4] = new Book(5,"978-1591166153","One Piece, Vol. 5: For Whom the Bell Tolls");
        books[5] = new Book(6,"978-1591167235","One Piece, Vol. 6: The Oath");
        books[6] = new Book(7,"978-1591168522","One Piece, Vol. 7: The Crap-Geezer");
        books[7] = new Book(8,"978-1421500751","One Piece, Vol. 8: I Won't Die");
        books[8] = new Book(9,"978-1421501918","One Piece, Vol. 9: Tears");
        books[9] = new Book(10,"978-1421504063","One Piece, Vol. 10: OK, Let's Stand Up!");
        books[10] = new Book(11,"978-1421506630","One Piece, Vol. 11: The Meanest Man in the East");
        books[11] = new Book(12,"978-1421506647","One Piece, Vol. 12: The Legend Begins");
        books[12] = new Book(13,"978-1421506654","One Piece, Vol. 13: It's All Right!");
        books[13] = new Book(14,"978-1421510910","One Piece, Vol. 14: Instinct");
        books[14] = new Book(15,"978-1421510927","One Piece, Vol. 15: Straight Ahead!");
        books[15] = new Book(16,"978-1421510934","One Piece, Vol. 16: Carrying On His Will");
        books[16] = new Book(17,"978-1421515113","One Piece, Vol. 17: Hiruluk's Cherry Blossoms");
        books[17] = new Book(18,"978-1421515120","One Piece, Vol. 18: Ace Arrives");
        books[18] = new Book(19,"978-1421515137","One Piece, Vol. 19: Rebellion");
        books[19] = new Book(20,"978-1421515144","One Piece, Vol. 20 (20)");
        return books;
    }
}
