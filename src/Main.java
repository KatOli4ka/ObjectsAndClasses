public class Main {
    public static void main(String[] args) {
        //String[]bookNames={"Mockingbird","Dokkaebi"};
        //        int[]yearPublishing={1960,2016};
        //        String [] name={"Harper","Kim"};
        //        String [] lastName={"Lee","Eun Sook"};


        Author harper = new Author("Harper", "Lee");
        System.out.println("имя автора - " + harper.getAuthorName());
        System.out.println("фамилия автора - " + harper.getLastName());
        Author kim = new Author("Kim", "Eun Sook");
        System.out.println("имя автора - " + kim.getAuthorName());
        System.out.println("фамилия автора - " + kim.getLastName());


        Book mockingbird=new Book("Mockingbird", 1960, "Harper Lee");
        System.out.println("название книги - " + mockingbird.getBookNames());
        System.out.println("год выпуска - " + mockingbird.getYearPublishing());
        System.out.println("автор книги - " + mockingbird.getAuthor());
        Book dokkaebi= new Book("Dokkaebi", 2016, "Kim Eun Sook");
        System.out.println("название книги - " + dokkaebi.getBookNames());
        System.out.println("год выпуска - " + dokkaebi.getYearPublishing());
        System.out.println("автор книги - " + dokkaebi.getAuthor());
        mockingbird.setYearPublishing(1987);
        System.out.println("измененый год книги Mockingbird - " + mockingbird.getYearPublishing());
        dokkaebi.setYearPublishing(1238);
        System.out.println("измененый год книги Dokkaebi - " + dokkaebi.getYearPublishing());

    }
}