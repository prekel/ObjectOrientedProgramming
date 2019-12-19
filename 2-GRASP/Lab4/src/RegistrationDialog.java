import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.Arrays;

public class RegistrationDialog extends JDialog {
    private Controller controller;

    private JPanel contentPane;
    private JButton buttonRegister;
    private JButton buttonCancel;
    private JTextField textFieldLogin;
    private JPasswordField passwordField;
    private JPasswordField passwordFieldRepeat;

    public RegistrationDialog() {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonRegister);

        buttonRegister.addActionListener(e -> onRegister());

        buttonCancel.addActionListener(e -> onCancel());

        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                onCancel();
            }
        });

        contentPane.registerKeyboardAction(e -> onCancel(),
                KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0),
                JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
    }

    private void onRegister() {
        var reg = controller.RegisterNewAccount(textFieldLogin.getText(),
                new String(passwordField.getPassword()),
                new String(passwordFieldRepeat.getPassword()));

        if (reg.getStatus() == Registration.Status.Success) {
            JOptionPane.showMessageDialog(this, "Успешно зарегестрировано");
            dispose();
        }
        if (reg.getStatus() == Registration.Status.BadLogin) {
            JOptionPane.showMessageDialog(this, "Недопустимый логин");
        }
        if (reg.getStatus() == Registration.Status.BadPassword) {
            JOptionPane.showMessageDialog(this, "Недопустимый пароль");
        }
        if (reg.getStatus() == Registration.Status.LoginIsExist) {
            JOptionPane.showMessageDialog(this, "Пользователь с таким логином уже существует");
        }
        if (reg.getStatus() == Registration.Status.PasswordsAreNotSame) {
            JOptionPane.showMessageDialog(this, "Пароли не совпадают");
        }
    }

    private void onCancel() {
        dispose();
    }

    public static void main(String[] args) {
        RegistrationDialog dialog = new RegistrationDialog();
        dialog.controller = new Controller(new AccountCollection());
        dialog.controller.accountCollection.add(new Account("login", "password"));
        dialog.setTitle("Регистрация");
        dialog.pack();
        dialog.setVisible(true);
    }
}
