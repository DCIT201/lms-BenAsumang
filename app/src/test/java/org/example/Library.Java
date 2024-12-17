class Library {
    private List<Book> books;
    private List<Patron> patrons;

    public Library(){
        books = new ArrayList<>();
        patrons = new ArrayList<>();
    }
    public void addBook(Book book){
        books.add(book);
        Sytem.out.println("Books added:" + book.getTittle());
    }
    public void addPatron(Patron patron){
        patrons.add(patron);
        System.out.println("Patrin added: " + patron.getName());
    }
    public void displayBooks(){
        System.out.println("Books in the library:");
        for (Book book ) {
            System.out.println("-" + book.getTittle()) + " by "
                    + book.getAuthor() +"(Published:"
                    + book.getYearPublished() + ")";
        }
    }
    public void displayPatrons(){
        Sytem.out.println("Patrons of the library:");
        for (Patron patron : patrons){
            System.out.println(" - " + patron.getName() +
                    "ID: " + patron.getId() + ")");

        }
    }
}