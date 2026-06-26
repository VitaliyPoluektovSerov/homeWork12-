//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        Author author001 = new Author("Даниэль", "Дэфо");
        Author author002 = new Author("Александр", "Пушкин");
        Book book001 = new Book("Робинзон Крузо", author001, 1980);
        Book book002 = new Book("Сказка о царе Салтане", author002, 2010);
        // проверяем геттеры
        System.out.println("Книга 1 - " + book001.getTitle() + " автор " + author001.getName() + " " + author001.getSurname() + " год публикации " + book001.getYearPublic());
        System.out.println("Книга 2 - " + book002.getTitle() + " автор " + author002.getName() + " " + author002.getSurname() + " год публикации " + book002.getYearPublic());
        // проверяем сеттер
        book001.setYearPublic(1999);
        book002.setYearPublic(1999);
        System.out.println("Книга 1 - " + book001.getTitle() + " автор " + author001.getName() + " " + author001.getSurname() + " год публикации " + book001.getYearPublic());
        System.out.println("Книга 2 - " + book002.getTitle() + " автор " + author002.getName() + " " + author002.getSurname() + " год публикации " + book002.getYearPublic());
    }
}

// создаем класс Book
class Book {
    private String title;
    private Author author;
    private int yearPublic;

    public Book(String title, Author author, int yearPublic) {
        this.title = title;
        this.author = author;
        this.yearPublic = yearPublic;
    }

    public String getTitle() {
        return this.title;
    }

    public Author getAuthor() {
        return this.author;
    }

    public int getYearPublic() {
        return this.yearPublic;
    }

    public void setYearPublic(int yearPublic) {
        this.yearPublic = yearPublic;
    }

}

// создаем класс Author
class Author {
    private String name;
    private String surname;

    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }


}
