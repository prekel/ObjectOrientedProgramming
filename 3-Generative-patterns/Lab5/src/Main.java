public class Main {
    public static void main(String[] args) {
        Controller.getInstance()
                .getAccountCollection()
                .add(new Account.Builder()
                        .BuildLogin("login")
                        .BuildPassword("password")
                        .getResult());

        new RegistrationDialog.Builder()
                .BuildProperties()
                .getResult()
                .Show();
    }
}
