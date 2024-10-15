package learnjavaclass;

public class testone {

	public static void main(String[] args) {
    LibraryItem lb=new LibraryItem("hello",1999);
    Book book=new Book("JAVA tu duy logic", 1999);
    Magazine mg=new Magazine("hello world", 2003);
    book.setAuthor("DO LAM");
    book.setIsbn(12345);
    System.out.println("BOOK:");
    book.getDetails();
    mg.setIssueNumber(123);
    mg.setPublisher("Viet NAM");
    System.out.println("MAGAZINE:");
    mg.getDitails();
    
    
	}

}
