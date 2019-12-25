import java.util.Collection;
import java.util.stream.Collectors;

public class Controller {
    Collection<Account> accountCollection;

    public Controller(Collection<Account> accountCollection) {
        this.accountCollection = accountCollection;
    }

    public Registration RegisterNewAccount(String login, String password, String repeatPassword) {
        var reg = new Registration(accountCollection);
        reg.TryRegister(login, password, repeatPassword);
        System.out.println(reg.getStatusMessage());
        System.out.println("Зарегестрированные аккаунты (логины): " +
                accountCollection
                        .stream()
                        .map(a -> a.getLogin())
                        .collect(Collectors.joining("; ")));
        return reg;
    }
}
