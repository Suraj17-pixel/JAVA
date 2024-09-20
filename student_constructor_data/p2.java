package student_constructor_data;

class Book {
    int bookid;
    String bookname;
    int bookprice;

    Book(int x, String y, int z) {
        bookid = x;
        bookname = y;
        bookprice = z;
    }

    void printdata() {
        System.out.println("Bookid = " + bookid + ", Bookname = " + bookname + ", Bookprice = " + bookprice);
    }
}

public class p2 {
    public static void main(String[] args) {
        Book b1 = new Book(1,"bhavatgita",6999);
        Book b2 = new Book(2,"mahabharat",5999);
        Book b3 = new Book(3,"pokemon",999);
        Book b4 = new Book(4, "mcu", 389);
        Book b5 = new Book(5, "spider_man", 400);

        b1.printdata();
        b2.printdata();
        b3.printdata();
        b4.printdata();
        b5.printdata();
    } 
}