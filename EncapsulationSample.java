public class EncapsulationSample {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setStudentId(2310685);
        student1.setName("Marjorie B. Carbonlla");

        System.out.println("Student ID: " + student1.getStudentId());
        System.out.println("Name: " + student1.getName());

        Book book1 = new Book();
        book1.setBookNumber(1);
        book1.setTitle("I Love You Since 1892 ");
        book1.setAuthor("Binibining Mia");
        book1.setPrice(500.99);

        System.out.println("\nBook Details:");
        System.out.println("Book Number: " + book1.getBookNumber());
        System.out.println("Title: " + book1.getTitle());
        System.out.println("Author: " + book1.getAuthor());
        System.out.println("Price: Php" + book1.getPrice());
    }
}


class Student {
    private int Student_Id;
    private String Name;

    public void setStudentId(int Student_Id) {
        this.Student_Id = Student_Id;
    }
    public int getStudentId() {
        return Student_Id;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getName() {
        return Name;
    }
}
class Book {
    private int book_number;
    private String title;
    private String author;
    private double price;

    public void setBookNumber(int book_number) {
        this.book_number = book_number;
    }
    public int getBookNumber() {
        return book_number;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getAuthor() {
        return author;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public double getPrice() {
        return price;
    }
}