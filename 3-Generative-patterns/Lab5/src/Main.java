public class Main {
    private static Controller controller;

    public static void main(String[] args) {
        controller = new Controller(new AccountCollection());

        controller.accountCollection
                .add(new Account.Builder()
                        .BuildLogin("login")
                        .BuildPassword("password")
                        .getResult());

        new RegistrationDialog.Builder()
                .BuildController(controller)
                .BuildProperties()
                .getResult()
                .Show();
    }
}
