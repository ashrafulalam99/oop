class Book {
    private String title;
    private String author;

    public Book(String title) 
    {
        this.title = title;
        this.author = "Unknown"; 
    }

    public Book(String title, String author) 
    {
        this.title = title;
        this.author = author;
    }

    public void displayBook() 
    {
        System.out.println("Title: " + title + ", Author: " + author);
    }

    public static void main(String[] args) 
    {
        Book book1 = new Book("Learning Java");
        Book book2 = new Book("Core concept of OOP", "Roger Smith");

        book1.displayBook();
        book2.displayBook();
    }
}

