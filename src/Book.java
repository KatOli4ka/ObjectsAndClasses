public class Book {
    private String bookNames;
    private  int yearPublishing;
    private Author author;

    public Book(String bookNames, Author author, int yearPublishing) {
        this.bookNames = bookNames;
        this.yearPublishing = yearPublishing;
        this.author=author;
            }


    public String getBookNames(){
        return this.bookNames;
    }
    public int getYearPublishing(){
        return this.yearPublishing;    }
    public void setYearPublishing( int yearPublishing){
        this.yearPublishing = yearPublishing;
    }


        
    }
