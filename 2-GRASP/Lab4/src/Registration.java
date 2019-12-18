import java.util.Collection;


public class Registration {
    enum Status
    {
        Success,
        BadLogin,
        LoginIsExist,
        PasswordsAreSame,
        BadPassword,
    }

    private Collection<Account> _accountCollection;

    private Status _status;

    private Account _registeredAccount;

    public Status getStatus()
    {
        return _status;
    }

    public Account getRegisteredAccount()
    {
        return _registeredAccount;
    }

    public Registration(Collection<Account> accountCollection) {
        _accountCollection = accountCollection;
    }

    public boolean TryRegister(String login, String password, String repeatPassword)
    {
        if (login.length() <= 3)
        {
            _status = Status.BadLogin;
            return false;
        }

        var accountsWithLoginCount = _accountCollection.stream().filter(p -> p.getLogin().equals(login)).count();
        if (accountsWithLoginCount >= 1)
        {
            _status = Status.LoginIsExist;
            return false;
        }

        if (!password.equals(repeatPassword))
        {
            _status = Status.PasswordsAreSame;
            return false;
        }

        if (password.length() <= 3)
        {
            _status = Status.BadPassword;
        }

        _registeredAccount = new Account(login, password);
        _accountCollection.add(_registeredAccount);
        _status = Status.Success;
        return true;
    }
}
