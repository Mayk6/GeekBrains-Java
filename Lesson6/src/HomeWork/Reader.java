package HomeWork;
import java.util.Arrays;

//Определить класс Reader, хранящий такую информацию о пользователе библиотеки:
//        1. ФИО,
//        2. номер читательского билета,
//        3. факультет,
//        4. дата рождения,
//        5. телефон.
//        6. Методы (экземпляра, без слова static)  takeBook(), returnBook().
//        7. Разработать программу, в которой создается массив объектов данного класса.
//        8. Перегрузить методы takeBook(), returnBook():
//        - takeBook, который будет принимать количество взятых книг. Выводит на консоль сообщение "Петров В. В. взял 3 книги".
//        - takeBook, который будет принимать переменное количество названий книг. Выводит на консоль сообщение "Петров В. В. взял книги: Приключения, Словарь, Энциклопедия".
//        - takeBook, который будет принимать переменное количество (Тип... parameterName) объектов класса Book (создать новый класс, содержащий имя и автора книги). Выводит на консоль сообщение "Петров В. В. взял книги: Приключения, Словарь, Энциклопедия".
//        9. Аналогичным образом перегрузить метод returnBook(). Выводит на консоль сообщение "Петров В. В. вернул книги: Приключения, Словарь, Энциклопедия". Или  "Петров В. В. вернул 3 книги".
public class Reader {
    private String fio;
    private int numLitCard;
    private String faculty;
    private String dateOfBirth;
    private String phone;

    public Reader(String fio, int numLitCard, String faculty, String dateOfBirth, String phone) {
        this.fio = fio;
        this.numLitCard = numLitCard;
        this.faculty = faculty;
        this.dateOfBirth = dateOfBirth;
        this.phone = phone;
    }


    public void takeBook(int amount) {
        System.out.printf("%s взял %d книги\n", fio, amount);
    }

    public void returnBook(int amount) {
        System.out.printf("%s вернул %d книги\n", fio, amount);
    }

    public void takeBook(String... books) {
        System.out.printf("%s взял книги: %s\n", fio, Arrays.toString(books).replaceAll("\\[|\\]", ""));
    }

    public void returnBook(String... books) {
        System.out.printf("%s вернул книги: %s\n", fio, Arrays.toString(books).replaceAll("\\[|\\]", ""));
    }

    public void takeBook(Book... books) {
        System.out.printf("%s взял книги: %s \n", fio, Arrays.toString(books).replaceAll("\\[|\\]", ""));
    }

    public void returnBook(Book... books) {
        System.out.printf("%s вернул книги: %s\n", fio, Arrays.toString(books).replaceAll("\\[|\\]", ""));
    }

    @Override
    public String toString() {
        return "Читатель:" +
                "Фио='" + fio + '\'' +
                ", Номер читательского билета=" + numLitCard +
                ", Факультет='" + faculty + '\'' +
                ", Дата рождения='" + dateOfBirth + '\'' +
                ", Телефон='" + phone + '\'' +
                '}';
    }
}
