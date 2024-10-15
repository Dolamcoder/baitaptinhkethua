package learnjavaclass;

public class Book extends LibraryItem {
	public Book(String title, int yearPublished) {
		super(title, yearPublished);
	}
	private String author;
	private int isbn;
	public void setAuthor(String author)
	{
		this.author=author;
	}
	public void setIsbn(int isbn)
	{
		this.isbn=isbn;
	}
	public void getDetails()
	{
		System.out.println("tieu de : "+super.getTitle());
		System.out.println("nam xuat ban la: "+super.getYearPublished());
		System.out.println("tac gia: "+this.author);
		System.out.println("ma so: "+this.isbn);
		
	}
}
