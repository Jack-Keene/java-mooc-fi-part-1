public class Book {
    private String name;
    private String year;
    private int pages;
    
    public Book(String name, String year, int pages) {
        this.name = name;
        this.year = year;
        this.pages = pages;
    }

    public String getName() {
        return this.name;
    }

    public String getYear() {
        return this.year;
    }

    public int getPages() {
        return this.pages;
    }


    
}
