package Model;

public class Book {
    private long id;
    private String name;
    private String author;
    private String publication;
    private int year;
    private int pages;
    private int price;

    public Book(long id, String name, String author, String publication, int year, int pages, int price) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publication = publication;
        this.year = year;
        this.pages = pages;
        this.price = price;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublication() {
        return publication;
    }

    public void setPublication(String publication) {
        this.publication = publication;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}
