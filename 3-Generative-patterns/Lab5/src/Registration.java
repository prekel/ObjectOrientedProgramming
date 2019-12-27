import javax.swing.*;
import java.util.Collection;


public class Registration {
    enum Status {
        Success,
        BadLogin,
        LoginIsExist,
        PasswordsAreNotSame,
        BadPassword,
    }

    private Collection<Account> accountCollection;

    private Status status;

    private Account registeredAccount;

    public Status getStatus() {
        return status;
    }

    public String getStatusMessage() {
        if (getStatus() == Registration.Status.Success) {
            return "Успешно зарегестрировано";
        }
        if (getStatus() == Registration.Status.BadLogin) {
            return "Недопустимый логин";
        }
        if (getStatus() == Registration.Status.BadPassword) {
            return "Недопустимый пароль";
        }
        if (getStatus() == Registration.Status.LoginIsExist) {
            return "Пользователь с таким логином уже существует";
        }
        if (getStatus() == Registration.Status.PasswordsAreNotSame) {
            return "Пароли не совпадают";
        }
        return "";
    }

    public Account getRegisteredAccount() {
        return registeredAccount;
    }

    public Registration(Collection<Account> accountCollection) {
        this.accountCollection = accountCollection;
    }

    public boolean TryRegister(String login, String password, String repeatPassword) {
        if (login.length() <= 3) {
            status = Status.BadLogin;
            return false;
        }

        var accountsWithLoginCount = accountCollection
                .stream()
                .filter(p -> p.getLogin().equals(login))
                .count();
        if (accountsWithLoginCount >= 1) {
            status = Status.LoginIsExist;
            return false;
        }

        if (password.length() <= 3) {
            status = Status.BadPassword;
            return false;
        }

        if (!password.equals(repeatPassword)) {
            status = Status.PasswordsAreNotSame;
            return false;
        }

        registeredAccount = new Account.Builder()
                .BuildLogin(login)
                .BuildPassword(password)
                .getResult();

        accountCollection.add(registeredAccount);
        status = Status.Success;
        return true;
    }
}
