import java.util.Collection;
import java.util.stream.Collectors;

public class Controller {
    private static Controller instance;

    private Collection<Account> accountCollection;

    public Collection<Account> getAccountCollection() {
        return accountCollection;
    }

    public void setAccountCollection(Collection<Account> accountCollection) {
        this.accountCollection = accountCollection;
    }

    public static Controller getInstance() {
        if (instance == null) {
            instance = new Controller();
        }
        return instance;
    }

    private Controller() {
        setAccountCollection(new AccountCollection());
    }

    public Registration RegisterNewAccount(String login, String password, String repeatPassword) {
        var reg = new Registration(accountCollection);
        reg.TryRegister(login, password, repeatPassword);
        System.out.println(reg.getStatusMessage());
        System.out.println("Зарегистрированные аккаунты (логины): " +
                accountCollection
                        .stream()
                        .map(a -> a.getLogin())
                        .collect(Collectors.joining("; ")));
        return reg;
    }
}
