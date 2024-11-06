public class UserController {
    private view view;

    public UserController(view view) {
        this.view = view;
    }

    public void processInput() {
        String input = view.getInput();
        String[] data = input.split(" ");

        if (data.length != 6) {
            view.displayError("Неверное количество данных. Введите ровно 6 элементов.");
            return;
        }

        try {
            UserData userData = new UserData(data[0], data[1], data[2], data[3], data[4], data[5]);
            view.displayMessage("Данные успешно введены:\n" + userData);
        } catch (Exception e) {
            view.displayError(e.getMessage());
        }
    }
}
