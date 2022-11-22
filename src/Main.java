public class Main {
    public static void main(String[] args) {

        Author harper = new Author("Harper", "Lee");
        System.out.println("имя автора - " + harper.getAuthorName()+", фамилия автора - " + harper.getLastName());
        Author kim = new Author("Kim", "Eun Sook");
        System.out.println("имя автора - " + kim.getAuthorName()+", фамилия автора - " + kim.getLastName());

        Book mockingbird=new Book("Mockingbird",harper, 1960);
        System.out.println("название книги - " + mockingbird.getBookNames()+", год выпуска - " + mockingbird.getYearPublishing());
        Book dokkaebi= new Book("Dokkaebi", kim, 2016);
        System.out.println("название книги - " + dokkaebi.getBookNames()+", год выпуска - " + dokkaebi.getYearPublishing());


        mockingbird.setYearPublishing(1987);
        System.out.println("измененый год книги Mockingbird - " + mockingbird.getYearPublishing());
        dokkaebi.setYearPublishing(1238);
        System.out.println("измененый год книги Dokkaebi - " + dokkaebi.getYearPublishing());

    }
}