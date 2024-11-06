import java.util.Scanner;

public class view {
    private Scanner scanner = new Scanner(System.in);

    public String getInput() {
        System.out.println("Введите данные в формате: Фамилия Имя Отчество дата рождения номер телефона пол");
        return scanner.nextLine();
    }

    public void displayMessage(String message) {
        System.out.println(message);
    }

    public void displayError(String errorMessage) {
        System.out.println("Ошибка: " + errorMessage);
    }

    public void closeScanner() {
        scanner.close();
    }
}
