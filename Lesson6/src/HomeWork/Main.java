package HomeWork;

public class Main {

    public static void main(String[] args) {
        Book adventure = new Book("Приключения", "Роберт Льюис");
        Book dictionary = new Book("Словарь", "А.Н.Щукин");
        Book encyclopedia = new Book("Энциклопедия", "Бернар Вербер");

        Reader ivanov = new Reader("Иванов И. И.", 5535, "Прикладных наук", "31.07.1994", "88888888888");
        Reader petrov = new Reader("Петров П. П.", 6666, "Гриффиндор", "05.06.1990", "77777777777");

        ivanov.takeBook(3);
        ivanov.takeBook("Азбука", "Грокаем алгоритмы");
        ivanov.takeBook(adventure,dictionary,encyclopedia);
        ivanov.returnBook(3);
        ivanov.returnBook("Азбука", "Грокаем алгоритмы");
        ivanov.returnBook(adventure,dictionary,encyclopedia);
    }








}
