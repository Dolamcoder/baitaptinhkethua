package learnjavaclass;

public class LibraryItem {
private String title;
private int yearPublished;
public LibraryItem(String title, int yearPublished)
{
	this.title=title;
	this.yearPublished=yearPublished;
}
public void setTitle(String a)
{
	this.title=a;
}
public void setYearPublished(int b)
{
	this.yearPublished=b;
}
public String getTitle()
{
	return this.title;
}
public int getYearPublished()
{
	return this.yearPublished;
}

}
