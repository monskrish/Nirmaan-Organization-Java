package Day5;

public class Library {

    int id;
    String bookName;
    double price;
    String authorName;

    public static void main(String[] args) {

        Library l1 = new Library();

        l1.id = 1;
        l1.bookName = "History of Violence";
        l1.price = 3599;
        l1.authorName = "John Wagner";

        Library l2 = new Library();

        l2.id = 2;
        l2.bookName = "Old Boy";
        l2.price = 899;
        l2.authorName = "Park Chon";

        Library l3 = new Library();

        l3.id = 3;
        l3.bookName = "The Walking Dead";
        l3.price = 4399;
        l3.authorName = "Robert Kirkman";


        System.out.println("Book id : "+l1.id);
        System.out.println("Book Name : "+l1.bookName);
        System.out.println("Book Price : "+l1.price);
        System.out.println("Book Author : "+l1.authorName);

        System.out.println("\nBook id : "+l2.id);
        System.out.println("Book Name : "+l2.bookName);
        System.out.println("Book Price : "+l2.price);
        System.out.println("Book Author : "+l2.authorName);

        System.out.println("\nBook id : "+l3.id);
        System.out.println("Book Name : "+l3.bookName);
        System.out.println("Book Price : "+l3.price);
        System.out.println("Book Author : "+l3.authorName);

    }
}
