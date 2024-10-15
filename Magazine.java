package learnjavaclass;

public class Magazine extends LibraryItem {
private int issueNumber;
private String publisher;
public Magazine(String title, int yearPublished)
{
	super(title, yearPublished);
}
public void setIssueNumber(int x)
{
	this.issueNumber=x;
}
public void setPublisher(String y)
{
	this.publisher=y;
}
public void getDitails()
{
	System.out.println("Tieu de: "+this.getTitle());
	System.out.println("nam xuat ban: "+this.getYearPublished());
	System.out.println("so phat hanh: "+this.issueNumber);
	System.out.println("nha xuat ban: "+this.publisher);
	
}
}
