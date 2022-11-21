public class Book {
    private String bookNames;
    private  int yearPublishing;
    private String author;

    public Book(String bookNames, int yearPublishing, String author) {
        this.bookNames = bookNames;
        this.yearPublishing = yearPublishing;
        this.author = author;
    }


    public String getBookNames(){
        return this.bookNames;
    }
    public int getYearPublishing(){
        return this.yearPublishing;    }
    public String getAuthor() {
        return this.author;
    }
    public void setYearPublishing( int yearPublishing){
        this.yearPublishing = yearPublishing;
    }


        
    }
