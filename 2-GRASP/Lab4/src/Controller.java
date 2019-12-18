import java.util.Collection;

public class Controller {
    Collection<Account> accountCollection;

    public Controller(Collection<Account> accountCollection) {
        this.accountCollection = accountCollection;
    }

    public Registration RegisterNewAccount(String login, String password, String repeatPassword) {
        var reg = new Registration(accountCollection);
        reg.TryRegister(login, password, repeatPassword);
        return reg;
    }
}
