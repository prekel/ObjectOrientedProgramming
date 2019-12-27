public class Account {
    private String login;
    private String password;

    public String getLogin() {
        return login;
    }

    private void setLogin(String login) {
        this.login = login;
    }

    public boolean isPasswordMatch(String password) {
        return this.getPassword().equals(password);
    }

    private String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static class Builder extends AbstractBuilder<Account> {
        public Builder() {
            result = new Account();
        }

        public Builder BuildLogin(String login) {
            getResult().setLogin(login);
            return this;
        }

        public Builder BuildPassword(String password) {
            getResult().setPassword(password);
            return this;
        }
    }

    private Account() {

    }
}
