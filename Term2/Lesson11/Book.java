package Lesson11;

public class Book
  
{
  private String title;
  private String author;
  
  private int year;
  
  public Book()
  {
    this("none", "unknown", 1450);
  }
  
  public Book(String t)
  {
    this(t, "unknown", 1450);
  }
  
  public Book(String t, String a, int y)
  {
    setTitle(t);
    setAuthor(a);
    setYear(y);
  }
  
  public String toString()
  {
    return title + "\n\t" + author + "\n\t" + year;
  }
  
  public void setTitle(String t)
  {
    title = t;
  }
  
  public void setAuthor(String a)
  {
    author = a;
  }
  
  public void setYear(int y)
  {
    year = y;
  }

}
