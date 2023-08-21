public class Main {
    public static void main(String[] args) {

        Author author1 = new Author("Dan Brown");
        Book book1 = new Book(" The Da Vinci Code ", author1, 2003);



        Author author2 = new Author("Daniel Keyes");
        Book book2 = new Book("The Minds of Billy Milligan", author2,1995);


        System.out.println( book1.toString());

        System.out.println( book2.toString());


    }
}
